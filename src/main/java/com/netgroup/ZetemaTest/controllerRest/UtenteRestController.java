package com.netgroup.ZetemaTest.controllerRest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netgroup.ZetemaTest.data.dto.UtenteDTO;
import com.netgroup.ZetemaTest.data.entity.Utente;
import com.netgroup.ZetemaTest.service.UtenteService;

@RestController
@RequestMapping("/api/utente")
public class UtenteRestController {

	@Autowired
	UtenteService utenteService;
	
	@GetMapping(value="/{id}")
	public UtenteDTO getUtenteDTPById(@PathVariable("id") Integer id) {
		return utenteService.getUtenteDTOById(id);
	}
	
	@GetMapping(value="/getAll")
	public List<UtenteDTO> getAllUtenteDTO(){
		return utenteService.getAllUtenteDTO();
	}
	
	@PostMapping(value="/save")
	public Utente saveUtente(@RequestBody Utente utente) {
		
		return utenteService.saveUtente(utente);
	}
	
	@DeleteMapping(value="/{id}")
	public Utente deleteUtente(@PathVariable Integer id) {
		return utenteService.deleteUtente(id);
	}
	
	@GetMapping(value="/get{id}")
	public Utente getUtenteById(@PathVariable("id")Integer id) {
		return utenteService.getUtente(id);
	}
	
}
