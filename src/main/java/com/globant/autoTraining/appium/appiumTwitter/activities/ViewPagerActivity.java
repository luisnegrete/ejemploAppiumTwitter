/**
 * 
 */
package com.globant.autoTraining.appium.appiumTwitter.activities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * @author jose.negrete
 *
 */
public class ViewPagerActivity extends BaseActivity {

	@AndroidFindBy(id="com.twitter.android:id/tweet_text")
	private AndroidElement inputTweet;
	
	@AndroidFindBy(id ="com.twitter.android:id/composer_post")
	private AndroidElement btnComposerPost;
	
	public ViewPagerActivity(AppiumDriver driver) {
		super(driver);
	}
	
	public ViewPagerActivity writeTweet(String message) {
		sendKeys(inputTweet, message);
		return this;
	}
	
	public ViewPagerActivity sendTweet() {
		click(btnComposerPost);
		return this;
	}

}
