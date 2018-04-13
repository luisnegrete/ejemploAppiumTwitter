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
public class TweetActivity extends BaseActivity {

	@AndroidFindBy(id="com.twitter.android:id/reply")
	private AndroidElement btnReply;
	
	public TweetActivity(AppiumDriver driver) {
		super(driver);
	}
	
	public ReplyTweetActivity selectReplyTweet() {
		click(btnReply);
		return new ReplyTweetActivity(driver);
	}

}
