package br.com.anteros.commons.services.rest.repository.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import br.com.anteros.commons.services.rest.repository.ResourceRepository;
import br.com.anteros.core.utils.StringUtils;
import br.com.anteros.persistence.dsl.osql.DynamicEntityPath;
import br.com.anteros.persistence.dsl.osql.OSQLQuery;
import br.com.anteros.persistence.dsl.osql.types.OrderSpecifier;
import br.com.anteros.persistence.metadata.EntityCache;
import br.com.anteros.persistence.session.SQLSessionFactory;
import br.com.anteros.persistence.session.query.filter.AnterosSortFieldsHelper;
import br.com.anteros.persistence.session.repository.Page;
import br.com.anteros.persistence.session.repository.PageRequest;
import br.com.anteros.persistence.session.repository.impl.GenericSQLRepository;
import br.com.anteros.persistence.session.repository.impl.PageImpl;
import br.com.anteros.security.store.sql.domain.Resource;
import br.com.anteros.security.store.sql.domain.TResource;

/**
 * Generated by Anteros Generator Maven Plugin at 23/10/2019 10:25:34
 **/

@Repository("resourceRepository")
public class ResourceRepositoryImpl extends GenericSQLRepository<Resource, Long> implements ResourceRepository {

	@Autowired
	public ResourceRepositoryImpl(@Qualifier("sessionFactorySQL") SQLSessionFactory sessionFactory) {
		super(sessionFactory);
	}


	@Override
	public Page<Resource> getResourcesBySystem(String system, PageRequest pageRequest, String fieldsToForceLazy,
			String sort) {
		TResource tResource = new TResource("RES");
		
		OSQLQuery queryCount = this.createObjectQuery();
		queryCount.from(tResource).where(tResource.system.name.eq(system));
		
		long total = queryCount.count();		
		List<OrderSpecifier> orderBy = AnterosSortFieldsHelper.convertFieldsToOrderby(this.getSession(),
				tResource, this.getResultClass(), sort);		
		
		OSQLQuery query = this.createObjectQuery();
		query.from(tResource);
		query.where(tResource.system.name.eq(system));
		query.orderBy(orderBy.toArray(new OrderSpecifier[] {}));
		query.setFieldsToForceLazy(fieldsToForceLazy);
		query.offset(pageRequest.getOffset());
		query.limit(pageRequest.getPageSize());
		
		List<Resource> content = total > pageRequest.getOffset() ? query.list(tResource) : Collections.<Resource>emptyList();

		return new PageImpl<Resource>(content, pageRequest, total);
	}

}
