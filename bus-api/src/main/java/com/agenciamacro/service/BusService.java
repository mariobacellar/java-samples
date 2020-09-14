package com.agenciamacro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenciamacro.model.Bus;
import com.agenciamacro.repository.BusRepository;

@Service
public class BusService {

	@Autowired
	private BusRepository busRepository;
	
	public Bus create(String placa, String disponivel) {
		return busRepository.save(new Bus(placa, disponivel));
	}
	
	public List<Bus> getAll(){
		return busRepository.findAll();
	}
	
	public Bus getByPlaca(String placa) {
		return busRepository.findByPlaca(placa);
	}
	
	public Bus update(String placa, String disponivel) {
		Bus b = busRepository.findByPlaca(placa);
		b.setDisponivel(disponivel);
		return b;
	}
	
	
	public void deleteAll() {
		busRepository.deleteAll();
	}
	
	public void delete(String placa) {
		Bus b = busRepository.findByPlaca(placa);
		busRepository.delete(b);
	}
	
}
