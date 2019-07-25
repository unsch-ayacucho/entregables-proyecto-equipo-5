package edu.pe.unsch.entity;
// Generated 24-jul-2019 22:01:26 by Hibernate Tools 5.1.10.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Resolucion.
 * @see edu.pe.unsch.entity.Resolucion
 * @author Hibernate Tools
 */
@Stateless
public class ResolucionHome {

	private static final Log log = LogFactory.getLog(ResolucionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Resolucion transientInstance) {
		log.debug("persisting Resolucion instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Resolucion persistentInstance) {
		log.debug("removing Resolucion instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Resolucion merge(Resolucion detachedInstance) {
		log.debug("merging Resolucion instance");
		try {
			Resolucion result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Resolucion findById(int id) {
		log.debug("getting Resolucion instance with id: " + id);
		try {
			Resolucion instance = entityManager.find(Resolucion.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
