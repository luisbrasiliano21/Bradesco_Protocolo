package com.Bradesco.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bradesco.demo.entity.Consulta_Protocolo;
import com.Bradesco.demo.Repository.Protocolo_repository;

@RestController
@RequestMapping(value="/Protocolos")
public class protocolo_Controll {

	@Autowired
	private Protocolo_repository repository;

	@GetMapping
	public List<Consulta_Protocolo> Resposta(){
		List<Consulta_Protocolo> Protocolos = repository.findAll();
		return Protocolos;
	}

	@GetMapping(value = "/numero/{numeroProtocolo}")
	public Consulta_Protocolo findByNumeroProtocolo(@PathVariable Long numeroProtocolo) {
		Consulta_Protocolo result = repository.findByNumeroProtocolo(numeroProtocolo);
		return result;
	}

	@GetMapping("/protocolo/search")
	public ResponseEntity<?> searchProtocolo(@RequestParam("numero") Long numeroProtocolo) {
		Consulta_Protocolo protocolo = repository.findByNumeroProtocolo(numeroProtocolo);

		if (protocolo != null) {
			return ResponseEntity.ok(protocolo);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Protocolo não encontrado");
		}
	}
