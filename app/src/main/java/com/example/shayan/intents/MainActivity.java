package com.example.shayan.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data  = (EditText) findViewById(R.id.data);
    }

    public void switchs(View view){
        Intent i = new Intent(this,Second.class);
        String msg= data.getText().toString();
        i.putExtra("MyMsg",msg);
        startActivity(i);

    }
}
