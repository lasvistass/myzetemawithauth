package com.netgroup.ZetemaTest.service;

import java.util.List;

import com.netgroup.ZetemaTest.data.dto.OrdineDTO;
import com.netgroup.ZetemaTest.data.entity.Ordine;

public interface OrdineService {

	OrdineDTO getOrdineById(Integer id);
	
	List<OrdineDTO> getAllOrdineDTO();
	
	Ordine saveOrdine(Ordine ordine);
	
	Ordine deleteOrdine(Integer id);
	
}
