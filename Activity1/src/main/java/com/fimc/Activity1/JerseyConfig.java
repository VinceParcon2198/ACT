package com.fimc.Activity1;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.stereotype.Component;

import com.fimc.resource.CalculatorResource;
import com.fimc.resource.WorkerResource;

@Component
public class JerseyConfig extends ResourceConfig{

	public JerseyConfig() {
//		register(GtgResource.class);
		register(CalculatorResource.class);
		register(WorkerResource.class);
		property(ServletProperties.FILTER_FORWARD_ON_404, true);
		
		
	}
}
