package com.example.layouteventlistener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void NextScreen(View view) {
        Intent ns=new Intent(this,WelcomeActivity.class);
        EditText E1=(EditText)findViewById(R.id.txtfname);
        EditText E2 =(EditText)findViewById(R.id.txtlname);
        ns.putExtra("fname",E1.getText().toString());
        ns.putExtra("lname",E2.getText().toString());
        startActivity(ns);
    }
}