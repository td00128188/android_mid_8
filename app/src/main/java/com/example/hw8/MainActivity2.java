package com.example.hw8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        BMI TEST=(BMI) getApplicationContext();
        TextView tv=findViewById(R.id.textView);
        TextView tv2=findViewById(R.id.textView4);
        float bmi=Math.round(Float.parseFloat(TEST.getW())/Math.pow((Float.parseFloat(TEST.getH())/100),2)*100/100);
        tv.setText(""+bmi);
        if(bmi>=18.5 && bmi<24){
            tv2.setText("檢測結果為正常");
        }
        else {
            tv2.setText("檢測結果為異常");
        }
    }
    public void but2_click(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity2.this, MainActivity.class);
        startActivity(intent);
    }
}
