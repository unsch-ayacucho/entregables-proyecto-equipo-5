package edu.pe.unsch.service;

import java.util.List;
import edu.pe.unsch.entities.Resolution;
public interface ResolutionServ {
	Resolution SaveResolution(Resolution resolution);
	List<Resolution> GetListaResolution();
	
	List<Resolution> listResolutionByTipo(long tipo);
}
