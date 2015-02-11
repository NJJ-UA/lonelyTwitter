package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.IntentReaderActivity;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ViewAsserts;
import android.widget.TextView;
import ca.ualberta.cs.lonelytwitter.R;

public class IntentReaderActivityTest extends
		ActivityInstrumentationTestCase2<IntentReaderActivity> {

	public IntentReaderActivityTest() {
		super(IntentReaderActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	
	public void testSendText(){
		String text="Hello world";
		int code =IntentReaderActivity.NORMAL;
		IntentReaderActivity activity =startWithText(text, code);
		assertEquals("Did is text correct?",text,activity.getText());
		
	}
	
	public void testDoubleText(){
		String text ="Hello";
		IntentReaderActivity activity =startWithText(text, IntentReaderActivity.DOUBLE);
		assertEquals("Double transform working?",text+text,activity.getText());
		
	}
	
	public void testDisplayText(){
		String text ="Hello world";
		IntentReaderActivity activity =startWithText(text, IntentReaderActivity.NORMAL);
		assertEquals("correct text?",text,activity.getText());
		TextView view =(TextView) activity.findViewById(R.id.intentText);
		assertEquals("display correct?",text,view.getText().toString());
	}
	
	public void testReverse(){
		String text="I am a string";
		IntentReaderActivity activity =startWithText(text, IntentReaderActivity.REVERSE);
		assertEquals("reverse succeed?","gnirts a ma I",activity.getText());
		
		
	}
	
	public void testDefault(){
		Intent intent=new Intent();
		setActivityIntent(intent);
		TextView view =(TextView) getActivity().findViewById(R.id.intentText);
		assertEquals("display correct?","Defalt",view.getText().toString());
	}
	
	public void testVisible(){
		String text ="Hello world";
		IntentReaderActivity activity =startWithText(text, IntentReaderActivity.NORMAL);
		
		ViewAsserts.assertOnScreen(activity.getWindow().getDecorView(), activity.findViewById(R.id.intentText));
		
	}
	
	private IntentReaderActivity startWithText(String text,int code){
		Intent intent=new Intent();
		intent.putExtra(IntentReaderActivity.TEXT_KEY, text );
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, code );
		setActivityIntent(intent);
		return (IntentReaderActivity) getActivity();
	}
}
