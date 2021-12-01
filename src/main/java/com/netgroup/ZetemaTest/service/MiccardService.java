package com.netgroup.ZetemaTest.service;


import com.netgroup.ZetemaTest.data.dto.MiccardDTO;
import com.netgroup.ZetemaTest.data.entity.Miccard;

import java.util.List;

public interface MiccardService {

    List<MiccardDTO> elenco();

    MiccardDTO findMiccard(Integer id);

    void salva(Miccard oMiccard);

    void deleteMiccard(Integer id);

}
