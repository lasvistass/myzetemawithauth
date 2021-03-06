package com.netgroup.ZetemaTest.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netgroup.ZetemaTest.data.dto.StoreDTO;
import com.netgroup.ZetemaTest.data.entity.Store;
import com.netgroup.ZetemaTest.service.StoreService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/api/store")
public class StoreRest {

	private static final Logger log = LoggerFactory.getLogger(StoreRest.class);

	@Autowired
	StoreService storeService;

	@ApiOperation(value = "creazione nuovo store", notes = "endpoint predisposto creazione e salvataggio nel db", response = Store.class, produces = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Store creato") })
	@PostMapping("/newstore")
	public void createStore(@RequestBody Store store) {
		log.info("crea nuovo store");
		storeService.salva(store);
		log.info("store creato");
	}

	@ApiOperation(value = "eliminazione dello store", notes = "endpoint predisposto eliminazione dal db", response = StoreDTO.class, produces = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Store eliminato") })
	@DeleteMapping(value = "/{id}")
	public void deleteStore(@PathVariable("id") Integer id) {
		log.info("deleteStore è stato invocato");
		storeService.deleteStore(id);
		log.info("store è stato eliminato!");
	}

	@ApiOperation(value = "get lista Store", notes = "endpoint predisposto a ricercare la lista store", response = StoreDTO.class, produces = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "elenco Store") })
	@GetMapping
	public List<StoreDTO> getStores() {
		log.info("getStores è stato invocato");
		return storeService.elenco();
	}

	@ApiOperation(value = "get Store da id", notes = "endpoint predisposto a ricercare e tornare un Store", response = StoreDTO.class, produces = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Store trovato") })
	@GetMapping(value = "/{id}")
	public StoreDTO getStore(@PathVariable("id") Integer id) {
		log.info("getStore è stato invocato");
		return storeService.findStore(id);

	}
	
	@ApiOperation(value = "aggiorna un store", notes = "endpoint predisposto aggiorna un store", response = Store.class, produces = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Store aggiornato") })
	@PutMapping(value = "/aggiorna")
	public void aggiorna(@RequestBody Store store) {
		storeService.salva(store);
	}

}
