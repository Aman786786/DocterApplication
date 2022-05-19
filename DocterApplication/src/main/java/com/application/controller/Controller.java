package com.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.Entity.Docter;
import com.application.Repository.DocterRepository;
import com.application.Service.DocterService;


@RestController
public class Controller {
	
	@Autowired
	private DocterService docterService;
	

	
	@PostMapping("/addDocter")
	public Docter addProduct(@RequestBody Docter docter) {
		return docterService.saveProduct(docter);
	}
	

	@PostMapping("/addDocters")
	public List<Docter> addProducts(@RequestBody List<Docter> docters) {
		system.out.println("Testing123");
		return docterService.DocterList(docters);
	}

}
