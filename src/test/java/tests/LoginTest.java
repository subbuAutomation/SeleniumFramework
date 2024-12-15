package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test(priority = 0)
    public void testValidLogin()
    {
        LoginPage loginpage=new LoginPage(driver);
        loginpage.clickHelloSignInField();
        loginpage.enterEmailField("msubramanyam650@gmail.com");
        loginpage.clickContinueButton();
        loginpage.enterPasswordField("B@subbu9");
        loginpage.clickSignInButton();
    }
}
