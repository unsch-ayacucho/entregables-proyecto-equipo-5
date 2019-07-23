package edu.pe.unsch.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.unsch.dao.EmitidoDAO;

import edu.pe.unsch.entities.Emitido;

import edu.pe.unsch.service.EmitidoServ;

@Service
public class EmitidoSrvImplement implements EmitidoServ{
	@Autowired
	protected EmitidoDAO daoEmitido;
	
	@Override
	public List<Emitido> GetListaEmitido() {
		
		return this.daoEmitido.findAll();
	}
	@Override
	public Emitido SaveEmitido(Emitido emitido) {
		// TODO Auto-generated method stub		
		
		return this.daoEmitido.save(emitido);
	}
}
