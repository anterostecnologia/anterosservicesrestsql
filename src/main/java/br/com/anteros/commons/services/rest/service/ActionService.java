package br.com.anteros.commons.services.rest.service;

import br.com.anteros.persistence.session.repository.Page;
import br.com.anteros.persistence.session.repository.PageRequest;
import br.com.anteros.security.spring.ActionSecured;
import br.com.anteros.security.spring.ResourceSecured;
import br.com.anteros.security.spring.sql.service.SQLServiceSecured;
import br.com.anteros.security.store.sql.domain.Action;

/**
*  Generated by Anteros Generator Maven Plugin at 23/10/2019 10:25:34
**/

@ResourceSecured(resourceName = "Action", description = "Action")
public interface ActionService extends SQLServiceSecured<Action, Long> {

	@ActionSecured(actionName="ACT_select", category="Busca", description="Buscar ações de um sistema")
	Page<Action> getActionsBySystem(String system, PageRequest pageRequest, String fieldsToForceLazy, String sort);

}
