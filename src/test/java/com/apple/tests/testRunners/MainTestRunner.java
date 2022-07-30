package com.apple.tests.testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(plugin = {"pretty",
        "json:target/cucumber-reports/CucumberTestReport.json"},
        features = "src/test/resources/features",
        glue = {"com.apple.tests.stepDefinitions"}
)

public class MainTestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
