package com.netgroup.ZetemaTest.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.netgroup.ZetemaTest.data.dto.UtenteDTO;
import com.netgroup.ZetemaTest.data.entity.Utente;


@Component
public class UtenteConvert {

	public UtenteDTO convertUtenteInDTO(Utente utente) {
		UtenteDTO dto = new UtenteDTO();
		dto.setNome(utente.getNome());
		dto.setCognome(utente.getCognome());
		dto.setGenere(utente.getGenere());
		dto.setDocumento(utente.getDocumento());
		dto.setNumeroDocumento(utente.getNumeroDocumento());
		return dto;
		
	}
	
	public List<UtenteDTO> convertListUtenteInDTO (List<Utente> utenti){
		List<UtenteDTO> listDTO = new ArrayList<>();
		for(int i = 0; i < utenti.size(); i++) {
			listDTO.add(convertUtenteInDTO(utenti.get(i)));
		}
		return listDTO;
	}
	
}
