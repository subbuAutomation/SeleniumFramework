package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    private static WebDriverManager driver;


    public static WebDriver getDriver()
    {
        if(driver==null)
        {
            driver= new WebDriverManager();
        }
        return (WebDriver) driver;
    }
//    public void closeDriver()
//    {
//        if(driver!=null)
//        {
//            driver.quit();
//        }
//    }
}
