package com.in28minutes.rest.webservices.restfulwebservices.user;

public class Post {

	private Integer id;
	private String description;
//	private User user;
	
	public Post(Integer id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getDescription() {
		return description;
	}
	
	@Override
	public String toString() {
		return "Post [id=" + id + ", description=" + description + "]";
	}
	
	
	
}
