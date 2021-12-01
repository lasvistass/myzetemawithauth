package com.netgroup.ZetemaTest.repository;

import com.netgroup.ZetemaTest.data.entity.Giftcard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiftcardRepository extends JpaRepository<Giftcard, Integer> {
}
