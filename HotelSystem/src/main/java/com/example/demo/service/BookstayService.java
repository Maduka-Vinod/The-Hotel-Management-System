package com.example.demo.service;



import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BookstayDTO;
import com.example.demo.entity.Bookstay;
import com.example.demo.repository.BookstayRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class BookstayService{
	@Autowired
	private BookstayRepo bookstayRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public BookstayDTO saveBookstay(BookstayDTO bookstayDTO){
		bookstayRepo.save(modelMapper.map(bookstayDTO, Bookstay.class));
		return bookstayDTO;
	}
	
	public List<BookstayDTO> getAllBookstays(){
		List<Bookstay>bookstayList=bookstayRepo.findAll();
		return modelMapper.map(bookstayList,new TypeToken<List<BookstayDTO>>(){}.getType());
	}
	
	public BookstayDTO updateBookstay(BookstayDTO bookstayDTO){
		bookstayRepo.save(modelMapper.map(bookstayDTO, Bookstay.class));
		return bookstayDTO;
	}
	
	public boolean deleteBookstay(BookstayDTO bookstayDTO){
		bookstayRepo.delete(modelMapper.map(bookstayDTO, Bookstay.class));
		return true;
	}
}
