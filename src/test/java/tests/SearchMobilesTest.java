package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.SearchMobiles;

import java.time.Duration;

public class SearchMobilesTest extends BaseTest {
    @Test(priority = 1)
    public void searchMobiles()
    {
        SearchMobiles searchmobiles=new SearchMobiles(driver);
        searchmobiles.searchMobiles("Mobiles");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
    }
}
