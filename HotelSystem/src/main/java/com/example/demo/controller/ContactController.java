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

import com.example.demo.dto.ContactDTO;
import com.example.demo.service.ContactService;

@RestController
@RequestMapping(value="api/v1/contact")
@CrossOrigin
public class ContactController{
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/getContacts")
	public List<ContactDTO> getContact(){
		return contactService.getAllContacts();
	}
	
	@PostMapping("/saveContact")
	public ContactDTO saveContact(@RequestBody ContactDTO contactDTO){
		return contactService.saveContact(contactDTO);
	}
	
	@PostMapping("/updateContact")
	public ContactDTO updateContact(@RequestBody ContactDTO contactDTO){
		return contactService.updateContact(contactDTO);
	}
	
	@DeleteMapping("/deleteContact")
	public boolean deleteContact(@RequestBody ContactDTO contactDTO){
		return contactService.deleteContact(contactDTO);
	}
}
