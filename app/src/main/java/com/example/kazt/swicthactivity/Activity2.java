package com.example.kazt.swicthactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        onClickSecondButtonListener();
    }

    public void onClickSecondButtonListener(){
        Button btnSecondmain = (Button) findViewById(R.id.btn_second_main);
        btnSecondmain.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(getApplicationContext(),MainActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
                    }
                }
        );
        Button btnSecond1 = (Button) findViewById(R.id.btn_second_1);
        btnSecond1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent("com.example.kazt.swicthactivity.Activity1");
                        startActivity(intent);
                    }
                }
        );
        Button btnSecond3 = (Button) findViewById(R.id.btn_second_3);
        btnSecond3.setOnClickListener(
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
