package App.Pages;

import Core.Config;
import Core.TestData;
import com.microsoft.playwright.Page;

public class SignInPage {

    Page page;

    public SignInPage(Page page) {
        this.page = page;
    }

    public void navigate() {
        page.navigate(TestData.STAGING_URL, new Page.NavigateOptions()
                .setTimeout(Double.parseDouble(Config.navigateTimeout)));
    }

    public void setEmail (String email) {
        page.locator(Locators.EMAIL_FIELD_LOGIN).fill(email);
    }

    public void setPassword (String password) {
        page.locator(Locators.PASSWORD_FIELD_LOGIN).fill(password);
    }

    public void clickLoginButton () {
        page.locator(Locators.LOGIN_BUTTON).click();
    }
}
