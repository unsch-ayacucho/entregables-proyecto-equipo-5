package edu.pe.unsch.entity;
// Generated 24-jul-2019 22:01:26 by Hibernate Tools 5.1.10.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Dictamen.
 * @see edu.pe.unsch.entity.Dictamen
 * @author Hibernate Tools
 */
@Stateless
public class DictamenHome {

	private static final Log log = LogFactory.getLog(DictamenHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Dictamen transientInstance) {
		log.debug("persisting Dictamen instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Dictamen persistentInstance) {
		log.debug("removing Dictamen instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Dictamen merge(Dictamen detachedInstance) {
		log.debug("merging Dictamen instance");
		try {
			Dictamen result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Dictamen findById(int id) {
		log.debug("getting Dictamen instance with id: " + id);
		try {
			Dictamen instance = entityManager.find(Dictamen.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
