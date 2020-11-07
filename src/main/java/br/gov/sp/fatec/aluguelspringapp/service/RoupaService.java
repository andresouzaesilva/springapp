package br.gov.sp.fatec.aluguelspringapp.service;

import java.util.List;

import br.gov.sp.fatec.aluguelspringapp.entity.Roupa;

public interface RoupaService {
	
	public Roupa insereRoupa(String tipo, String cor, double preco, String tamanho, String sexo);
	
	public List<Roupa> listarTodasAsRoupas();
	
	public Roupa listarRoupaPorId(Long id);
}
