package com.example.shayan.intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by shayan on 1/22/2017.
 */
public class Second extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        Bundle mydata = getIntent().getExtras();
        if(mydata==null){
            return;
        }
        String msg= mydata.getString("MyMsg");
        TextView output = (TextView) findViewById(R.id.output);
        output.setText(msg);
    }

    public void switchs(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);

    }

}
