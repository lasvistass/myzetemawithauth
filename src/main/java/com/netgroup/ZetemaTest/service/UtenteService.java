package com.netgroup.ZetemaTest.service;

import java.util.List;

import com.netgroup.ZetemaTest.data.dto.UtenteDTO;
import com.netgroup.ZetemaTest.data.entity.Utente;

public interface UtenteService {

	UtenteDTO getUtenteDTOById(Integer id);
	
	List<UtenteDTO> getAllUtenteDTO();
	
	Utente saveUtente(Utente utente);
	
	Utente deleteUtente(Integer id);
	
	Utente getUtente(Integer id);
}
