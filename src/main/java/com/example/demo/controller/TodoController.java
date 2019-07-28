package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Todo;
import com.example.demo.repositories.TodoRepository;

@RestController
@RequestMapping(value = "/api")
public class TodoController {
	
	@Autowired
	TodoRepository todoRepository;
	
	// GET all
	@GetMapping(value = "/todos")
	public List<Todo> getTodos() {
		return todoRepository.findAll();
	}
	// GET by id
	@GetMapping(value = "/todos/{id}")
	public Optional<Todo> getTodo(@PathVariable("id") String id) {
		return todoRepository.findById(id);
	}
	// POST
	@PostMapping(value = "/todos")
	public Todo createTodo(@RequestBody Todo todo) {
		return todoRepository.save(todo);
	}
	// PUT
	@PutMapping(value = "/todos/{id}")
	public Todo updateTodo(@PathVariable("id") String id, @RequestBody Todo todo) {
		todo.setId(id);
		return todoRepository.save(todo);
	}
	// DELETE
	@DeleteMapping(value = "/todos/{id}")
	public void deleteTodo(@PathVariable("id") String id) {
		todoRepository.deleteById(id);
	}

}
