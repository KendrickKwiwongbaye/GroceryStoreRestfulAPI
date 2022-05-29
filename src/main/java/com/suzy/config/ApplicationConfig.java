package com.suzy.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@Configuration
@EnableJpaRepositories(basePackages = "com.suzy.repo")
@EntityScan(basePackages = "com.suzy.entity")
public class ApplicationConfig {
}
