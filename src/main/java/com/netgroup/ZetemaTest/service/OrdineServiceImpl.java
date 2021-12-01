package com.netgroup.ZetemaTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netgroup.ZetemaTest.converter.OrdineConvert;
import com.netgroup.ZetemaTest.data.dto.OrdineDTO;
import com.netgroup.ZetemaTest.data.entity.Ordine;
import com.netgroup.ZetemaTest.repository.OrdineRepository;

@Service
public class OrdineServiceImpl implements OrdineService{

	@Autowired
	OrdineRepository ordineRepository;
	
	@Autowired
	OrdineConvert ordineConvert;

	@Override
	public OrdineDTO getOrdineById(Integer id) {
		return ordineConvert.convertOrdineInDTO(ordineRepository.findById(id).get());
	}

	@Override
	public List<OrdineDTO> getAllOrdineDTO() {
		return ordineConvert.convertListOrdineInDTO(ordineRepository.findAll());
	}

	@Override
	public Ordine saveOrdine(Ordine ordine) {
		return ordineRepository.save(ordine);
	}

	@Override
	public Ordine deleteOrdine(Integer id) {
		Ordine ordine = ordineRepository.findById(id).get();
		ordineRepository.delete(ordine);
		return ordine;
	}
	
	
}
