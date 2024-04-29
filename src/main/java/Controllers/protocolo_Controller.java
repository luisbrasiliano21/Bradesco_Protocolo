package Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bradesco.demo.entity.Consulta_Protocolo;

import Repository.Protocolo_repository;

@RestController
@RequestMapping(value="/Protocolos")
public class protocolo_Controller {
	@Autowired
	private Protocolo_repository repository;

	@GetMapping
	public List<Consulta_Protocolo> Resposta(){
		List<Consulta_Protocolo> Protocolos = repository.findAll();
		return Protocolos;
	}
	
 	@GetMapping(value = "/{id}")
	public Consulta_Protocolo findByID(@PathVariable Long id) {
		Consulta_Protocolo result = repository.findById(id).get();
		return result;
 	}
	
}
