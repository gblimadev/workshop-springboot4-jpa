package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Cartegory;
import com.educandoweb.course.repositories.CartegoryRepository;

@Service
public class CartegoryService {

	@Autowired
	private CartegoryRepository repository;

	public List<Cartegory> findAll() {
		return repository.findAll();
	}

	public Cartegory findById(Long id) {
		Optional<Cartegory> obj = repository.findById(id);
		return obj.get();
	}
	
}
