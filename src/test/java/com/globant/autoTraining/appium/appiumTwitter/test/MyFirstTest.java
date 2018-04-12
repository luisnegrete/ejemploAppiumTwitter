package com.globant.autoTraining.appium.appiumTwitter.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.globant.autoTraining.appium.appiumTwitter.activities.LegalActivity;
import com.globant.autoTraining.appium.appiumTwitter.activities.StartActivity;
import com.globant.autoTraining.appium.appiumTwitter.activities.ViewPagerActivity;

public class MyFirstTest extends BaseTest {

    @Test(description = "Display legal notices PASSED")
    public void displayLegalNoticesPASSTest() throws InterruptedException {
        StartActivity startActivity = new StartActivity(driver);
        LegalActivity legalActivity = startActivity
                .clickLogin()
                .fillData("roberto", "topsecret")
                .clickAbout()
                .clickLegalNotices()
                .swipeDown();
        Assert.assertTrue(true);
    }
    @DataProvider(name = "providerTestTwittSomething")
	public Object[][] createData1() {
		return new Object[][] { 
				{ "Mensaje de prueba 1 con appium"},
				{ "Mensaje de prueba 2 con appium"},
				};
	}

    
   // @Test(description = "Display legal notices PASSED", dataProvider="providerTestTwittSomething")
    public void testTwittSomething(String message) throws InterruptedException {
        StartActivity startActivity = new StartActivity(driver);
        ViewPagerActivity viewPagerActivity = startActivity
                .clickLogin()
                .fillData(" ", "")
                .clickLogin()
                .writeTweet(message);
        Assert.assertTrue(true);
    }

}
