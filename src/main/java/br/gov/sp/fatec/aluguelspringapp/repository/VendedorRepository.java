package br.gov.sp.fatec.aluguelspringapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.aluguelspringapp.entity.Vendedor;



public interface VendedorRepository  extends JpaRepository<Vendedor, Long>{

}
