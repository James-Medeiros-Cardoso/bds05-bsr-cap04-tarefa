package com.devsuperior.movieflix.entities;

import java.util.ArrayList;
import java.util.List;

public class Genre {
	
	private Long id;
	private String name;
	
	private List<Movie> movies = new ArrayList<>();
	
	public Genre() {
	}

	public Genre(Long id, String name, List<Movie> movies) {
		super();
		this.id = id;
		this.name = name;
		this.movies = movies;
	}

	
	
	

}
