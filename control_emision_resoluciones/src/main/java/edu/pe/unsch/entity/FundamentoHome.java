package edu.pe.unsch.entity;
// Generated 24-jul-2019 22:01:26 by Hibernate Tools 5.1.10.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Fundamento.
 * @see edu.pe.unsch.entity.Fundamento
 * @author Hibernate Tools
 */
@Stateless
public class FundamentoHome {

	private static final Log log = LogFactory.getLog(FundamentoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Fundamento transientInstance) {
		log.debug("persisting Fundamento instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Fundamento persistentInstance) {
		log.debug("removing Fundamento instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Fundamento merge(Fundamento detachedInstance) {
		log.debug("merging Fundamento instance");
		try {
			Fundamento result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Fundamento findById(int id) {
		log.debug("getting Fundamento instance with id: " + id);
		try {
			Fundamento instance = entityManager.find(Fundamento.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
