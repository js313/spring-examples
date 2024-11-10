package com.example8.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.example8.components", "com.example8.services", "com.example8.aspects"})
@EnableAspectJAutoProxy
public class ProjectConfig {
}
