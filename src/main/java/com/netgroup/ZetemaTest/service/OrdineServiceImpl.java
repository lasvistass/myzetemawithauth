package com.netgroup.ZetemaTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netgroup.ZetemaTest.converter.OrdineConvert;
import com.netgroup.ZetemaTest.data.dto.OrdineDTO;
import com.netgroup.ZetemaTest.data.entity.Miccard;
import com.netgroup.ZetemaTest.data.entity.Ordine;
import com.netgroup.ZetemaTest.repository.GiftcardRepository;
import com.netgroup.ZetemaTest.repository.MiccardRepository;
import com.netgroup.ZetemaTest.repository.OrdineRepository;
import com.netgroup.ZetemaTest.repository.StoreRepository;

@Service
public class OrdineServiceImpl implements OrdineService{

	@Autowired
	OrdineRepository ordineRepository;
	
	@Autowired
	OrdineConvert ordineConvert;
	
	@Autowired
	MiccardRepository miccardRepository;
	
	@Autowired
	GiftcardRepository giftcardRepository;
	
	@Autowired
	StoreRepository storeRepository;

	@Override
	public OrdineDTO getOrdineById(Integer id) {
		return ordineConvert.convertOrdineInDTO(ordineRepository.findById(id).get());
	}

	@Override
	public List<OrdineDTO> getAllOrdineDTO() {
		return ordineConvert.convertListOrdineInDTO(ordineRepository.findAll());
	}

	@Override
	public Ordine saveOrdine(Ordine ordine) {
		return ordineRepository.save(ordine);
	}

	@Override
	public Ordine deleteOrdine(Integer id) {
		Ordine ordine = ordineRepository.findById(id).get();
		ordineRepository.delete(ordine);
		return ordine;
	}

	@Override
	public void setExpiredMIccard(Integer id) {
		Ordine ordine = ordineRepository.findById(id).get();
		Miccard miccard = ordine.getMicard();
		Integer idM = miccard.getId();
		boolean b = ordine.isBilled();
		if (b) {
			miccardRepository.updateExpired(true, idM);
		}
	}

	@Override
	public OrdineDTO addGiftcard(Integer idOrdine, Integer idGiftCard) {
		Ordine ordine = ordineRepository.findById(idOrdine).get();
		ordine.setGiftcard(giftcardRepository.findById(idGiftCard).get());
		ordineRepository.save(ordine);
		return ordineConvert.convertOrdineInDTO(ordine);
	}

	@Override
	public void addMiccard(Integer[] id) {
		Ordine ordine = ordineRepository.findById(id[0]).get();
		ordine.setMicard(miccardRepository.findById(id[1]).get());
		ordineRepository.save(ordine);
		ordineConvert.convertOrdineInDTO(ordine);
	}

	@Override
	public void addStore(Integer[] id) {
		Ordine ordine = ordineRepository.findById(id[0]).get();
		ordine.setStore(storeRepository.findById(id[1]).get());
		ordineRepository.save(ordine);
		ordineConvert.convertOrdineInDTO(ordine);
	}
	
	
	
	
	
}
