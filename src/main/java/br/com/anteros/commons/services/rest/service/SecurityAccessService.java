package br.com.anteros.commons.services.rest.service;

import java.util.List;

import br.com.anteros.security.spring.ActionSecured;
import br.com.anteros.security.spring.ResourceSecured;
import br.com.anteros.security.spring.sql.service.SQLServiceSecured;
import br.com.anteros.security.store.sql.domain.SecurityAccess;

/**
*  Generated by Anteros Generator Maven Plugin at 23/10/2019 10:25:34
**/

@ResourceSecured(resourceName = "SecurityAccess", description = "SecurityAccess")
public interface SecurityAccessService extends SQLServiceSecured<SecurityAccess, Long> {

	@ActionSecured(actionName="ACT_select", category="Busca", description="Buscar os terminais/recursos de um usuário em um sistema")
	List<SecurityAccess> getSecurityAccessBySystem(String system);

}
