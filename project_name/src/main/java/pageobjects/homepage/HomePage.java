package pageobjects.homepage;

import commonutils.CommonPageEvents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import java.util.ResourceBundle;

/**
 * Created by jatin on 2/10/15.
 */
public class HomePage extends CommonPageEvents {
    private WebDriver driver;
    private ResourceBundle bundle;
    private By usernameBy = By.id("id_username");

    public HomePage(WebDriver driver,ResourceBundle bundle){
        this.driver=driver;
        this.bundle=bundle;
    }

    public HomePageChecker verify(){
        return new HomePageChecker();
    }

    public HomePage enterTextInSearchField(){
        Reporter.log("Enter Text in teext field");
        System.out.println(bundle.getString("search"));
        enterText(By.id(bundle.getString("search")),"Text");
        driver.findElement(By.id(bundle.getString("search"))).sendKeys("Jatin");
        return this;
    }


}
