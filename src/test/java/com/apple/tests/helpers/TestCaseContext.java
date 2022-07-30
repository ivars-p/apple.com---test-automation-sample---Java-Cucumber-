package com.apple.tests.helpers;

import com.apple.tests.browser.BrowserBuilder;
import com.apple.tests.config.Config;
import org.openqa.selenium.WebDriver;

public class TestCaseContext {

    private static Config CONFIG = Config.getInstance();

    private WebDriver BROWSER;

    public WebDriver getBrowser() {
        if (BROWSER == null) {
            BROWSER = new BrowserBuilder()
                    .setBrowserName(CONFIG.getBrowserName())
                    .build();
        }
        return BROWSER;
    }

    public static Config getCONFIG() {
        return TestCaseContext.CONFIG;
    }
}