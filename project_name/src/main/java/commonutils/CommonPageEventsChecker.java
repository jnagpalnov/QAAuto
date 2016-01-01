package commonutils;

import driversetup.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

/**
 * Created by jatin on 11/10/15.
 */
abstract public class CommonPageEventsChecker {
    public static WebDriver driver= DriverFactory.getDriverInstance();
    public static boolean isWebElementPresent(By by){
        try{
            return driver.findElement(by)!= null;
        }catch(NoSuchElementException e){
            return false;
        }
    }

    public static boolean isWebElementDisplayed(By by){
        return isWebElementPresent(by) && driver.findElement(by).isDisplayed();
    }
}
