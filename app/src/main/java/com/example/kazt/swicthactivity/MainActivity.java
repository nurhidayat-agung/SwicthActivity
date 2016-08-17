package com.example.kazt.swicthactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickButtonMainListener();
    }

    public void onClickButtonMainListener(){
        Button activity1 = (Button) findViewById(R.id.btn_activity1);
        activity1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent("com.example.kazt.swicthactivity.Activity1");
                        startActivity(intent);
                    }
                }
        );
        Button activity2 = (Button) findViewById(R.id.btn_activity2);
        activity2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent("com.example.kazt.swicthactivity.Activity2");
                        startActivity(intent);
                    }
                }
        );
        Button activity3 = (Button) findViewById(R.id.btn_activity3);
        activity3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent("com.example.kazt.swicthactivity.Activity3");
                        startActivity(intent);
                    }
                }
        );
    }


}
