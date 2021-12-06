package com.netgroup.ZetemaTest.rest;

import com.netgroup.ZetemaTest.data.dto.MiccardDTO;
import com.netgroup.ZetemaTest.data.entity.Giftcard;
import com.netgroup.ZetemaTest.data.entity.Miccard;
import com.netgroup.ZetemaTest.service.MiccardService;
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
@RequestMapping("/api/miccard")
public class MiccardController {

    @Autowired
    MiccardService Miccardser;

    @ApiOperation(value = "get Miccard da id", notes = "endpoint predisposto a ricercare e tornare un Miccard", response = MiccardDTO.class, produces = "application/json")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Miccard trovato")})
    @GetMapping(value = "/{id}")
    public MiccardDTO getByID(@PathVariable("id") Integer id) {

        MiccardDTO oMiccarddto = Miccardser.findMiccard(id);

        if (oMiccarddto == null) {
            throw new EntityNotFoundException("Missing Entity");
        }else{
            return oMiccarddto;
        }
    }

    @GetMapping
    public List<MiccardDTO> getMiccard() {
        return Miccardser.elenco();
    }

    @PostMapping("/nuovamiccard")
    public String createMiccard(@Valid @RequestBody Miccard oMiccard, BindingResult result) {
        Miccardser.salva(oMiccard);
        return "Miccard salvata";
    }

    @DeleteMapping("/{id}")
    public void deleteMiccard(@PathVariable("id") Integer id) {
        Miccardser.deleteMiccard(id);
    }

    @PutMapping(value="/updatemiccard")
    public void modificaMiccard(@RequestBody Miccard oMiccard) {
        Miccardser.salva(oMiccard);
    }
    
    @GetMapping(value="/expired/{id}")
    public void miccardExiperd(@PathVariable("id") Integer id) {
    	 Miccardser.setExpired(id);
    }

}
