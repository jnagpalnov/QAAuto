package driversetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Created by jatin on 2/10/15.
 */
public class DriverFactory {
    public enum BrowserType{
        FIREFOX,CHROME
    }

    private static BrowserType browserType;
    private static WebDriver driver;
    public static Boolean isInstanceExists=false;

    private DriverFactory(){}
    

    public static WebDriver getDriverInstance(){
        if(!isInstanceExists){
            driver=getDriver();
            isInstanceExists=true;
        }
        return driver;
    }

    public static void setBrowser(String browserType){
        if(browserType.equals("CHROME")){
           DriverFactory.browserType=BrowserType.CHROME;
        }
        else if(browserType.equals("FIREFOX")){
           DriverFactory.browserType=BrowserType.FIREFOX;
       }
    }

    private static WebDriver getDriver(){
        switch (browserType){
            case FIREFOX:
                System.out.println("Initiating Firefox driver");
                driver=new FirefoxDriver();
                return driver;
            default:
                return null;
        }
    }
}
