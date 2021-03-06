package org.simplilearn.workshop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import(InfraStructureConfig.class)
@ComponentScan(basePackages = "org.simplilearn.workshop.repository , org.simplilearn.workshop.service")
public class CustomerServiceConfig {

	
}
