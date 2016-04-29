package com.example.toanbnguyen.sampletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TestEdt extends AppCompatActivity implements View.OnClickListener {

    EditText edtUser, edtPass;
    Button btnLogIn, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_edt);

        edtUser = (EditText) findViewById(R.id.edtUsername);
        edtPass = (EditText) findViewById(R.id.edtPassword);

        btnLogIn = (Button) findViewById(R.id.btnLogIn);
        btnBack = (Button) findViewById(R.id.btnBack);

        btnLogIn.setOnClickListener(this);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnLogIn) {
            Toast.makeText(TestEdt.this, "Log in with username : " + edtUser.getText().toString(),Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.btnBack) {
            finish();
        }
    }
}
