package br.gov.sp.fatec.aluguelspringapp.service;

import java.util.List;

import br.gov.sp.fatec.aluguelspringapp.entity.Cliente;

public interface ClienteService {
	
	public Cliente cadastrarCliente(String nome, String email, String cpf, Integer idade, String bairro, String rua, Integer numero, String cidade, String telefone);
	
	public Cliente listarClientePorId(Long id);
	
	public List<Cliente> listarTodosClientes();
}
