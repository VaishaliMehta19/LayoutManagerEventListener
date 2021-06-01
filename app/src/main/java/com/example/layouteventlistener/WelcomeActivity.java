package com.example.layouteventlistener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Intent nn=getIntent();
        String fname=nn.getStringExtra("fname");
        String lname=nn.getStringExtra("lname");
        TextView ts=(TextView)findViewById(R.id.lblmyvalue);
        ts.setText(fname+lname);
    }
}