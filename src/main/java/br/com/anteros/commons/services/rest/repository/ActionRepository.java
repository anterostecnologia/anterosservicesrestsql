package br.com.anteros.commons.services.rest.repository;

import br.com.anteros.persistence.session.repository.Page;
import br.com.anteros.persistence.session.repository.PageRequest;
import br.com.anteros.persistence.session.repository.SQLRepository;
import br.com.anteros.security.store.sql.domain.Action;

/**
*  Generated by Anteros Generator Maven Plugin at 23/10/2019 10:25:34
**/

public interface ActionRepository extends SQLRepository<Action, Long> {

	Page<Action> getActionsBySystem(String system, PageRequest pageRequest, String fieldsToForceLazy, String sort);

}
