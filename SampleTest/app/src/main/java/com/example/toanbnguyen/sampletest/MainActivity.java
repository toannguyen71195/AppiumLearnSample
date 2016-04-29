package com.example.toanbnguyen.sampletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnEdt, btnBtn, btnRdb, btnChb, btnSpn, btnCmr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEdt = (Button) findViewById(R.id.btnTestEdt);
        btnBtn = (Button) findViewById(R.id.btnTestBtn);
        btnRdb = (Button) findViewById(R.id.btnTestRdb);
        btnChb = (Button) findViewById(R.id.btnTestChb);
        btnSpn = (Button) findViewById(R.id.btnTestSpn);
        btnCmr = (Button) findViewById(R.id.btnTestCmr);
        btnEdt.setOnClickListener(this);
        btnBtn.setOnClickListener(this);
        btnRdb.setOnClickListener(this);
        btnChb.setOnClickListener(this);
        btnSpn.setOnClickListener(this);
        btnCmr.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnTestEdt)
        {
            Intent intent = new Intent(MainActivity.this, TestEdt.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btnTestBtn) {
            Intent intent = new Intent(MainActivity.this, TestBtn.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btnTestRdb) {
            Intent intent = new Intent(MainActivity.this, TestRdb.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btnTestChb) {
            Intent intent = new Intent(MainActivity.this, TestChb.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btnTestSpn) {
            Intent intent = new Intent(MainActivity.this, TestSpn.class);
            startActivity(intent);
        }
    }
}
