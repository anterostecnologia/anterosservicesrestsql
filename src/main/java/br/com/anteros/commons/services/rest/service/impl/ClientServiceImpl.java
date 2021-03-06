package br.com.anteros.commons.services.rest.service.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import br.com.anteros.security.store.sql.domain.Client;
import br.com.anteros.commons.services.rest.service.ClientService;
import br.com.anteros.spring.service.SpringSQLService;

/**
*  Generated by Anteros Generator Maven Plugin at 23/10/2019 10:25:34
**/

@Service("clientService")
@Scope("prototype")
public class ClientServiceImpl extends SpringSQLService<Client, Long> implements ClientService {

}
