package com.task1.config;

import com.task1.components.Speaker;
import com.task1.components.Tyre;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
//@ComponentScan(basePackages = {"com.task1.components", "com.task1.services"})
@ComponentScan("com.task1.components")
@ComponentScan("com.task1.services")
public class ProjectConfig {
    @Primary
    @Bean("Sony")
    Speaker sonySpeaker() {
        Speaker speaker = new Speaker();
        speaker.setName("Sony");
        return speaker;
    }

    @Bean("Dolby")
    Speaker dolbySpeaker() {
        Speaker speaker = new Speaker();
        speaker.setName("Dolby");
        return speaker;
    }

    @Bean(name = "Bridgestone")
    Tyre bridgestoneTyre() {
        Tyre tyre = new Tyre();
        tyre.setName("BridgeStone");
        return tyre;
    }

    @Bean(value = "Michelin")
    Tyre michelinTyre() {
        Tyre tyre = new Tyre();
        tyre.setName("Michelin");
        return tyre;
    }
}
