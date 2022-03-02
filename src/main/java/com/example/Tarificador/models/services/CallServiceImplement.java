package com.example.Tarificador.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Tarificador.model.entity.Call;
import com.example.Tarificador.models.dao.CallDao;


@Service
public class CallServiceImplement implements CallService{
	@Autowired
	private CallDao callDao;
	
	@Override
	public List<Call> findAll() {
		// TODO Auto-generated method stub
		return (List<Call>) callDao.findAll();
	}

	@Override
	public List<Call> Top10() {
		// TODO Auto-generated method stub
		return (List<Call>) callDao.Top10();
	}

}
