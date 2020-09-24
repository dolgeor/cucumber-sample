package com.currencycloud.providers;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.Bean;

@CucumberContextConfiguration
@SpringBootTest(classes = CucumberSpringContextConfiguration.class)
public class CucumberSpringContextConfiguration {

    @Bean
    public TestRestTemplate restTemplate() {
        return new TestRestTemplate();
    }
}
