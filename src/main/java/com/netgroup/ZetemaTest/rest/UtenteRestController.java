package com.netgroup.ZetemaTest.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netgroup.ZetemaTest.data.dto.UtenteDTO;
import com.netgroup.ZetemaTest.data.entity.Utente;
import com.netgroup.ZetemaTest.service.UtenteService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/utente")
public class UtenteRestController {

	@Autowired
	UtenteService utenteService;
	
	@ApiOperation(value = "ricerca di un utente DTO tramite id", notes = "endpoint predisposto alla ricerca di un utente DTO", response = Utente.class, produces = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Utente trovato") })
	@GetMapping(value="/{id}")
	public UtenteDTO getUtenteDTPById(@PathVariable("id") Integer id) {
		return utenteService.getUtenteDTOById(id);
	}
	
	@ApiOperation(value = "ricerca di tutti gli utenti DTO", notes = "endpoint predisposto alla ricerca di utenti DTO", response = Utente.class, produces = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Utenti trovati") })
	@GetMapping(value="/getAll")
	public List<UtenteDTO> getAllUtenteDTO(){
		return utenteService.getAllUtenteDTO();
	}
	
	@ApiOperation(value = "salvataggio di un utente", notes = "endpoint predisposto al salvataggio di un utente", response = Utente.class, produces = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Utente salvato") })
	@PostMapping(value="/save")
	public Utente saveUtente(@RequestBody Utente utente) {
		return utenteService.saveUtente(utente);
	}
	
	@ApiOperation(value = "modifica di un utente", notes = "endpoint predisposto alla modifica di un utente", response = Utente.class, produces = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Utente modificato") })
	@PutMapping(value="/update")
	public Utente updateUtente(@RequestBody Utente utente) {
		return utenteService.saveUtente(utente);
	}
	
	@ApiOperation(value = "eliminazione di un utente tramite id", notes = "endpoint predisposto all' eliminazione di un utente", response = Utente.class, produces = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Utente eliminato") })
	@DeleteMapping(value="/{id}")
	public Utente deleteUtente(@PathVariable Integer id) {
		return utenteService.deleteUtente(id);
	}
	
	@ApiOperation(value = "ricerca di un utente tramite id", notes = "endpoint predisposto alla ricerca di un utente", response = Utente.class, produces = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Utente trovato") })
	@GetMapping(value="/get{id}")
	public Utente getUtenteById(@PathVariable("id")Integer id) {
		return utenteService.getUtente(id);
	}
	
}
