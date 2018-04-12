package com.globant.autoTraining.appium.appiumTwitter.activities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class StartActivity extends BaseActivity {

    @AndroidFindBy(id = "com.twitter.android:id/sign_in_text")
    private AndroidElement loginButton;

    public StartActivity(AppiumDriver driver) {
        super(driver);
    }

    public LoginActivity clickLogin() {
        click(loginButton);
        return new LoginActivity(driver);
    }

}
