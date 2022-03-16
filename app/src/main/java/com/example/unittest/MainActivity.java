package com.example.unittest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText edtLog;
    EditText edtPass;
    EditText edtRepeatPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btnReg);
        edtLog = findViewById(R.id.login);
        edtPass = findViewById(R.id.password);
        edtRepeatPass = findViewById(R.id.repeatPassword);
        btn.setOnClickListener(view -> {

            if (edtLog.getText().toString().trim().isEmpty())
                edtLog.setError("Введите email");
            else if (edtPass.getText().toString().trim().isEmpty())
                edtPass.setError("Введите пароль");
            else if (!edtPass.getText().toString().equals(edtRepeatPass.getText().toString()))
            {
                edtPass.setError("Пароли не совпадают");
                edtRepeatPass.setError("Пароли не совпадают");
            }
            else {
                edtLog.setText("ГОТОВО!");
                edtPass.setText("ГОТОВО!");
                edtRepeatPass.setText("ГОТОВО!");
            }
        });
    }

}