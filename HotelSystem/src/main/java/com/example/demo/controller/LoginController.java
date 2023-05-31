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

import com.example.demo.dto.LoginDTO;
import com.example.demo.service.LoginService;

@RestController
@RequestMapping(value="api/v1/login")
@CrossOrigin
public class LoginController{
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/getLogins")
	public List<LoginDTO> getLogin(){
		return loginService.getAllLogins();
	}
	
	@PostMapping("/saveLogin")
	public LoginDTO saveLogin(@RequestBody LoginDTO loginDTO){
		return loginService.saveLogin(loginDTO);
	}
	
	@PostMapping("/updateLogin")
	public LoginDTO updateLogin(@RequestBody LoginDTO loginDTO){
		return loginService.updateLogin(loginDTO);
	}
	
	@DeleteMapping("/deleteLogin")
	public boolean deleteLogin(@RequestBody LoginDTO loginDTO){
		return loginService.deleteLogin(loginDTO);
	}
}
