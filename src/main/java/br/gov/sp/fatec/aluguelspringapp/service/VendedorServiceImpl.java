package br.gov.sp.fatec.aluguelspringapp.service;


import java.util.List;

import org.springframework.stereotype.Service;

import br.gov.sp.fatec.aluguelspringapp.entity.Vendedor;

@Service
public class VendedorServiceImpl implements VendedorService{

	@Override
	public Vendedor cadastrarVendedor(String nome, String senha, String email, String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vendedor listarVendedorPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vendedor> listarTodosVendedores() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
