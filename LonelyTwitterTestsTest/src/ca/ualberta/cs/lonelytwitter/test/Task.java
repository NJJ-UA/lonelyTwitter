package ca.ualberta.cs.lonelytwitter.test;

import java.util.Date;

import android.test.ActivityInstrumentationTestCase2;
import ca.ualberta.cs.lonelytwitter.ImportantTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;

public class Task extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public Task() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testImportant(){
		Date date= new Date(20141222);
		Date date2= new Date(20141212);
		ImportantTweetModel itm1= new ImportantTweetModel("Hi", date);
		ImportantTweetModel itm2= new ImportantTweetModel("Hi", date2);
		assertFalse("not equal", itm1.equals(itm2));
	}
	
	public void testNormal(){
		Date date= new Date(20141222);
		Date date2= new Date(20141212);
		NormalTweetModel itm1= new NormalTweetModel("Hi", date);
		NormalTweetModel itm2= new NormalTweetModel("Hi", date2);
		assertFalse("not equal", itm1.equals(itm2));
	}
	
	public void testLonely(){
		Date date= new Date(20141222);
		Date date2= new Date(20141212);
		LonelyTweetModel itm1= new LonelyTweetModel("Hi", date) {
			
			@Override
			public Date getTimestamp() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		LonelyTweetModel itm2= new LonelyTweetModel("Hi", date2) {
			
			@Override
			public Date getTimestamp() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		assertFalse("not equal", itm1.equals(itm2));
	}
	
	public void testMult(){
		Date date= new Date(20141222);
		NormalTweetModel itm1= new NormalTweetModel("Hi", date);
		ImportantTweetModel itm2= new ImportantTweetModel("Hi", date);
		assertFalse("not equal", itm2.equals(itm1));
	}
}
