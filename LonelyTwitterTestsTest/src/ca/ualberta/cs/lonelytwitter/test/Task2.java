package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TwitterListModel;
import android.test.ActivityInstrumentationTestCase2;

public class Task2 extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
	
	TwitterListModel tweets;

	public Task2() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		tweets =new TwitterListModel();
	}
	
	public void addTweetTest(){
		NormalTweetModel normalTweet=new NormalTweetModel("Hello");
		tweets.addTweet(normalTweet);
		try{
			tweets.addTweet(normalTweet);
		}catch (IllegalArgumentException e){
			assertTrue("success",false);
			
		}
//		
		
	}
	
//	public void testCounts(){
//		NormalTweetModel normalTweet=new NormalTweetModel("Hello");
//		tweets.addTweet(normalTweet);
//		assertEquals("Count should be zero",tweets.getCount(),1);
//		
//		
//	}
//	
//	public void testAddTweets(){
//		
//		NormalTweetModel normalTweet=new NormalTweetModel("Hi");
//		tweets.addTweet(normalTweet);
//		assertEquals("There should be a tweet in the list", 1,tweets.getTweets().size());
//		assertNotNull("the tweet list is not initialize",tweets.getTweets());
//	}


}
