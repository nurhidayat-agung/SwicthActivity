package com.example.kazt.swicthactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        onClickFirstButtonListener();
    }

    public void onClickFirstButtonListener(){
        Button btnFirstmain = (Button) findViewById(R.id.btn_first_main);
        btnFirstmain.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(getApplicationContext(),MainActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));

                    }
                }
        );
        Button btnFirst2 = (Button) findViewById(R.id.btn_first_2);
        btnFirst2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent("com.example.kazt.swicthactivity.Activity2");
                        startActivity(intent);
                    }
                }
        );
        Button btnFirst3 = (Button) findViewById(R.id.btn_first_3);
        btnFirst3.setOnClickListener(
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
