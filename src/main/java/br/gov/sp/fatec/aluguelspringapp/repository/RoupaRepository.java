package br.gov.sp.fatec.aluguelspringapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.gov.sp.fatec.aluguelspringapp.entity.Roupa;

public interface RoupaRepository extends JpaRepository<Roupa, Long>{
	
	@Query("select r from Roupa r where r.tipo = ?1 and r.tamanho = ?2 and r.cor = ?3 and r.sexo = ?4")
	public Roupa filtrarRoupa(String tipo, String tamanho, String cor, String sexo);
}
