package br.com.anteros.commons.services.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import br.com.anteros.commons.services.rest.repository.SecuritySessionRepository;
import br.com.anteros.commons.services.rest.service.SecuritySessionService;
import br.com.anteros.security.store.sql.domain.SecuritySession;
import br.com.anteros.spring.service.SpringSQLService;

/**
*  Generated by Anteros Generator Maven Plugin at 23/10/2019 10:25:34
**/

@Service("securitySessionService")
@Scope("prototype")
public class SecuritySessionServiceImpl extends SpringSQLService<SecuritySession, Long> implements SecuritySessionService {
	
	@Autowired
	private SecuritySessionRepository securitySessionRepository;

	@Override
	public List<SecuritySession> getSessionsBySystem(String system) {
		return securitySessionRepository.getSessionsBySystem(system);
	}

}
