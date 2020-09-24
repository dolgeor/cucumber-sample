package com.currencycloud.providers;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "com.currencycloud.providers", features = "classpath:features")
public class RunCucumberTest {
}