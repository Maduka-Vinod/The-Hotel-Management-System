package com.example.demo.service;



import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ContactDTO;
import com.example.demo.entity.Contact;
import com.example.demo.repository.ContactRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ContactService{
	@Autowired
	private ContactRepo contactRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public ContactDTO saveContact(ContactDTO contactDTO){
		contactRepo.save(modelMapper.map(contactDTO, Contact.class));
		return contactDTO;
	}
	
	public List<ContactDTO> getAllContacts(){
		List<Contact>contactList=contactRepo.findAll();
		return modelMapper.map(contactList,new TypeToken<List<ContactDTO>>(){}.getType());
	}
	
	public ContactDTO updateContact(ContactDTO contactDTO){
		contactRepo.save(modelMapper.map(contactDTO, Contact.class));
		return contactDTO;
	}
	
	public boolean deleteContact(ContactDTO contactDTO){
		contactRepo.delete(modelMapper.map(contactDTO, Contact.class));
		return true;
	}

}
