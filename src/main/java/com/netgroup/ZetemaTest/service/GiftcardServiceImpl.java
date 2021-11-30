package com.netgroup.ZetemaTest.service;

import com.netgroup.ZetemaTest.converter.GiftcardConverter;
import com.netgroup.ZetemaTest.data.entity.Giftcard;
import com.netgroup.ZetemaTest.data.dto.GiftcardDTO;
import com.netgroup.ZetemaTest.repository.GiftcardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GiftcardServiceImpl implements GiftcardService{

    @Autowired
    GiftcardRepository GiftcardRepository;

    @Override
    public List<GiftcardDTO> elenco() {
        List<Giftcard> Giftcards = GiftcardRepository.findAll();
        List<GiftcardDTO> Giftcardsdto = new ArrayList<>();
        for(Giftcard oGiftcard:Giftcards){
            Giftcardsdto.add(GiftcardConverter.convertFromDaoToDto(oGiftcard));
        }
        return Giftcardsdto;
    }

    @Override
    public GiftcardDTO findGiftcard(Integer id) {
        Giftcard oGiftcard = GiftcardRepository.findById(id).get();

        GiftcardDTO oGiftcarddto = GiftcardConverter.convertFromDaoToDto(oGiftcard);

        return oGiftcarddto;
    }

    @Override
    public void salva(Giftcard oGiftcard) {
        GiftcardRepository.save(oGiftcard);
    }

    @Override
    public void deleteGiftcard(Integer id) {
        GiftcardRepository.deleteById(id);
    }

}
