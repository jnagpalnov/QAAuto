package commonutils;

import driversetup.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

/**
 * Created by jatin on 11/10/15.
 */
abstract public class CommonPageEvents {
    public static  WebDriver driver= DriverFactory.getDriverInstance();

    public static WebElement getWebElement(By by) {
        return driver.findElement(by);
    }

    public static void click(By by){
        try{
            getWebElement(by).click();
        }
        catch (Exception e){
            Reporter.log("Exeception : " +e.toString());
        }
    }

    public static void enterText(By by,String text){
        getWebElement(by).sendKeys(text);
    }


}
