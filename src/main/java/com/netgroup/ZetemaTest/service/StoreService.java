package com.netgroup.ZetemaTest.service;

import java.util.List;

import com.netgroup.ZetemaTest.data.entity.Store;

public interface StoreService {

	List<Store> elenco();
	Store findStore(Integer id);
	void salva(Store store);
	void deleteStore(Integer id);
}
