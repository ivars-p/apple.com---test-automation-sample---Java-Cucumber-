package com.apple.tests.stepDefinitions;
import io.cucumber.java.en.Given;

public class MyStepdefs {

    @Given("I open web-site {string}")
    public void iOpenWebSiteAppleCom(String url) {
        System.out.println(url);
    }

}
