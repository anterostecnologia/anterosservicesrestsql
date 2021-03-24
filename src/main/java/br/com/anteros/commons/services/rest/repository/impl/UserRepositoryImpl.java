package br.com.anteros.commons.services.rest.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Qualifier;

import br.com.anteros.security.store.sql.domain.TUser;
import br.com.anteros.security.store.sql.domain.User;
import br.com.anteros.commons.services.rest.repository.UserRepository;
import br.com.anteros.persistence.dsl.osql.OSQLQuery;
import br.com.anteros.persistence.dsl.osql.types.expr.params.StringParam;
import br.com.anteros.persistence.session.SQLSessionFactory;
import br.com.anteros.persistence.session.repository.impl.GenericSQLRepository;

/**
*  Generated by Anteros Generator Maven Plugin at 23/10/2019 10:25:34
**/

@Repository("userRepository")
public class UserRepositoryImpl extends GenericSQLRepository<User, Long> implements UserRepository {

	@Autowired
	public UserRepositoryImpl(@Qualifier("sessionFactorySQL")SQLSessionFactory sessionFactory) {
		super(sessionFactory);
	}
	
	@Override
	public User getUserByLoginName(String login) {
		StringParam pLogin = new StringParam("PLOGIN");

		TUser tUser = new TUser("USU");

		User singleResult = new OSQLQuery(getSession()).from(tUser).where(tUser.login.equalsIgnoreCase(pLogin)).set(pLogin, login).readOnly(true)
				.singleResult(tUser.customProjection(tUser.id, tUser.email, tUser.boAdministrator,
						tUser.boFreeAccessTime, tUser.name, tUser.description, tUser.avatar, tUser._super.uuid));
		
		return singleResult;
	}


}
