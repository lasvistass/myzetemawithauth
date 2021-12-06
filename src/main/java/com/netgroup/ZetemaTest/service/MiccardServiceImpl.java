package com.netgroup.ZetemaTest.service;

import com.netgroup.ZetemaTest.converter.MiccardConverter;
import com.netgroup.ZetemaTest.data.dto.MiccardDTO;
import com.netgroup.ZetemaTest.data.entity.Miccard;
import com.netgroup.ZetemaTest.repository.MiccardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MiccardServiceImpl implements MiccardService {

    @Autowired
    MiccardRepository MiccardRepository;

    @Override
    public List<MiccardDTO> elenco() {
    	
        List<Miccard> Miccards = MiccardRepository.findAll();
        List<MiccardDTO> Miccardsdto = new ArrayList<>();
        for(Miccard oMiccard:Miccards){
            Miccardsdto.add(MiccardConverter.convertFromDaoToDto(oMiccard));
        }
        return Miccardsdto;
    }

    @Override
    public MiccardDTO findMiccard(Integer id) {
    	
        Miccard oMiccard = MiccardRepository.findById(id).get();

        MiccardDTO oMiccarddto = MiccardConverter.convertFromDaoToDto(oMiccard);

        return oMiccarddto;
    }

    @Override
    public void salva(Miccard oMiccard) {
        MiccardRepository.save(oMiccard);
    }

    @Override
    public void deleteMiccard(Integer id) {
        MiccardRepository.deleteById(id);
    }

	@Override
	public boolean checkDate(Miccard miccard) {
		return miccard.getIsExpired();
	}

	@Override
	public void setExpired(Integer id) {
		Date date = new Date();
		Miccard miccard = MiccardRepository.findById(id).get();
		Date date2 = miccard.getExpiredDate();
		if ( date.before(date2) ) {
			MiccardRepository.updateExpired(false, id);
		}else {
			MiccardRepository.updateExpired(true, id);
		}
		
	}
	
	
	
	
    
//    public void setScadenza(Miccard miccard) {
//    	if(miccard.getExpiredDate().after(new Date())){
//    		miccard.setExpired(true);
//    	}
//    }
    
   
}
