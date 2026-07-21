package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Cartegory;
import com.educandoweb.course.services.CartegoryService;

@RestController
@RequestMapping(value = "/cartegory")
public class CartegoryResource {
	
	@Autowired
	private CartegoryService service;

	@GetMapping
	public ResponseEntity<List<Cartegory>> findAll() {
		List<Cartegory> list = service.findAll();

		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Cartegory> findById(@PathVariable Long id) {
		Cartegory obj = service.findById(id);

		return ResponseEntity.ok().body(obj);
	}
}
