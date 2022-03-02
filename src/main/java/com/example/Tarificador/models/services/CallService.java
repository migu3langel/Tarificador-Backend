package com.example.Tarificador.models.services;


import java.util.List;

import com.example.Tarificador.model.entity.Call;


public interface CallService {
	
	public List<Call> findAll();
	public List<Call> Top10();

}
