package com.soft.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soft.domain.User;
import com.soft.repository.UserRepository;
import com.soft.service.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(String id) {

		Optional<User> obj = repository.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException("The object requested was not found"));

	}
}
