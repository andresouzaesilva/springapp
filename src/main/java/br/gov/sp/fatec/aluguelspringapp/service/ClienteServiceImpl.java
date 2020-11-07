package br.gov.sp.fatec.aluguelspringapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.gov.sp.fatec.aluguelspringapp.entity.Cliente;


@Service
public class ClienteServiceImpl implements ClienteService{

	@Override
	public Cliente cadastrarCliente(String nome, String email, String cpf, Integer idade, String bairro, String rua,
			Integer numero, String cidade, String telefone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente listarClientePorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> listarTodosClientes() {
		// TODO Auto-generated method stub
		return null;
	}

}
