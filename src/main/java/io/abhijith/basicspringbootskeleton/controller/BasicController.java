package io.abhijith.basicspringbootskeleton.controller;

import io.abhijith.basicspringbootskeleton.model.BasicModel;
import io.abhijith.basicspringbootskeleton.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BasicController {

    @Autowired
    BasicService service;

    @GetMapping("/basic/{basicId}")
    public ResponseEntity<BasicModel> getMapping(@PathVariable String basicId) {
        BasicModel basicModel = service.getData(basicId);
        return ResponseEntity.ok(basicModel);
    }

    @PostMapping("/basic")
    public ResponseEntity<String> postMapping(@RequestBody BasicModel basicModel) {
        String id = service.postData(basicModel);
        return ResponseEntity.ok(id);
    }

    @GetMapping("/basic")
    public ResponseEntity<List<BasicModel>> getAllMapping() {
        List<BasicModel> basicModels = service.getAllData();
        return ResponseEntity.ok(basicModels);
    }

}
