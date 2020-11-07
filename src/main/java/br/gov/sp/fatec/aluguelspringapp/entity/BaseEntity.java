package br.gov.sp.fatec.aluguelspringapp.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonView;

import br.gov.sp.fatec.aluguelspringapp.controller.View;

@MappedSuperclass
public class BaseEntity {
	@JsonView({View.AluguelCompleto.class, View.PessoaCompleto.class})
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

}
