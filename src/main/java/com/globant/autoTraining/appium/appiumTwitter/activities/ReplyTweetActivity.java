/**
 * 
 */
package com.globant.autoTraining.appium.appiumTwitter.activities;

import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * @author jose.negrete
 *
 */
public class ReplyTweetActivity extends BaseActivity {
	@AndroidFindBy(id="com.twitter.android:id/tweet_text")
	AndroidElement inputTweetText;
	
	@AndroidFindBy(id="com.twitter.android:id/composer_post")
	AndroidElement btnComposerPost;

	public ReplyTweetActivity(AppiumDriver driver) {
		super(driver);
	}

	public TweetActivity replyTweet(String replyMessage) {
		// Escribiendo el reply
		click(inputTweetText);
		sendKeys(inputTweetText, replyMessage);
		
		// Seleccionando el botón de Reply
		// Obteniendo las tablas de los elementos agregados
//		getWait().until(ExpectedConditions.elementToBeClickable(btnComposerPost));
		click(btnComposerPost);
		
		return new TweetActivity(driver);
	}
}
