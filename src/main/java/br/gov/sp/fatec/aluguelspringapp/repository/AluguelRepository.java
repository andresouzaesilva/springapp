package br.gov.sp.fatec.aluguelspringapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.gov.sp.fatec.aluguelspringapp.entity.Aluguel;

public interface AluguelRepository extends JpaRepository<Aluguel, Long>{
	public List<Aluguel> findAluguelByClienteAndVendedor(String cliente, String vendedor);
	
	@Query("select a from Aluguel a join a.cliente c join a.vendedor v where c.nome = ?1 and v.nome = ?2")
	public List<Aluguel> procurarProCliEVen(String cliente, String vendedor);
}
