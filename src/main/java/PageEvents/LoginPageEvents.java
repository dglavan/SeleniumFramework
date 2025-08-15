package PageEvents;

import PageObjects.LoginPageElements;
import org.testng.Assert;
import utils.ElementFetch;

public class LoginPageEvents {
    ElementFetch ele = new ElementFetch();
    public void verifyIfLoginIsLoaded(){
        Assert.assertTrue(ele.getWebElements(
                "XPATH", LoginPageElements.loginText).size()>0, "Element not found");
    }

    public void enterCredentials(){
       ele.getWebElement("XPATH",LoginPageElements.emailAddress).sendKeys("ebollass@yahoo.com");
       ele.getWebElement("XPATH",LoginPageElements.passwordField).sendKeys("12345");
    }
}
