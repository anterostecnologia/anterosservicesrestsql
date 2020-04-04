package br.com.anteros.commons.services.rest.service;

import br.com.anteros.security.spring.ResourceSecured;
import br.com.anteros.security.spring.sql.service.SQLServiceSecured;
import br.com.anteros.security.store.sql.domain.Profile;

/**
*  Generated by Anteros Generator Maven Plugin at 23/10/2019 10:25:34
**/

@ResourceSecured(resourceName = "Profile", description = "Profile")
public interface ProfileService extends SQLServiceSecured<Profile, Long> {

}
