package com.agenciamacro.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.agenciamacro.model.Bus;

@Repository
public interface BusRepository extends MongoRepository<Bus, String>{
	
	public Bus findByPlaca(String placa);
	
	public List<Bus> findByDisponivel(String disponivel);
	
	

}
