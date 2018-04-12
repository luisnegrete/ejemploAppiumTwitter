package com.globant.autoTraining.appium.appiumTwitter.test;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseTest {

    public AppiumDriver<MobileElement> driver;

    @Parameters({"port_","apkName"})
    @BeforeMethod
    public void beforeMethod(String port, String apkName) throws IOException {
    	
    	
    	File app = new File("src/main/resources/" +  apkName);
    	
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("clearSystemFiles", "true");
        capabilities.setCapability("deviceName","Android Emulator");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.twitter.android");
        capabilities.setCapability("appActivity", ".StartActivity");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:" + port + "/wd/hub"), capabilities);
    }

    @AfterMethod
    public void afterMethod() {
        if (driver != null) {
            driver.quit();
        }
    }

}
