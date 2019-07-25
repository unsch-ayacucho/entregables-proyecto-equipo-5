package edu.pe.unsch.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import edu.pe.unsch.entities.Resolution;

public interface ResolutionDAO extends JpaRepository<Resolution, Long>{

	@Query("SELECT r FROM Resolution r WHERE r.tipo = :tipo")
	List<Resolution> listResolutionByTipo(@Param("tipo") long tipo);


}
