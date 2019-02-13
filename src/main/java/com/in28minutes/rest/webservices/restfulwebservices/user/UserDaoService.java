package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	public static List<User> users = new ArrayList<>();
	
	private static int usersCount = 3;
	
	static {
		User u1 = new User(1, "Adam", new Date());
		u1.setPosts(Arrays.asList(new Post(1, "post 1"), new Post(2, "post 2")));
		users.add(u1);
		User u2 = new User(2, "Eve", new Date());
		u2.setPosts(Arrays.asList(new Post(3, "post 3"), new Post(4, "post 4")));
		users.add(u2);
		User u3 = new User(3, "Jack", new Date());
		u3.setPosts(Arrays.asList(new Post(5, "post 5")));
		users.add(u3);
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user){
		if (user.getId()==null) 
			user.setId(++usersCount);
		
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		for (User user: users) {
			if (user.getId()==id)
				return user;
		}
		return null;
	}
	
	public User deleteById(int id) {
		Iterator<User> iterator = users.iterator();
		while(iterator.hasNext()) {
			User user = iterator.next();
			if (user.getId()==id) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}

}
