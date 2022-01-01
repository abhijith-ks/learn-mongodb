package io.abhijith.basicspringbootskeleton.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("basic-collection")
public class BasicModel {

    String id;
    String name;
}
