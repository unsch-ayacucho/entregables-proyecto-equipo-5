package edu.pe.unsch.service;

import java.util.List;
import edu.pe.unsch.entities.Emitido;

public interface EmitidoServ {
	Emitido SaveEmitido(Emitido emitido);
	List<Emitido> GetListaEmitido();
}
