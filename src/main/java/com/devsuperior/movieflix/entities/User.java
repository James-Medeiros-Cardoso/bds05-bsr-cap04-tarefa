package com.devsuperior.movieflix.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {
	
	private Long id;
	private String name;
	private String email;
	private String password;
	
	private List<Review> reviews = new ArrayList<>();
	
	private Set<Role> roles=new HashSet<>();

}
