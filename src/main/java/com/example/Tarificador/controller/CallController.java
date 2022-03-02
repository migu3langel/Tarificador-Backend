package com.example.Tarificador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Tarificador.model.entity.Call;
import com.example.Tarificador.models.services.CallService;




@RestController
@RequestMapping("/api")
public class CallController {
	
	@Autowired
	private CallService callService;
	
	@CrossOrigin(origins="http://localhost:4200")  
	@GetMapping("/calls")
	public List<Call> index() {

		return callService.findAll();

	}
	
	
	@CrossOrigin(origins="http://localhost:4200")  
	@GetMapping("/top10")
	public List<Call> top() {

		return callService.Top10();

	}

}
