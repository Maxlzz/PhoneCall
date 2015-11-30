package com.example.max.phonecall;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class CallActivity extends Activity {






    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phone_call);
        Button button = (Button) this.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             EditText mobileText =(EditText) findViewById(R.id.mobile);
                String number = mobileText.getText().toString();

                Intent i=new Intent(Intent.ACTION_CALL,Uri.parse("tel："+number));//拨打电话
                startActivity(i);



            }





        });

    }

}
