package io.abhijith.basicspringbootskeleton.service;

import io.abhijith.basicspringbootskeleton.model.BasicModel;

import java.util.List;

public interface BasicService {

    public BasicModel getData(String basicId);

    public String postData(BasicModel basicModel);

    public List<BasicModel> getAllData();

}
