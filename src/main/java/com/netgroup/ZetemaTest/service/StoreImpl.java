package com.netgroup.ZetemaTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netgroup.ZetemaTest.data.entity.Store;
import com.netgroup.ZetemaTest.repository.StoreRepository;

@Service
public class StoreImpl implements StoreService{
	
	
	@Autowired
	StoreRepository storeRepo;
	

	@Override
	public List<Store> elenco() {

		return storeRepo.findAll();
	}

	@Override
	public Store findStore(Integer id) {
		return storeRepo.findById(id).get();
	}

	@Override
	public void salva(Store store) {
		
		storeRepo.save(store);
		
	}

	@Override
	public void deleteStore(Integer id) {
		storeRepo.deleteById(id);
		
	}

}
