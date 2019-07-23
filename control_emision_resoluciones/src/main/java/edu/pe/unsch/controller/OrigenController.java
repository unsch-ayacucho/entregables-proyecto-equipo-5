package edu.pe.unsch.controller;

import org.springframework.web.bind.annotation.RestController;


import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import edu.pe.unsch.entities.Origen;
import edu.pe.unsch.service.OrigenServ;

@RestController
public class OrigenController {
	@Autowired
	protected OrigenServ origenServ;
	//convertir JSON en entitities y al reves
	@Autowired
	protected ObjectMapper objOrigen;
	
	
    @RequestMapping(value = "/SaveOpdateobjOrigen", method = RequestMethod.POST)
	public Origen GuardarOrigen(@RequestBody String jsonOrigen) 
			throws JsonParseException, JsonMappingException, IOException {		
		this.objOrigen = new ObjectMapper();
		
		Origen origen = this.objOrigen.readValue(jsonOrigen, Origen.class);
		
		
		// hacer validaciones
		
		
		// decimos para guardar		
		this.origenServ.SaveOrigen(origen);
		return origen;
	}
    @GetMapping("/listaOrigen")
    public List<Origen>  listaOrigen(){
    	return this.origenServ.GetListaOrigen();
    }

}
