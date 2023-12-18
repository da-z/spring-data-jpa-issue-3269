package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//import javax.persistence.Entity;
//import javax.persistence.Id;

@Entity
public class TestEntity {

    @Id
    public Long id;

}
