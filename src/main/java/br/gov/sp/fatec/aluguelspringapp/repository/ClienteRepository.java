package br.gov.sp.fatec.aluguelspringapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.aluguelspringapp.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
