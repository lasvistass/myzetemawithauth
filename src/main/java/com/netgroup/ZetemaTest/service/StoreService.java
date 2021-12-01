package com.netgroup.ZetemaTest.service;

import java.util.List;

import com.netgroup.ZetemaTest.data.dto.StoreDTO;
import com.netgroup.ZetemaTest.data.entity.Store;

public interface StoreService {

	List<StoreDTO> elenco();
	StoreDTO findStore(Integer id);
	void salva(Store storeDto);
	void deleteStore(Integer id);
}
