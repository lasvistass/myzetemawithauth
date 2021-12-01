package com.netgroup.ZetemaTest.converter;

import com.netgroup.ZetemaTest.data.dto.MiccardDTO;
import com.netgroup.ZetemaTest.data.entity.Miccard;

public class MiccardConverter {

    public static MiccardDTO convertFromDaoToDto(Miccard oMiccard) {
        MiccardDTO oMiccarddto = new MiccardDTO();
        oMiccarddto.setCreateDate(oMiccard.getCreateDate());
        oMiccarddto.setExpired(oMiccard.getIsExpired());
        oMiccarddto.setExpiredDate(oMiccard.getExpiredDate());
        oMiccarddto.setActivationDate(oMiccard.getActivationDate());
        oMiccarddto.setPhisicalCard(oMiccard.getPhisicalCard());
        oMiccarddto.setMiccardCode(oMiccard.getMiccardCode());
        oMiccarddto.setUtente(oMiccard.getUtente());

        return oMiccarddto;
    }

}
