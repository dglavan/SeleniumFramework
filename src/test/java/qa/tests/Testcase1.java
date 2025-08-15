package qa.tests;

import PageEvents.HomePageEvents;
import PageEvents.LoginPageEvents;
import base.BaseTest;
import org.testng.annotations.Test;
import utils.ElementFetch;

public class Testcase1 extends BaseTest {
    ElementFetch ele = new ElementFetch();
    HomePageEvents homePage = new HomePageEvents();
    LoginPageEvents loginPage = new LoginPageEvents();

    @Test
    public void sampleMethodForEnteringCredentials(){
        homePage.signInButton();
        loginPage.verifyIfLoginIsLoaded();
        loginPage.enterCredentials();
    }
}
