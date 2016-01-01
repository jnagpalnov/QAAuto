package driversetup;

import pageobjects.homepage.HomePage;

import java.util.*;

/**
 * Created by jatin on 3/10/15.
 */
public class PropertiesSetUP {
    public static ResourceBundle bundle;
    public PropertiesSetUP(){

    }

    public  static  ResourceBundle getResourceBundle(Class pageName, Locale locale){
        bundle = ResourceBundle.getBundle("com.google."+pageName.getSimpleName(),locale);
        return bundle;
    }
    /*public static void main(String[] args) {


        ResourceBundle bundle = ResourceBundle.getBundle("com.google.HomePage",Locale.US);

        System.out.println("Message in "+Locale.US +":"+bundle.getString("search"));
    }*/


    }
