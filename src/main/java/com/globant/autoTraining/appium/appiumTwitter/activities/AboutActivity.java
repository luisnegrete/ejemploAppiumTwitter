package com.globant.autoTraining.appium.appiumTwitter.activities;

import java.util.List;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class AboutActivity extends BaseActivity {

    public AboutActivity(AppiumDriver driver) {
        super(driver);
    }

    public LegalActivity clickLegalNotices() {
        List<AndroidElement> elements = driver.findElements(By.id("android:id/title"));

        for (AndroidElement element : elements) {
            if (element.getText().equals("Legal notices")) {
                click(element);
                break;
            }
        }
        return new LegalActivity(driver);
    }
}
