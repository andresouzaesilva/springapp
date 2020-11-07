package br.gov.sp.fatec.aluguelspringapp.service;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.el.stream.Optional;

import br.gov.sp.fatec.aluguelspringapp.entity.Aluguel;
import br.gov.sp.fatec.aluguelspringapp.entity.Cliente;
import br.gov.sp.fatec.aluguelspringapp.entity.Roupa;
import br.gov.sp.fatec.aluguelspringapp.entity.Vendedor;
import br.gov.sp.fatec.aluguelspringapp.repository.AluguelRepository;
import br.gov.sp.fatec.aluguelspringapp.repository.ClienteRepository;
import br.gov.sp.fatec.aluguelspringapp.repository.RoupaRepository;
import br.gov.sp.fatec.aluguelspringapp.repository.VendedorRepository;
import br.gov.sp.fatec.aluguelspringapp.exceptions.RegistroNaoEcontradoException;

@Service
public class AluguelServiceImpl implements AluguelService{
	
	@Autowired
	private VendedorRepository vendedorRepo;
	
	@Autowired
	private RoupaRepository roupaRepo;
	
	@Autowired
	private ClienteRepository clienteRepo;
	
	@Autowired
	private AluguelRepository aluguelRepo;

	@Override
	@Transactional
	public Aluguel insereAluguel(Long idVendedor, Long idCliente, Set<Roupa> roupas, Date dataLocacao,
			Date dataRetirada, Date dataDevolucao, String ajuste) {
		
			Cliente cli = clienteRepo.findById(idCliente).get();
			Vendedor vend = vendedorRepo.findById(idVendedor).get();
			
			Aluguel aluguel = new Aluguel();
			aluguel.setCliente(cli);
			aluguel.setVendedor(vend);
			aluguel.setRoupas(new HashSet<Roupa>());
			aluguel.setDataLocacao(dataLocacao);
			aluguel.setDataDevolucao(dataDevolucao);
			aluguel.setDataRetirada(dataRetirada);
			aluguel.setAjuste(ajuste);
			for(Roupa roupa :roupas) {
				Roupa findRoupa = roupaRepo.findById(roupa.getId()).get();
				if(findRoupa == null) {
					roupaRepo.save(roupa);
				}
				aluguel.getRoupas().add(roupa);
			}
			return aluguelRepo.save(aluguel);
		
		
	}

	@Override
	public List<Aluguel> listarTodosAlugueis() {
		return aluguelRepo.findAll();
	}

	@Override
	public Aluguel listarPorId(Long id) {
		java.util.Optional<Aluguel> aluguel =  aluguelRepo.findById(id);
		if(aluguel.isPresent()) {
			return aluguel.get();
		}
		throw new RegistroNaoEcontradoException("Aluguel não encontrado");
	}

	@Override
	public Aluguel atualizaAluguel(Aluguel aluguel) {
		
		return aluguelRepo.save(aluguel);
	}

	@Override
	public void deletaAluguel(Long id) {
		aluguelRepo.deleteById(id);
		
	}
	


}
