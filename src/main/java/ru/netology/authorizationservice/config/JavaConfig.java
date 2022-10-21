package ru.netology.authorizationservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import ru.netology.authorizationservice.LoggingAspect;

@Configuration
@ComponentScan(basePackages = "ru.netology.authorizationservice")
@EnableAspectJAutoProxy
public class JavaConfig {

    @Bean
    public LoggingAspect aspect() {
        return new LoggingAspect();
    }
}
