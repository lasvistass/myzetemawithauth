package com.netgroup.ZetemaTest.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.netgroup.ZetemaTest.data.dto.OrdineDTO;
import com.netgroup.ZetemaTest.data.entity.Ordine;

@Component
public class OrdineConvert {

	public OrdineDTO convertOrdineInDTO(Ordine ordine) {
		OrdineDTO dto = new OrdineDTO();
		dto.setTimeStamp(ordine.getTimeStamp());
		dto.setBilled(ordine.isBilled());
		dto.setCode(ordine.getCode());
		dto.setPaymentType(ordine.getPaymentType());
		dto.setPrezzo(ordine.getPrezzo());
		dto.setCampo1(ordine.getCampo1());
		dto.setUtente(ordine.getUtente());
		dto.setMicard(ordine.getMicard());
		dto.setGiftcard(ordine.getGiftcard());
		dto.setStore(ordine.getStore());
		return dto;
	}
	
	public List<OrdineDTO> convertListOrdineInDTO(List<Ordine> ordini){
		List<OrdineDTO> listDto = new ArrayList<>();
		for(int i = 0; i < ordini.size(); i++) {
			listDto.add(convertOrdineInDTO(ordini.get(i)));
		}
		return listDto;
	}
}
