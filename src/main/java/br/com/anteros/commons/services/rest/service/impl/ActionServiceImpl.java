package br.com.anteros.commons.services.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import br.com.anteros.commons.services.rest.repository.ActionRepository;
import br.com.anteros.commons.services.rest.service.ActionService;
import br.com.anteros.persistence.session.repository.Page;
import br.com.anteros.persistence.session.repository.PageRequest;
import br.com.anteros.security.store.sql.domain.Action;
import br.com.anteros.spring.service.SpringSQLService;

/**
*  Generated by Anteros Generator Maven Plugin at 23/10/2019 10:25:34
**/

@Service("actionService")
@Scope("prototype")
public class ActionServiceImpl extends SpringSQLService<Action, Long> implements ActionService {
	
	@Autowired
	private ActionRepository actionRepository;
	

	@Override
	public Page<Action> getActionsBySystem(String system, PageRequest pageRequest, String fieldsToForceLazy, String sort) {
		return actionRepository.getActionsBySystem(system, pageRequest, fieldsToForceLazy,sort);
	}

}
