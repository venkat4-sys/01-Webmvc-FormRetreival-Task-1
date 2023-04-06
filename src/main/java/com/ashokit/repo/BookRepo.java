package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.Book;

public interface BookRepo extends JpaRepository<Book,Integer>{
	
	
	

}
