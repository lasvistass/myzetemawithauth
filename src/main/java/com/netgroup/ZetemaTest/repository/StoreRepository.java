package com.netgroup.ZetemaTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netgroup.ZetemaTest.data.dto.StoreDTO;
import com.netgroup.ZetemaTest.data.entity.Store;

public interface StoreRepository extends JpaRepository<Store,Integer> {

}
