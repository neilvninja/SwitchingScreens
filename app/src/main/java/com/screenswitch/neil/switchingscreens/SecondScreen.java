package com.screenswitch.neil.switchingscreens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondScreen extends Activity { //as it is an activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_layout);

        Intent activityThatCalled = getIntent();
        String previousActivity = activityThatCalled.getExtras().getString("callingActivity"); //get data from MainActivty by stating name of string: callingActivity

        TextView callingActivityMessage = (TextView) findViewById(R.id.calling_activity_info_text_view);
    }
}
