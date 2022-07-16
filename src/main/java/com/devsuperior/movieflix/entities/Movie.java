package com.devsuperior.movieflix.entities;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String synopsis;
	
	private Genre genre;
	
	private List<Review> reviews = new ArrayList<>();
	
	public Movie() {
	}
	
	

}
