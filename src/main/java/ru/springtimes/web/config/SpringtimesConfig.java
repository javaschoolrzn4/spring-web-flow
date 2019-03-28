package ru.springtimes.web.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan(basePackages = "ru.springtimes", includeFilters = {
        @ComponentScan.Filter(type = FilterType.REGEX, pattern = "ru.springtimes.web.config.*"),
        @ComponentScan.Filter(type = FilterType.REGEX, pattern = "ru.springtimes.web.controller.*")
})
@PropertySource(value = {"classpath:springtimes.properties"}, ignoreResourceNotFound = true, encoding = "UTF-8")
public class SpringtimesConfig {
    @Value("${springtimes.init:o_O}")
    private String initMessage;

    @PostConstruct
    public void init() {
        System.out.println(initMessage);
    }
}