package com.google.tests;

/**
 * Created by jatin on 8/8/15.
 */

import driversetup.DriverFactory;
import driversetup.PropertiesSetUP;
import org.openqa.selenium.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageobjects.homepage.HomePage;

import java.util.Locale;
import java.util.ResourceBundle;

public class HomePageTest {
    HomePage page;
    WebDriver driver;
    ResourceBundle bundle;
    String baseUrl="https://www.google.co.in";
    @Parameters({"browserType"})
    @BeforeTest
    public void setUp(@Optional String browserType) {
        DriverFactory.setBrowser(browserType);
        driver= DriverFactory.getDriverInstance();
        bundle= PropertiesSetUP.getResourceBundle(HomePage.class, Locale.US);
        page=new HomePage(driver,bundle);
    }

    @Test
    public void check() {
        driver.get(baseUrl);
        page
                .enterTextInSearchField();
        driver.close();
    }
}
