/**
 * 
 */
package com.globant.autoTraining.appium.appiumTwitter.activities;

import java.util.List;

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
	
	@AndroidFindBy(className="android.widget.FrameLayout")
	private AndroidElement frmLayout;
	
	@AndroidFindBy(className="android.widget.ScrollView")
	private AndroidElement frmAllowMessage;
	
	@AndroidFindBy(id ="android:id/button1")
	private AndroidElement btnOkLocationQuestion;
	
	@AndroidFindBy(id ="com.android.packageinstaller:id/permission_allow_button")
	private AndroidElement btnAllowQuestion;
	
	@AndroidFindBy(id="com.twitter.android:id/row")
	private List<AndroidElement> lstTweets;
	
	public ViewPagerActivity(AppiumDriver driver) {
		super(driver);
	}
	
	public ViewPagerActivity writeTweet(String message) {
		sendKeys(inputTweet, message);
		return this;
	}
	
	public ViewPagerActivity acceptPopWindows() {
		acceptLocationQuestion();
		acceptAllowAccess();
		
		return this;
	}
	
	private void acceptLocationQuestion() {
		if(frmAllowMessage.isDisplayed()) {
			click(btnOkLocationQuestion);
		}
	}
	
	private void acceptAllowAccess() {
		if(frmAllowMessage.isDisplayed()) {
			click(btnAllowQuestion);
		}
	}
	
	public TweetActivity selectATweet(int index) {
		click(lstTweets.get(index));
		return new TweetActivity(driver);
	}

}
