package com.netgroup.ZetemaTest.data.dto;

import com.netgroup.ZetemaTest.data.entity.Documento;
import com.netgroup.ZetemaTest.data.entity.Genere;

import lombok.Data;

@Data
public class UtenteDTO {

	private String nome;
	
	private String cognome;
	
	private Genere genere;
	
	private Documento documento;
	
	private String numeroDocumento;
}
