package com.netgroup.ZetemaTest.converter;

import com.netgroup.ZetemaTest.data.dto.GiftcardDTO;
import com.netgroup.ZetemaTest.data.entity.Giftcard;

public class GiftcardConverter {

    public static GiftcardDTO convertFromDaoToDto(Giftcard oGiftcard) {
        GiftcardDTO oGiftcarddto = new GiftcardDTO();
        oGiftcarddto.setEmailFrom(oGiftcard.getEmailFrom());
        oGiftcarddto.setEmailTo(oGiftcard.getEmailTo());
        oGiftcarddto.setCreateDate(oGiftcard.getCreateDate());
        oGiftcarddto.setExpiredDate(oGiftcard.getExpiredDate());
        oGiftcarddto.setUsedDate(oGiftcard.getUsedDate());

        return oGiftcarddto;
    }

}
