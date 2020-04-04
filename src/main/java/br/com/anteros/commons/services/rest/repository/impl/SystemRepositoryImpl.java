package br.com.anteros.commons.services.rest.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Qualifier;

import br.com.anteros.security.store.sql.domain.System;
import br.com.anteros.commons.services.rest.repository.SystemRepository;
import br.com.anteros.persistence.session.SQLSessionFactory;
import br.com.anteros.persistence.session.repository.impl.GenericSQLRepository;

/**
*  Generated by Anteros Generator Maven Plugin at 23/10/2019 10:25:34
**/

@Repository("systemRepository")
public class SystemRepositoryImpl extends GenericSQLRepository<System, Long> implements SystemRepository {

	@Autowired
	public SystemRepositoryImpl(@Qualifier("sessionFactorySQL")SQLSessionFactory sessionFactory) {
		super(sessionFactory);
	}

}
