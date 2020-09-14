package com.agenciamacro.controller;


//java -jar -Dserver.port=9000 spring-boot-demo.jar
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.agenciamacro.model.Bus;
import com.agenciamacro.service.BusService;

@RestController
public class BusController {

	@Autowired
	private BusService busService;

	@RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
	
	@RequestMapping("/create")
	public String create(@RequestParam String placa, @RequestParam String disponivel) {
		Bus b = busService.create(placa, disponivel);
		return b.toString();
	}
		
	@RequestMapping("/get")
	public Bus getBus(@RequestParam String placa) {
		return busService.getByPlaca(placa);
	}
	
	@RequestMapping("/getAll")
	public List<Bus> getBusAll() {
		return busService.getAll();
	}

	@RequestMapping("/update")
	public String update(@RequestParam String placa, @RequestParam String disponivel) {
		Bus b = busService.update(placa, disponivel);
		return b.toString();
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam String placa) {
		busService.delete(placa);
		return "Deleted=["+placa+"]";
	}

	@RequestMapping("/deleteAll")
	public String deleteAll() {
		busService.deleteAll();
		return "Deleted all records";
	}
}
