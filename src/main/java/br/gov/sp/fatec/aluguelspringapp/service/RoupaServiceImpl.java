package br.gov.sp.fatec.aluguelspringapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.aluguelspringapp.entity.Roupa;
import br.gov.sp.fatec.aluguelspringapp.repository.RoupaRepository;

@Service
public class RoupaServiceImpl implements RoupaService{
	
	@Autowired
	private RoupaRepository rouRepo;
	
	
	@Override
	public Roupa insereRoupa(String tipo, String cor, double preco, String tamanho, String sexo) {
		Roupa roupa = new Roupa();
		roupa.setTipo(tipo);
		roupa.setTamanho(tamanho);
		roupa.setSexo(sexo);
		roupa.setPreco(preco);
		roupa.setCor(cor);
		return rouRepo.save(roupa);
	}


	@Override
	public List<Roupa> listarTodasAsRoupas() {
		return rouRepo.findAll();
	}


	@Override
	public Roupa listarRoupaPorId(Long id) {
		Optional<Roupa> roupa = rouRepo.findById(id);
		if(roupa.isPresent()) {
			return roupa.get();
		}
		throw new RuntimeException("Roupa não encontrada");
	}

}
