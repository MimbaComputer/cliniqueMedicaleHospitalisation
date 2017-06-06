package org.mimba.bao.entities;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

public class ConfigurationId extends RepositoryRestMvcConfiguration{
	@Override
	protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Hospitalisation.class);

	}
}