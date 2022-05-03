package com.professorangoti.leilao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.professorangoti.leilao.domain.Lance;
import com.professorangoti.leilao.service.LanceService;

@RestController
@RequestMapping("/lance")
public class LanceController {

	@Autowired
	private LanceService service;

	@GetMapping("/{id}")
	public Lance lance(@PathVariable Integer id) {
		return service.findById(id);
	}

	@GetMapping
	public List<Lance> lances() {
		return service.todos();
	}

	@PostMapping
	public Lance novo(@RequestBody Lance entity) {
		return service.save(entity);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}

	@PutMapping("/{id}")
	public Lance atualiza(@PathVariable Integer id, @RequestBody Lance entity) {
		return service.atualiza(id, entity);
	}
}

