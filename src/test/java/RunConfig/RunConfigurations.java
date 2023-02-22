package RunConfig;

import Core.Config;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class RunConfigurations {
    private static Browser browser;

    public static Page initializeBrowser() {
        browser = Playwright
                .create()
                .chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(Boolean.parseBoolean(Config.headless)));
        return browser.newPage();
    }


    public static void closeBrowser() {
        browser.close();
    }
}
