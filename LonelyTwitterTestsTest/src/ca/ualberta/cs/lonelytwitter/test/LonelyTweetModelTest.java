package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import android.test.ActivityInstrumentationTestCase2;

public class LonelyTweetModelTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public LonelyTweetModelTest() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testSampleCode(){
		assertTrue("this is not true",isGreaterEqual(7, 6));
//		fail("this should fail");
	}
	private boolean isGreaterEqual(int i,int j){
		
		if (i>=j){
			return true;
		}
		return false;
	}

}
