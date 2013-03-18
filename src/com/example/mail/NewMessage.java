package com.example.mail;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NewMessage extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newmessage);
    }
    
    public void onClick(View view) {
    	Intent i1 = new Intent(this, NewMessage.class);
    	startActivity(i1);
    }
}