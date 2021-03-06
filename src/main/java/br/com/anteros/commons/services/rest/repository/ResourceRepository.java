package br.com.anteros.commons.services.rest.repository;

import br.com.anteros.persistence.dsl.osql.types.OrderSpecifier;
import br.com.anteros.persistence.session.repository.Page;
import br.com.anteros.persistence.session.repository.PageRequest;
import br.com.anteros.persistence.session.repository.SQLRepository;
import br.com.anteros.security.store.sql.domain.Resource;

/**
*  Generated by Anteros Generator Maven Plugin at 23/10/2019 10:25:34
**/

public interface ResourceRepository extends SQLRepository<Resource, Long> {

	Page<Resource> getResourcesBySystem(String system, PageRequest pageRequest, String fieldsToForceLazy, String sort);

}
