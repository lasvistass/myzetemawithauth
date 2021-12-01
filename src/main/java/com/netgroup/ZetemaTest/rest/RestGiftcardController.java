package com.netgroup.ZetemaTest.rest;

import com.netgroup.ZetemaTest.data.dto.GiftcardDTO;
import com.netgroup.ZetemaTest.data.entity.Giftcard;
import com.netgroup.ZetemaTest.repository.GiftcardRepository;
import com.netgroup.ZetemaTest.service.GiftcardService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/giftcard")
public class RestGiftcardController {

    @Autowired
    GiftcardService Giftcardser;

    @ApiOperation(value = "get Giftcard da id", notes = "endpoint predisposto a ricercare e tornare un Giftcard", response = GiftcardDTO.class, produces = "application/json")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Giftcard trovato")})
    @GetMapping(value = "/{id}")
    public GiftcardDTO getByID(@PathVariable("id") Integer id) {

        GiftcardDTO oGiftcarddto = Giftcardser.findGiftcard(id);

        if (oGiftcarddto == null) {
            throw new EntityNotFoundException("Missing Entity");
        }else{
            return oGiftcarddto;
        }
    }

    @GetMapping
    public List<GiftcardDTO> getGiftcard() {
        return Giftcardser.elenco();
    }

    @PostMapping("/nuovagiftcard")
    public String createGiftcard(@Valid @RequestBody Giftcard oGiftcard, BindingResult result) {
        Giftcardser.salva(oGiftcard);
        return "Giftcard salvata";
    }

    @DeleteMapping("/{id}")
    public void deleteGiftcard(@PathVariable("id") Integer id) {
        Giftcardser.deleteGiftcard(id);
    }

    @PutMapping(value="/updategiftcard")
    public void modificaGiftcard(@RequestBody Giftcard oGiftcard) {
        Giftcardser.salva(oGiftcard);
    }

}
