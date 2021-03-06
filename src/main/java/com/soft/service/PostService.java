package com.soft.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soft.domain.Post;
import com.soft.repository.PostRepository;
import com.soft.service.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;

	public Post findById(String id) {

		Optional<Post> obj = repository.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException("The object requested was not found"));

	}
	
	public List<Post> findByTitle(String title) {
		return repository.findByTitle(title);
	}
	
	public List<Post> fullSearch(String text, Date minDate, Date maxDate) {
		maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
		return repository.fullSearch(text, minDate, maxDate);
	}
}
