package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Cartegory;

public interface CartegoryRepository extends JpaRepository<Cartegory, Long>{
	
}
