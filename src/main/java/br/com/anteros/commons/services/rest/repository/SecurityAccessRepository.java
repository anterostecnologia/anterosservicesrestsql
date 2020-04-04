package br.com.anteros.commons.services.rest.repository;

import br.com.anteros.security.store.sql.domain.SecurityAccess;

import java.util.List;

import br.com.anteros.persistence.session.repository.SQLRepository;

/**
*  Generated by Anteros Generator Maven Plugin at 23/10/2019 10:25:34
**/

public interface SecurityAccessRepository extends SQLRepository<SecurityAccess, Long> {

	List<SecurityAccess> getSecurityAccessBySystem(String system);

}
