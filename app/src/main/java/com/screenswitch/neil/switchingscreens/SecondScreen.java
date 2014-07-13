package com.screenswitch.neil.switchingscreens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondScreen extends Activity { //as it is an activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_layout);

        Intent activityThatCalled = getIntent();
        String fromPreviousActivity = activityThatCalled.getExtras().getString("callingActivity"); //get String data from MainActivty by stating name of string: callingActivity

        TextView callingActivityMessage = (TextView) findViewById(R.id.calling_activity_info_text_view); //to show what the calling activity was
        callingActivityMessage.append(" " + fromPreviousActivity);
    }

    public void onSendUsersName(View view) {

        EditText usersNameEditText = (EditText) findViewById(R.id.users_name_edit_text);
        String usersName = String.valueOf(usersNameEditText.getText());

        Intent stringGoingBack = new Intent();
        stringGoingBack.putExtra("usersName", usersName);

        setResult(RESULT_OK, stringGoingBack); //to say everything is ok
        finish(); //close this activity and screen
    }
}
