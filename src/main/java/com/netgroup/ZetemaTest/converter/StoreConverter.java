package com.netgroup.ZetemaTest.converter;

import java.util.ArrayList;
import java.util.List;

import com.netgroup.ZetemaTest.data.dto.StoreDTO;
import com.netgroup.ZetemaTest.data.entity.Store;

public class StoreConverter {

	public static StoreDTO converterFromDaoToDto(Store oStore) {
		StoreDTO storeDto = new StoreDTO();
		storeDto.setAttivo(oStore.isAttivo());
		storeDto.setIdStore(oStore.getIdStore());
		storeDto.setNome(oStore.getNome());
		return storeDto;

	}

	public static List<StoreDTO> converterListFromDaoToDto(List<Store> listaDao) {
		List<StoreDTO> listDto = new ArrayList<StoreDTO>();
		for (int i = 0; i < listaDao.size(); i++) {
			listDto.add(converterFromDaoToDto(listaDao.get(i)));
		}
		return listDto;
	}

}
