package edu.pe.unsch.entity;
// Generated 24-jul-2019 22:01:26 by Hibernate Tools 5.1.10.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Cc.
 * @see edu.pe.unsch.entity.Cc
 * @author Hibernate Tools
 */
@Stateless
public class CcHome {

	private static final Log log = LogFactory.getLog(CcHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Cc transientInstance) {
		log.debug("persisting Cc instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Cc persistentInstance) {
		log.debug("removing Cc instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Cc merge(Cc detachedInstance) {
		log.debug("merging Cc instance");
		try {
			Cc result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Cc findById(int id) {
		log.debug("getting Cc instance with id: " + id);
		try {
			Cc instance = entityManager.find(Cc.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
