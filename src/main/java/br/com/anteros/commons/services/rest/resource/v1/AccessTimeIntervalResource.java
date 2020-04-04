package br.com.anteros.commons.services.rest.resource.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.Lazy;

import br.com.anteros.security.store.sql.domain.AccessTimeInterval;
import br.com.anteros.commons.services.rest.service.AccessTimeIntervalService;
import br.com.anteros.persistence.session.service.SQLService;
import br.com.anteros.security.spring.AnterosSecurityManager;
import br.com.anteros.spring.web.resource.AbstractSQLResourceRest;
import br.com.anteros.persistence.session.repository.Page;
import br.com.anteros.persistence.session.repository.PageRequest;
import br.com.anteros.persistence.session.repository.Pageable;
import br.com.anteros.persistence.session.repository.impl.PageImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
*  Generated by Anteros Generator Maven Plugin at 29/12/2019 08:16:42
**/

@RestController
@RequestMapping(value = "/v1/accessTimeInterval")
public class AccessTimeIntervalResource extends AbstractSQLResourceRest<AccessTimeInterval, Long> {

	@Autowired
	@Lazy
	private AccessTimeIntervalService accessTimeIntervalService;

	@Autowired
	@Lazy
	protected AnterosSecurityManager anterosSecurityManager;

	@Override
	public SQLService<AccessTimeInterval, Long> getService() {
		return accessTimeIntervalService;
	}
	
	@Override
	protected Page<AccessTimeInterval> createConcretePage(List<AccessTimeInterval> content, PageRequest pageRequest,
			long totalElements) {
		return new PageAccessTimeInterval(content, pageRequest, totalElements);
	}

	class PageAccessTimeInterval extends PageImpl<AccessTimeInterval> {
		public PageAccessTimeInterval(List<AccessTimeInterval> content) {
			super(content);
		}

		public PageAccessTimeInterval(List<AccessTimeInterval> content, Pageable pageable, long total) {
			super(content, pageable, total);
		}
	}
	
	@Override
	protected List<AccessTimeInterval> createConcreteList(List<AccessTimeInterval> result) {
		return new ListAccessTimeInterval(result);
	}
	
	class ListAccessTimeInterval extends ArrayList<AccessTimeInterval>{
		public ListAccessTimeInterval(Collection<? extends AccessTimeInterval> c) {
			super(c);
		}
	}
}