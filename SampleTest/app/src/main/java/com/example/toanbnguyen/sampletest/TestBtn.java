package com.example.toanbnguyen.sampletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TestBtn extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btnBack;
    TextView tvNum;
    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_btn);

        btn1 = (Button) findViewById(R.id.btnNum1);
        btn2 = (Button) findViewById(R.id.btnNum2);
        btn3 = (Button) findViewById(R.id.btnNum3);
        btnBack = (Button) findViewById(R.id.btnBack);
        tvNum = (TextView) findViewById(R.id.tvNum);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnNum1) {
            num += 1;
            tvNum.setText("" + num);
            Toast.makeText(this, "+1", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.btnNum2) {
            num += 2;
            tvNum.setText("" + num);
            Toast.makeText(this, "+2", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.btnNum3) {
            num += 3;
            tvNum.setText("" + num);
            Toast.makeText(this, "+3", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.btnBack) {
            finish();
        }
    }
}
