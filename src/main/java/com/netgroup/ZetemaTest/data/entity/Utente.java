package com.netgroup.ZetemaTest.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Utente")
@Data
public class Utente {


	@Id
	@Column(name ="idUtente")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idUtente;
	
	@Column(name ="Nome")
	private String nome;
	
	@Column(name ="Cognome")
	private String cognome;
	
	@Enumerated(EnumType.STRING)
	@Column(name ="Genere")
	private Genere genere;
	
	@Enumerated(EnumType.STRING)
	@Column(name ="Documento")
	private Documento documento;
	
	@Column(name ="NumeroDocumento")
	private String numeroDocumento;
}
