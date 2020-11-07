package br.gov.sp.fatec.aluguelspringapp.service;

import java.util.List;

import br.gov.sp.fatec.aluguelspringapp.entity.Vendedor;

public interface VendedorService {
	
	public Vendedor cadastrarVendedor(String nome, String senha, String email, String cpf);
	
	public Vendedor listarVendedorPorId(Long id);
	
	public List<Vendedor> listarTodosVendedores();
}
