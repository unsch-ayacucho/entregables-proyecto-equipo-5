package edu.pe.unsch.entity;
// Generated 24-jul-2019 22:01:26 by Hibernate Tools 5.1.10.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class DocumentoOrigen.
 * @see edu.pe.unsch.entity.DocumentoOrigen
 * @author Hibernate Tools
 */
@Stateless
public class DocumentoOrigenHome {

	private static final Log log = LogFactory.getLog(DocumentoOrigenHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(DocumentoOrigen transientInstance) {
		log.debug("persisting DocumentoOrigen instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(DocumentoOrigen persistentInstance) {
		log.debug("removing DocumentoOrigen instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public DocumentoOrigen merge(DocumentoOrigen detachedInstance) {
		log.debug("merging DocumentoOrigen instance");
		try {
			DocumentoOrigen result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DocumentoOrigen findById(int id) {
		log.debug("getting DocumentoOrigen instance with id: " + id);
		try {
			DocumentoOrigen instance = entityManager.find(DocumentoOrigen.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
