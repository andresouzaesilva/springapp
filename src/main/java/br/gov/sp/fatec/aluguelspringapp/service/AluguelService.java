package br.gov.sp.fatec.aluguelspringapp.service;

import java.util.Date;
import java.util.List;
import java.util.Set;

import br.gov.sp.fatec.aluguelspringapp.entity.Aluguel;
import br.gov.sp.fatec.aluguelspringapp.entity.Roupa;

public interface AluguelService {
	
	public Aluguel insereAluguel(Long idVendedor, Long idCliente, Set<Roupa> roupa, Date dataLocacao, Date dataRetirada, Date dataDevolucao, String Ajuste);
	
	public List<Aluguel> listarTodosAlugueis();
	
	public Aluguel listarPorId(Long id);
	
	public Aluguel atualizaAluguel(Aluguel aluguel);
	
	public void deletaAluguel(Long id);
}
