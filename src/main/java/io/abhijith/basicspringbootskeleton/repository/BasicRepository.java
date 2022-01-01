package io.abhijith.basicspringbootskeleton.repository;

import io.abhijith.basicspringbootskeleton.model.BasicModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicRepository extends MongoRepository<BasicModel, String> {
}
