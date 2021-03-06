package br.com.anteros.commons.services.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import br.com.anteros.commons.services.rest.repository.ResourceRepository;
import br.com.anteros.commons.services.rest.service.ResourceService;
import br.com.anteros.persistence.dsl.osql.types.OrderSpecifier;
import br.com.anteros.persistence.session.repository.Page;
import br.com.anteros.persistence.session.repository.PageRequest;
import br.com.anteros.security.store.sql.domain.Resource;
import br.com.anteros.spring.service.SpringSQLService;

/**
*  Generated by Anteros Generator Maven Plugin at 23/10/2019 10:25:34
**/

@Service("resourceService")
@Scope("prototype")
public class ResourceServiceImpl extends SpringSQLService<Resource, Long> implements ResourceService {

	@Autowired
	private ResourceRepository resourceRepository;
	
	@Override
	public Page<Resource> getResourcesBySystem(String system,PageRequest pageRequest, String fieldsToForceLazy, String sort) {
		return resourceRepository.getResourcesBySystem(system, pageRequest,fieldsToForceLazy,sort);
	}

}
