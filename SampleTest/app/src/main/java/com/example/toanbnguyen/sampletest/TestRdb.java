package com.example.toanbnguyen.sampletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class TestRdb extends AppCompatActivity implements View.OnClickListener {

    Button btnChoose, btnBack;
    RadioButton rdb1, rdb2, rdb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_rdb);

        btnChoose = (Button) findViewById(R.id.btnChoose);
        btnBack = (Button) findViewById(R.id.btnBack);
        rdb1 = (RadioButton) findViewById(R.id.rdb1);
        rdb2 = (RadioButton) findViewById(R.id.rdb2);
        rdb3 = (RadioButton) findViewById(R.id.rdb3);

        btnChoose.setOnClickListener(this);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnChoose) {
            StringBuilder mes = new StringBuilder("Choose ");
            if (rdb1.isChecked())
                mes.append("option 1");
            else if (rdb2.isChecked())
                mes.append("option 2");
            else if (rdb3.isChecked())
                mes.append("option 3");
            Toast.makeText(TestRdb.this, mes, Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.btnBack) {
            finish();
        }
    }
}
