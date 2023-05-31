package com.example.demo.service;





import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dto.SendmsgDTO;
import com.example.demo.entity.Sendmsg;
import com.example.demo.repository.SendmsgRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SendmsgService{
	@Autowired
	private SendmsgRepo sendmsgRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public SendmsgDTO saveSendmsg(SendmsgDTO sendmsgDTO){
		sendmsgRepo.save(modelMapper.map(sendmsgDTO, Sendmsg.class));
		return sendmsgDTO;
	}
	
	public List<SendmsgDTO> getAllSendmsgs(){
		List<Sendmsg>sendmsgList=sendmsgRepo.findAll();
		return modelMapper.map(sendmsgList,new TypeToken<List<SendmsgDTO>>(){}.getType());
	}
	
	public SendmsgDTO updateSendmsg(SendmsgDTO sendmsgDTO){
		sendmsgRepo.save(modelMapper.map(sendmsgDTO, Sendmsg.class));
		return sendmsgDTO;
	}
	
	public boolean deleteSendmsg(SendmsgDTO sendmsgDTO){
		sendmsgRepo.delete(modelMapper.map(sendmsgDTO, Sendmsg.class));
		return true;
	}
}