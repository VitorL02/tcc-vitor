package br.com.vitortccappspring.tccvitor.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import  feign.Logger;
@Configuration
public class FeignClientConfiguration {

    @Bean
    Logger.Level feignLoggerLevel(){return  Logger.Level.FULL ; }
}