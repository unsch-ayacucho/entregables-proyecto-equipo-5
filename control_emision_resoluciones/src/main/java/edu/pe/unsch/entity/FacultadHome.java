package edu.pe.unsch.entity;
// Generated 24-jul-2019 22:01:26 by Hibernate Tools 5.1.10.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Facultad.
 * @see edu.pe.unsch.entity.Facultad
 * @author Hibernate Tools
 */
@Stateless
public class FacultadHome {

	private static final Log log = LogFactory.getLog(FacultadHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Facultad transientInstance) {
		log.debug("persisting Facultad instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Facultad persistentInstance) {
		log.debug("removing Facultad instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Facultad merge(Facultad detachedInstance) {
		log.debug("merging Facultad instance");
		try {
			Facultad result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Facultad findById(int id) {
		log.debug("getting Facultad instance with id: " + id);
		try {
			Facultad instance = entityManager.find(Facultad.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
