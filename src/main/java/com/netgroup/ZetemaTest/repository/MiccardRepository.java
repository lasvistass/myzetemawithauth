package com.netgroup.ZetemaTest.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.netgroup.ZetemaTest.data.entity.Miccard;

public interface MiccardRepository extends JpaRepository<Miccard, Integer> {

	
	@Modifying
	@Transactional
	@Query(value = "update miccard m set m.is_expired=true where m.expired_date<?1 ", nativeQuery = true )
	void uptedExpired(Date date);
	


}
