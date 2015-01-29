package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TwitterListModel {
	
	private int count;
	private ArrayList<LonelyTweetModel> tweets;
	
	public TwitterListModel(){
		
		count = 0;
		tweets=new ArrayList<LonelyTweetModel>();
	}

	
	public int getCount(){
		
		return count;		
	}
	
	public ArrayList<LonelyTweetModel> getTweets(){
		
		
		return tweets;
		
	}


	public void addTweet(LonelyTweetModel tweet) throws IllegalArgumentException{
		// TODO Auto-generated method stub
		for (LonelyTweetModel l: tweets){
			if (l.equals(tweet)){
				throw new IllegalArgumentException("Input exist");
			}			
		}
		tweets.add(tweet);
		count++;
	}
}
