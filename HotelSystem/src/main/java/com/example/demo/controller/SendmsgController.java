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

import com.example.demo.dto.SendmsgDTO;
import com.example.demo.service.SendmsgService;

@RestController
@RequestMapping(value="api/v1/sendmsg")
@CrossOrigin
public class SendmsgController{
	@Autowired
	private SendmsgService sendmsgService;
	
	@GetMapping("/getSendmsgs")
	public List<SendmsgDTO> getSendmsg(){
		return sendmsgService.getAllSendmsgs();
	}
	
	@PostMapping("/saveSendmsg")
	public SendmsgDTO saveSendmsg(@RequestBody SendmsgDTO sendmsgDTO){
		return sendmsgService.saveSendmsg(sendmsgDTO);
	}
	
	@PostMapping("/updateSendmsg")
	public SendmsgDTO updateSendmsg(@RequestBody SendmsgDTO sendmsgDTO){
		return sendmsgService.updateSendmsg(sendmsgDTO);
	}
	
	@DeleteMapping("/deleteSendmsg")
	public boolean deleteeSendmsg(@RequestBody SendmsgDTO sendmsgDTO){
		return sendmsgService.deleteSendmsg(sendmsgDTO);
	}
}
