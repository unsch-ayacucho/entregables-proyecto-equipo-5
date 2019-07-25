package edu.pe.unsch.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.unsch.dao.OrigenDAO;

import edu.pe.unsch.entities.Origen;

import edu.pe.unsch.service.OrigenServ;

@Service
public class OrigenSrvImplement  implements OrigenServ{

	@Autowired
	protected OrigenDAO daoOrigen;
	
	@Override
	public List<Origen> GetListaOrigen() {
		
		return this.daoOrigen.findAll();
	}
	@Override
	public Origen SaveOrigen(Origen origen) {
		// TODO Auto-generated method stub		
		
		return this.daoOrigen.save(origen);
	}
}
