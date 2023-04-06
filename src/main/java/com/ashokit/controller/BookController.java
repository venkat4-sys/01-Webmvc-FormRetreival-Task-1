package com.ashokit.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ashokit.entity.Book;
import com.ashokit.repo.BookRepo;

@Controller
public class BookController{
	
	@Autowired
	private BookRepo repo;
	
	
	@GetMapping("/abc")
	public ModelAndView getbookdetails(@RequestParam("id") Integer id) {
		
		ModelAndView mav=new ModelAndView();
		
		Optional<Book> findById = repo.findById(id);
		
		if(findById.isPresent()) {
			Book bookk = findById.get();
			//sending data to the view
			mav.addObject("book", bookk);
	}
		
		//setting view page name
		mav.setViewName("index");
		
		return mav;
		
}

}
