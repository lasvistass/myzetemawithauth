package com.netgroup.ZetemaTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netgroup.ZetemaTest.converter.UtenteConvert;
import com.netgroup.ZetemaTest.data.dto.UtenteDTO;
import com.netgroup.ZetemaTest.data.entity.Utente;
import com.netgroup.ZetemaTest.repository.UtenteRepository;

@Service
public class UtenteServiceImpl implements UtenteService {

	@Autowired
	UtenteRepository utenteRepository;
	
	@Autowired 
	UtenteConvert utenteConvert;

	@Override
	public UtenteDTO getUtenteDTOById(Integer id) {
		return utenteConvert.convertUtenteInDTO(utenteRepository.findById(id).get());
	}

	@Override
	public List<UtenteDTO> getAllUtenteDTO() {
		List<Utente> utenti = utenteRepository.findAll();
		return utenteConvert.convertListUtenteInDTO(utenti);
	}

	@Override
	public Utente saveUtente(Utente utente) {
		return utenteRepository.save(utente);
	}

	@Override
	public Utente deleteUtente(Integer id) {
		Utente utente = utenteRepository.findById(id).get();
		utenteRepository.delete(utente);
		return utente;
	}

	@Override
	public Utente getUtente(Integer id) {
		return utenteRepository.findById(id).get();
	}
	
	
}
