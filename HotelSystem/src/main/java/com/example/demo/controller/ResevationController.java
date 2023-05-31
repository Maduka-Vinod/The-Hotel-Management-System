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

import com.example.demo.dto.ResevationDTO;
import com.example.demo.service.ResevationService;

@RestController
@RequestMapping(value="api/v1/resevation")
@CrossOrigin
public class ResevationController{
	@Autowired
	private ResevationService resevationService;
	
	@GetMapping("/getResevations")
	public List<ResevationDTO> getResevation(){
		return resevationService.getAllResevations();
	}
	
	@PostMapping("/saveResevation")
	public ResevationDTO saveResevation(@RequestBody ResevationDTO resevationDTO){
		return resevationService.saveResevation(resevationDTO);
	}
	
	@PostMapping("/updateResevation")
	public ResevationDTO updateResevation(@RequestBody ResevationDTO resevationDTO){
		return resevationService.updateResevation(resevationDTO);
	}
	
	@DeleteMapping("/deleteResevation")
	public boolean deleteResevation(@RequestBody ResevationDTO resevationDTO){
		return resevationService.deleteResevation(resevationDTO);
	}
}
