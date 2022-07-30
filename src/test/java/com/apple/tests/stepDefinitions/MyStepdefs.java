package com.apple.tests.stepDefinitions;
import com.apple.tests.helpers.TestCaseContext;
import io.cucumber.java.en.Given;

import static com.apple.tests.helpers.TestCaseContext.getCONFIG;

public class MyStepdefs {

    private final TestCaseContext testCaseContext;

    public MyStepdefs(TestCaseContext testCaseContext) {
        this.testCaseContext = testCaseContext;
    }

    @Given("I open apple official website {string}")
    public void iOpenAppleOfficialWebsite(String url) {
        this.testCaseContext.getBrowser()
                .get(url);
    }
}
