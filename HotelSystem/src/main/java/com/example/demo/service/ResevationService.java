package com.example.demo.service;



import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ResevationDTO;
import com.example.demo.entity.Resevation;
import com.example.demo.repository.ResevationRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ResevationService{
	@Autowired
	private ResevationRepo resevationRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public ResevationDTO saveResevation(ResevationDTO resevationDTO){
		resevationRepo.save(modelMapper.map(resevationDTO, Resevation.class));
		return resevationDTO;
	}
	
	public List<ResevationDTO> getAllResevations(){
		List<Resevation>resevationList=resevationRepo.findAll();
		return modelMapper.map(resevationList,new TypeToken<List<ResevationDTO>>(){}.getType());
	}
	
	public ResevationDTO updateResevation(ResevationDTO resevationDTO){
		resevationRepo.save(modelMapper.map(resevationDTO, Resevation.class));
		return resevationDTO;
	}
	
	public boolean deleteResevation(ResevationDTO resevationDTO){
		resevationRepo.delete(modelMapper.map(resevationDTO, Resevation.class));
		return true;
	}
}
