package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Todo;

@Repository
public interface TodoRepository extends MongoRepository<Todo, String>{

}
