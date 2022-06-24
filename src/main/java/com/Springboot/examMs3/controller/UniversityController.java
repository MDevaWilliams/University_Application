package com.Springboot.examMs3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Springboot.examMs3.Entity.UniversityApplication;
import com.Springboot.examMs3.Service.UniversityService;

@RestController
public class UniversityController {
	@Autowired
	private UniversityService service;
	
	@GetMapping("/University/{id}")
	public UniversityApplication getdataById(@PathVariable int id) {
		return service.getdataById(id);	
	}
	
	@GetMapping("/University")
	public List<UniversityApplication> getdata(){
		return service.getAlldata();
	}
	
	
	@PostMapping("/University")
	public UniversityApplication savedata(@RequestBody UniversityApplication data) {	
		return service.adddata(data);	
	}
	
	@PutMapping("/University")
	public UniversityApplication editdata(@RequestBody UniversityApplication data) {
		return service.editdata(data);
	}
	
	@DeleteMapping("/University/{id}")
	public String deletedata(@PathVariable int id) {
		return service.deletedata(id);
	}


}
