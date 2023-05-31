package com.example.demo.service;



import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.LoginDTO;
import com.example.demo.entity.Login;
import com.example.demo.repository.LoginRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class LoginService{
	@Autowired
	private LoginRepo loginRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public LoginDTO saveLogin(LoginDTO loginDTO){
		loginRepo.save(modelMapper.map(loginDTO, Login.class));
		return loginDTO;
	}
	
	public List<LoginDTO> getAllLogins(){
		List<Login>loginList=loginRepo.findAll();
		return modelMapper.map(loginList, new TypeToken<List<LoginDTO>>(){}.getType());
	}
	
	public LoginDTO updateLogin(LoginDTO loginDTO){
		loginRepo.save(modelMapper.map(loginDTO, Login.class));
		return loginDTO;
	}
	
	public boolean deleteLogin(LoginDTO loginDTO){
		loginRepo.delete(modelMapper.map(loginDTO, Login.class));
		return true;
	}
}
