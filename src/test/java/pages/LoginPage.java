package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;

    private By helloSignInField=By.id("nav-link-accountList-nav-line-1");
    private By emailField=By.id("ap_email");
    private By continueButton=By.id("continue");

    private By passwordField =By.id("ap_password");

    private By signinButton =By.id("auth-signin-button");

    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void clickHelloSignInField()
    {
        driver.findElement(helloSignInField).click();
    }
    public void enterEmailField(String email)
    {
        driver.findElement(emailField).sendKeys(email);
    }
    public void clickContinueButton()
    {
        driver.findElement(continueButton).click();
    }
    public void enterPasswordField(String password)
    {
        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickSignInButton()
    {
        driver.findElement(signinButton).click();
    }

}
