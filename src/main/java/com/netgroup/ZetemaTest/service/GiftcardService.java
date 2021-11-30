package com.netgroup.ZetemaTest.service;

import com.netgroup.ZetemaTest.data.entity.Giftcard;
import com.netgroup.ZetemaTest.data.dto.GiftcardDTO;

import java.util.List;

public interface GiftcardService {

    List<GiftcardDTO> elenco();

    GiftcardDTO findGiftcard(Integer id);

    void salva(Giftcard oGiftcard);

    void deleteGiftcard(Integer id);

}
