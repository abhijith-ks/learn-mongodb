package io.abhijith.basicspringbootskeleton.service;

import io.abhijith.basicspringbootskeleton.model.BasicModel;
import io.abhijith.basicspringbootskeleton.repository.BasicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicServiceImpl implements BasicService {

    @Autowired
    BasicRepository repository;

    @Override
    public BasicModel getData(String basicId) {

        return repository.findById(basicId).isPresent() ?
                (BasicModel) repository.findById(basicId).get() :
                null;
    }

    @Override
    public String postData(BasicModel basicModel) {
        BasicModel model = repository.save(basicModel);
        return model.getId();
    }

    @Override
    public List<BasicModel> getAllData() {
        return repository.findAll();
    }
}
