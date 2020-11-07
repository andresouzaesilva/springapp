package br.gov.sp.fatec.aluguelspringapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.annotation.JsonView;

import br.gov.sp.fatec.aluguelspringapp.entity.Aluguel;
import br.gov.sp.fatec.aluguelspringapp.service.AluguelService;

@RestController
@CrossOrigin
@RequestMapping(value = "/aluga")
public class ControllerAluguel {
	
	@Autowired
	AluguelService aluguelServ;
	
	@JsonView(View.AluguelResumo.class)
	@PostMapping
	public ResponseEntity<Aluguel> insereAluguel(@RequestBody Aluguel aluguel, UriComponentsBuilder uriComponentsBuilder) {
		aluguel = aluguelServ.insereAluguel(aluguel.getVendedor().getId(), aluguel.getCliente().getId(), aluguel.getRoupas(), aluguel.getDataLocacao(), aluguel.getDataRetirada(), aluguel.getDataDevolucao(), aluguel.getAjuste());
		
		HttpHeaders responseHeaders = new HttpHeaders();
		
		responseHeaders.setLocation(uriComponentsBuilder.path(
				"/aluga/" + aluguel.getId()).build().toUri());
		return new ResponseEntity<Aluguel>(aluguel, responseHeaders, HttpStatus.CREATED);
	}
	
	@JsonView(View.AluguelResumo.class)
	@PutMapping
	public ResponseEntity<Aluguel> atualizaAluguel(@RequestBody Aluguel aluguel, UriComponentsBuilder uriComponentsBuilder) {
		aluguel = aluguelServ.atualizaAluguel(aluguel);
		
		HttpHeaders responseHeaders = new HttpHeaders();
		
		responseHeaders.setLocation(uriComponentsBuilder.path(
				"/aluga/" + aluguel.getId()).build().toUri());
		return new ResponseEntity<Aluguel>(aluguel, responseHeaders, HttpStatus.CREATED);
	}
	
	@JsonView(View.AluguelCompleto.class)
	@GetMapping
	public List<Aluguel> listarTodosAlugueis(){
		return aluguelServ.listarTodosAlugueis();
	}
	
	@JsonView(View.AluguelCompleto.class)
	@GetMapping(value = "/{id}")
	public Aluguel listarPorId(@PathVariable("id") Long id) {
		return aluguelServ.listarPorId(id);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deletarAluguel(@PathVariable("id") Long id) {
		aluguelServ.deletaAluguel(id);
	}
	
	
	
	
}
