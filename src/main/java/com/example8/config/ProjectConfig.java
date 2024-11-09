package com.example8.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example8.components", "com.example8.services"})
public class ProjectConfig {
}
