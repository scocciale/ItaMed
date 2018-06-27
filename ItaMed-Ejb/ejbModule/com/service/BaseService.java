package com.service;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;

public class BaseService {
	@PersistenceContext(unitName = "ItaMedUnit")
	protected EntityManager em;
	
	protected Session getSession(EntityManager em) {
		return (Session) em.getDelegate();
	}
}