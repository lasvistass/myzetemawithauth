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

import com.netgroup.ZetemaTest.data.dto.OrdineDTO;
import com.netgroup.ZetemaTest.data.entity.Ordine;
import com.netgroup.ZetemaTest.service.OrdineService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/ordine")
public class OrdineRestController {

	@Autowired
	OrdineService ordineService;
	
	@ApiOperation(value = "ricerca di un ordine tramite id", notes = "endpoint predisposto alla ricerca di un ordine", response = Ordine.class, produces = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Utente trovato") })
	@GetMapping(value="/{id}")
	public OrdineDTO getOrdineDTOById(@PathVariable("id") Integer id) {
		return ordineService.getOrdineById(id);
	}
	
	@ApiOperation(value = "ricerca di tutti gli ordini", notes = "endpoint predisposto alla ricerca di ordini", response = Ordine.class, produces = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Utenti trovati") })
	@GetMapping(value="/getall")
	public List<OrdineDTO> getAllOrdineDTO(){
		return ordineService.getAllOrdineDTO();
	}
	
	@ApiOperation(value = "salvataggio di un ordine", notes = "endpoint predisposto al salvataggio di ordine", response = Ordine.class, produces = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Utente salvato") })
	@PostMapping(value="/save")
	public Ordine saveOrdine(@RequestBody Ordine ordine) {
		return ordineService.saveOrdine(ordine);
	}
	
	
	@ApiOperation(value = "modifica di un ordine", notes = "endpoint predisposto alla modifica di ordine", response = Ordine.class, produces = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Utente modificato") })
	@PutMapping(value="/update")
	public Ordine updateOrdine(@RequestBody Ordine ordine) {
		return ordineService.saveOrdine(ordine);
	}
	
	@ApiOperation(value = "eliminazione di un ordine", notes = "endpoint predisposto all'eliminazione di ordine", response = Ordine.class, produces = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Utente eliminato") })
	@DeleteMapping(value="delete/{id}")
	public Ordine deleteOrdine(@PathVariable("id") Integer id) {
		return ordineService.deleteOrdine(id);
	}
	
	@GetMapping(value="/expired/{id}")
	public void setExpired(@PathVariable("id") Integer id) {
		ordineService.setExpiredMIccard(id);
	}
	
	@GetMapping(value="/addgift/{idOrdine}/{idGiftcard}")
	public OrdineDTO addGiftToOrdine(@PathVariable("idOrdine") Integer idOrdine, @PathVariable("idGiftcard") Integer idGriftcard) {
		
		return ordineService.addGiftcard(idOrdine, idGriftcard);
	}
	
	@PostMapping(value="/addmiccard")
	public void addMiccardoOrdine(@RequestBody Integer[] id) {
		 ordineService.addMiccard(id);
	}
	
	@PostMapping(value="/addstore")
	public void addStore(@RequestBody Integer[] id) {
		ordineService.addStore(id);
	}
}
