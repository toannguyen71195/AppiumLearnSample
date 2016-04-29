package com.example.toanbnguyen.sampletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class TestChb extends AppCompatActivity implements View.OnClickListener{

    CheckBox chb1, chb2, chb3, chb4;
    Button btnChoose, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_chb);

        btnChoose = (Button) findViewById(R.id.btnChoose);
        btnBack = (Button) findViewById(R.id.btnBack);
        chb1 = (CheckBox) findViewById(R.id.chb1);
        chb2 = (CheckBox) findViewById(R.id.chb2);
        chb3 = (CheckBox) findViewById(R.id.chb3);
        chb4 = (CheckBox) findViewById(R.id.chb4);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnChoose) {
            StringBuilder mes = new StringBuilder("Choose");
            if (chb1.isChecked())
                mes.append(" option 1");
            else if (chb2.isChecked())
                mes.append(" option 2");
            else if (chb3.isChecked())
                mes.append(" option 3");
            else if (chb4.isChecked())
                mes.append(" option 4");
            Toast.makeText(TestChb.this, mes, Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.btnBack) {
            finish();
        }
    }
}
