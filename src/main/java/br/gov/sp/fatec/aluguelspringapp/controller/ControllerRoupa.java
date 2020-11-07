package br.gov.sp.fatec.aluguelspringapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.aluguelspringapp.entity.Roupa;
import br.gov.sp.fatec.aluguelspringapp.service.RoupaService;

@RestController
@CrossOrigin
@RequestMapping(value = "/roupa")
public class ControllerRoupa {
	
	@Autowired
	RoupaService roupaServ;
	
	@GetMapping
	public List<Roupa> listarTodasAsRoupas() {
		return roupaServ.listarTodasAsRoupas();
	}
	
	@GetMapping(value = "/{id}")
	public Roupa listRoupaPorId(@PathVariable("id") Long id) {
		return roupaServ.listarRoupaPorId(id);
	}
	
	@PostMapping
	public Roupa inserirRoupa(@RequestBody Roupa roupa) {
		return roupaServ.insereRoupa(roupa.getTipo(), roupa.getCor(), roupa.getPreco(), roupa.getTamanho(), roupa.getSexo());
	}
}
