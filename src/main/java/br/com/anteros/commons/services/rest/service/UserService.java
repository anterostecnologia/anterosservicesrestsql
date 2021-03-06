package br.com.anteros.commons.services.rest.service;

import java.util.List;

import br.com.anteros.security.spring.ResourceSecured;
import br.com.anteros.security.spring.sql.service.SQLServiceSecured;
import br.com.anteros.security.store.sql.domain.User;

/**
*  Generated by Anteros Generator Maven Plugin at 23/10/2019 10:25:34
**/

@ResourceSecured(resourceName = "User", description = "User")
public interface UserService extends SQLServiceSecured<User, Long> {

	User getUserByLoginName(String login);

}
