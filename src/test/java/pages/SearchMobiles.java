package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchMobiles {
    public WebDriver driver;

    By searchField=By.id("twotabsearchtextbox");

    public SearchMobiles(WebDriver driver)
    {
        this.driver=driver;
    }
    public void searchMobiles(String searchData)
    {
        driver.findElement(searchField).sendKeys(searchData);
    }
}
