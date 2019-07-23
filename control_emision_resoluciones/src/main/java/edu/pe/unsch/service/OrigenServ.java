package edu.pe.unsch.service;

import java.util.List;

import edu.pe.unsch.entities.Origen;

public interface OrigenServ {
	Origen SaveOrigen(Origen origen);
	List<Origen> GetListaOrigen();
}
