package edu.pe.unsch.entity;
// Generated 24-jul-2019 22:01:26 by Hibernate Tools 5.1.10.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class EscuelaProfesional.
 * @see edu.pe.unsch.entity.EscuelaProfesional
 * @author Hibernate Tools
 */
@Stateless
public class EscuelaProfesionalHome {

	private static final Log log = LogFactory.getLog(EscuelaProfesionalHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(EscuelaProfesional transientInstance) {
		log.debug("persisting EscuelaProfesional instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(EscuelaProfesional persistentInstance) {
		log.debug("removing EscuelaProfesional instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public EscuelaProfesional merge(EscuelaProfesional detachedInstance) {
		log.debug("merging EscuelaProfesional instance");
		try {
			EscuelaProfesional result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public EscuelaProfesional findById(int id) {
		log.debug("getting EscuelaProfesional instance with id: " + id);
		try {
			EscuelaProfesional instance = entityManager.find(EscuelaProfesional.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
