package com.currencycloud.providers;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.Assert.assertEquals;

@RequiredArgsConstructor
public class RestClientStepDefinitions {

    private int status;

    private final TestRestTemplate testRestTemplate;

    @When("I call {word}")
    public void callUrl(final String url) {
        status = testRestTemplate.getForEntity(url, String.class).getStatusCode().value();
    }

    @Then("I should receive {int} http code")
    public void assertHttpCode(final int code) {
        assertEquals(code, status);
    }
}
