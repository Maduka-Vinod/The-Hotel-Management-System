package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BookstayDTO;
import com.example.demo.service.BookstayService;

@RestController
@RequestMapping(value="api/v1/bookstay")
@CrossOrigin
public class BookstayController{
	@Autowired
	private BookstayService bookstayService;
	
	@GetMapping("/getBookstays")
	public List<BookstayDTO> getBookstay(){
		return bookstayService.getAllBookstays();
	}
	
	@PostMapping("/saveBookstay")
	public BookstayDTO saveBookstay(@RequestBody BookstayDTO bookstayDTO){
		return bookstayService.saveBookstay(bookstayDTO);
	}
	
	@PostMapping("/updateBookstay")
	public BookstayDTO updateBookstay(@RequestBody BookstayDTO bookstayDTO){
		return bookstayService.updateBookstay(bookstayDTO);
	}
	
	@DeleteMapping("/updateBookstay")
	public boolean deleteBookstay(@RequestBody BookstayDTO bookstayDTO){
		return bookstayService.deleteBookstay(bookstayDTO);
	}
}
