package com.yystar.hoola.sports;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;

public class LoginActivity extends Activity {
    /** Called when the activity is first created. */
	
	private LinearLayout linearLayout, publish, change, more;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
        linearLayout = (LinearLayout)findViewById(R.id.home);
        publish =(LinearLayout)findViewById(R.id.publish);
        change =(LinearLayout)findViewById(R.id.change);
        more =(LinearLayout)findViewById(R.id.more);
        linearLayout.setBackgroundResource(R.drawable.tab_two_highlight);
        
        
        linearLayout.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				linearLayout.setBackgroundResource(R.drawable.tab_two_highlight);
				publish.setBackgroundResource(R.drawable.tab_one_normal);
				change.setBackgroundResource(R.drawable.tab_one_normal);
				more.setBackgroundResource(R.drawable.tab_one_normal);
			}
		});
       
        publish.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				publish.setBackgroundResource(R.drawable.tab_two_highlight);
				linearLayout.setBackgroundResource(R.drawable.tab_one_normal);
				change.setBackgroundResource(R.drawable.tab_one_normal);
				more.setBackgroundResource(R.drawable.tab_one_normal);
			}
		});
        
        change.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				change.setBackgroundResource(R.drawable.tab_two_highlight);
				linearLayout.setBackgroundResource(R.drawable.tab_one_normal);
				publish.setBackgroundResource(R.drawable.tab_one_normal);
				more.setBackgroundResource(R.drawable.tab_one_normal);
			}
		});
        
        
        more.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				more.setBackgroundResource(R.drawable.tab_two_highlight);
				linearLayout.setBackgroundResource(R.drawable.tab_one_normal);
				publish.setBackgroundResource(R.drawable.tab_one_normal);
				change.setBackgroundResource(R.drawable.tab_one_normal);
			}
		});
        
    }
    
}