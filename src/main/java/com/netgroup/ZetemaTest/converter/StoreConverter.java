package com.netgroup.ZetemaTest.converter;

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

}
