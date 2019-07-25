package edu.pe.unsch.controller;


import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import edu.pe.unsch.entities.Resolution;
import edu.pe.unsch.service.ResolutionServ;

@RestController
public class ResolucionesController {
	@Autowired
	protected ResolutionServ resolutionServ;
	//convertir JSON en entitities y al reves
	@Autowired
	protected ObjectMapper objPersona;
	

    @RequestMapping(value = "/SaveOpdateResolution", method = RequestMethod.POST)
	public Resolution GuardarResolution(@RequestBody String jsonResolution) 
			throws JsonParseException, JsonMappingException, IOException {		
		this.objPersona = new ObjectMapper();
		
		Resolution resolution = this.objPersona.readValue(jsonResolution, Resolution.class);
		
		
		// hacer validaciones
		
		
		// decimos para guardar		
		this.resolutionServ.SaveResolution(resolution);
		return resolution;
	}
    @GetMapping("/listaResolution")
    public List<Resolution>  listaResolution(){
    	return this.resolutionServ.GetListaResolution();
    }
    
    @GetMapping("/listResolutionByTipo")
    public List<Resolution> listResolutionByTipo(@RequestParam long tipo){
     System.out.println("PRUEBAA <<<>>>>"+tipo);
    	return this.resolutionServ.listResolutionByTipo(tipo);
    }
}