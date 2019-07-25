package edu.pe.unsch.controller;


import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import edu.pe.unsch.entities.Emitido;

import edu.pe.unsch.service.EmitidoServ;


@RestController
public class EmitidoController {
	
	@Autowired
	protected EmitidoServ emitidoServ;
	//convertir JSON en entitities y al reves
	
	@Autowired
	protected ObjectMapper objEmitido;
	

    @RequestMapping(value = "/SaveOpdateEmitido", method = RequestMethod.POST)
	public Emitido GuardarEmitido(@RequestBody String jsonEmitido) 
			throws JsonParseException, JsonMappingException, IOException {		
		this.objEmitido = new ObjectMapper();
		
		Emitido emitido = this.objEmitido.readValue(jsonEmitido, Emitido.class);
		
		
		// hacer validaciones
		
		
		// decimos para guardar		
		this.emitidoServ.SaveEmitido(emitido);
		return emitido;
	}
    @GetMapping("/listaEmitido")
    public List<Emitido>  listaEmitido(){
    	return this.emitidoServ.GetListaEmitido();
    }

}
