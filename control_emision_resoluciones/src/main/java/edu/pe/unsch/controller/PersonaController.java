package edu.pe.unsch.controller;

import edu.pe.unsch.service.PersonaServ;
import edu.pe.unsch.entities.Persona;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class PersonaController {

	@Autowired
	protected PersonaServ personaServ;
	//convertir JSON en entitities y al reves
	@Autowired
	protected ObjectMapper objPersona;
	
	
    @RequestMapping(value = "/SaveOpdatePersona", method = RequestMethod.POST)
	public Persona GuardarPersona(@RequestBody String jsonPersona) 
			throws JsonParseException, JsonMappingException, IOException {		
		this.objPersona = new ObjectMapper();
		
		Persona persona = this.objPersona.readValue(jsonPersona, Persona.class);
		
		
		// hacer validaciones
		
		
		// decimos para guardar		
		this.personaServ.SavePersona(persona);
		return persona;
	}
    @GetMapping("/listaPersonas")
    public List<Persona>  listaPersona(){
    	return this.personaServ.GetListaPersona();
    }
	
}
