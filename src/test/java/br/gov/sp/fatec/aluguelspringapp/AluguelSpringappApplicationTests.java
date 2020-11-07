package br.gov.sp.fatec.aluguelspringapp;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import br.gov.sp.fatec.aluguelspringapp.entity.Aluguel;
import br.gov.sp.fatec.aluguelspringapp.entity.Cliente;
import br.gov.sp.fatec.aluguelspringapp.entity.Roupa;
import br.gov.sp.fatec.aluguelspringapp.entity.Vendedor;
import br.gov.sp.fatec.aluguelspringapp.repository.AluguelRepository;
import br.gov.sp.fatec.aluguelspringapp.repository.ClienteRepository;
import br.gov.sp.fatec.aluguelspringapp.repository.RoupaRepository;
import br.gov.sp.fatec.aluguelspringapp.repository.VendedorRepository;
import br.gov.sp.fatec.aluguelspringapp.service.AluguelService;

@SpringBootTest

class AluguelSpringappApplicationTests {
	
	/*@Autowired
	private VendedorRepository vendedorRepo;
	
	@Autowired
	private ClienteRepository clienteRep;
	
	@Autowired
	private RoupaRepository roupaRepo;
	
	@Autowired
	private AluguelRepository aluguelRepo;
	
	@Autowired
	private AluguelService aluService;
	
	@Test
	void insertRoupa() {
		Roupa roupa = new Roupa();
		roupa.setTipo("Calça");
		roupa.setTamanho("M");
		roupa.setSexo("F");
		roupa.setPreco(65.0);
		roupa.setCor("Verde");
		roupaRepo.save(roupa);
	}
	
	@Test
	@Transactional
	@Rollback
	void insertUsers() throws ParseException {
		
		Vendedor vendedor = new Vendedor();
		vendedor.setNome("Rone Felipe Bento");
		vendedor.setSenha("1234");
		vendedor.setEmail("ronefelipe97@gmail.com");
		vendedor.setCpf("13834515345");
		vendedorRepo.save(vendedor);
		Cliente cliente = new Cliente();
		cliente.setNome("Joséfina2");
		cliente.setEmail("Joséfina99@gmail.com");
		cliente.setCpf("0383422424");
		cliente.setTelefone("1298178");
		cliente.setRua("Av João de Paula");
		cliente.setNumero(371);
		cliente.setIdade(25);
		cliente.setCidade("Paraisópolis - MG");
		clienteRep.save(cliente);
	}
	
	
	@Test
	void testCriaAluguel(){
		try {
			DateFormat f = DateFormat.getDateInstance();
			List<Roupa> roupas = new LinkedList();
			Roupa roupa = new Roupa();
			roupa.setTipo("Calça");
			roupa.setTamanho("M");
			roupa.setSexo("F");
			roupa.setPreco(65.0);
			roupa.setCor("Verde");
			Roupa roupa2 = new Roupa();
			roupa.setTipo("Camisa");
			roupa.setTamanho("G");
			roupa.setSexo("F");
			roupa.setPreco(65.0);
			roupa.setCor("Preto");
			roupas.add(roupa);
			roupas.add(roupa2);
	
			Aluguel aluguel = aluService.insereAluguel(1L, 2L, roupas, f.parse("12/01/2020"), f.parse("12/01/2020"), f.parse("12/01/2020"), "Nenhum");
			assertNotNull(aluguel);
		} catch (ParseException e) {
			
			e.printStackTrace();
		} 
	}
	
	@Test
	void testConsulta() {
		List<Aluguel> aluguel = aluguelRepo.procurarProCliEVen("Joséfina2","Rone Felipe Bento");
		assertFalse(aluguel.isEmpty());
	}
*/
}
