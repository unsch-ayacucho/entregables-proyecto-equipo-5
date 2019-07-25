package edu.pe.unsch.entity;
// Generated 24-jul-2019 22:01:26 by Hibernate Tools 5.1.10.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Firma.
 * @see edu.pe.unsch.entity.Firma
 * @author Hibernate Tools
 */
@Stateless
public class FirmaHome {

	private static final Log log = LogFactory.getLog(FirmaHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Firma transientInstance) {
		log.debug("persisting Firma instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Firma persistentInstance) {
		log.debug("removing Firma instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Firma merge(Firma detachedInstance) {
		log.debug("merging Firma instance");
		try {
			Firma result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Firma findById(int id) {
		log.debug("getting Firma instance with id: " + id);
		try {
			Firma instance = entityManager.find(Firma.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
