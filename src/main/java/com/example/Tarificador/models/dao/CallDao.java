package com.example.Tarificador.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.example.Tarificador.model.entity.Call;





public interface CallDao extends CrudRepository<Call,Long>{

	@Query(nativeQuery = true)
	public List<Call> Top10();
}



