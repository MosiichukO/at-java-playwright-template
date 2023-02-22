package Project_E2E;

import App.Pages.SignInPage;
import Core.Config;
import org.junit.jupiter.api.*;

import static RunConfig.RunConfigurations.closeBrowser;
import static RunConfig.RunConfigurations.initializeBrowser;

public class SignInTest {

    private static SignInPage signInPage;


    @BeforeEach
    public void setUp() {
        signInPage = new SignInPage(initializeBrowser());
        signInPage.navigate();
    }

    @AfterEach
    public void tearDown() {
        closeBrowser();
    }


    @Test
    @Order(1)
    @DisplayName("Log in as active User")
    public void loginAsActiveUser() {
        signInPage.setEmail(Config.user_email);
        signInPage.setPassword(Config.user_password);
        signInPage.clickLoginButton();
        // check user is logged in
    }
}
