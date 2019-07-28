package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Todo {

	@Id
	String id;
	String title;
	Boolean completed;
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Todo(String id, String title, Boolean completed) {
		super();
		this.id = id;
		this.title = title;
		this.completed = completed;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Boolean getCompleted() {
		return completed;
	}
	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}
	
	
}
