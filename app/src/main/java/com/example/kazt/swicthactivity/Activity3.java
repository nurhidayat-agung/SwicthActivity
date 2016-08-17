package com.example.kazt.swicthactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        onClickFirstButtonListener();
    }

    public void onClickFirstButtonListener(){
        Button btnThirdMain = (Button) findViewById(R.id.btn_third_main);
        btnThirdMain.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(getApplicationContext(),MainActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
                    }
                }
        );
        Button btnThird1 = (Button) findViewById(R.id.btn_third_1);
        btnThird1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent("com.example.kazt.swicthactivity.Activity1");
                        startActivity(intent);
                    }
                }
        );
        Button btnThird2 = (Button) findViewById(R.id.btn_third_2);
        btnThird2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent("com.example.kazt.swicthactivity.Activity2");
                        startActivity(intent);
                    }
                }
        );
    }

}
