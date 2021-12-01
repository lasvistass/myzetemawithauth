package com.netgroup.ZetemaTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netgroup.ZetemaTest.converter.StoreConverter;
import com.netgroup.ZetemaTest.data.dto.StoreDTO;
import com.netgroup.ZetemaTest.data.entity.Store;
import com.netgroup.ZetemaTest.repository.StoreRepository;

@Service
public class StoreImpl implements StoreService{
	
	
	@Autowired
	StoreRepository storeRepo;
	

	@Override
	public List<StoreDTO> elenco() {
		return StoreConverter.converterListFromDaoToDto(storeRepo.findAll());
	}

	@Override
	public StoreDTO findStore(Integer id) {
		return StoreConverter.converterFromDaoToDto(storeRepo.findById(id).get());
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
