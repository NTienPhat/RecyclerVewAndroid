package com.example.recycler;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {
    private EditText txtUsername;
    private EditText txtPassword;
    private Button btnLogin;
    private TextView txtChange;
    private TextView txtTilteFooter;
    private TextView txtForgotPassword;
    private ImageView imgQuestion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Window window = MainActivity.this.getWindow();

        window.setStatusBarColor(ContextCompat.getColor(MainActivity.this, R.color.facebookColor));

        setContentView(R.layout.activity_main);

        txtUsername = findViewById(R.id.edTxtUername);
        txtPassword = findViewById(R.id.edTxtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        txtChange = findViewById(R.id.txtChange);
        txtTilteFooter = findViewById(R.id.txtTilteFooter);
        txtForgotPassword = findViewById(R.id.txtForgotPassword);
        txtTilteFooter = findViewById(R.id.txtTilteFooter);
        txtForgotPassword = findViewById(R.id.txtForgotPassword);
        imgQuestion = findViewById(R.id.imgQuestion);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtUsername.getText().toString().trim().isEmpty()){
                    txtUsername.setError("Username is not blank!");
                }
                if(txtPassword.getText().toString().trim().isEmpty()){
                    txtPassword.setError("Password is not blank!");
                }
                if (txtUsername.getText().toString().equals("admin") && txtPassword.getText().toString().equals("123456")) {
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    intent.putExtra("username", txtUsername.getText().toString());
                    intent.putExtra("password", txtPassword.getText().toString());
                    startActivity(intent);
                }
            }
        });

        txtChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This feature does not support now", Toast.LENGTH_LONG).show();
            }
        });

        txtTilteFooter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This feature does not support now", Toast.LENGTH_LONG).show();
            }
        });

        txtForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This feature does not support now", Toast.LENGTH_LONG).show();
            }
        });

        imgQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This feature does not support now", Toast.LENGTH_LONG).show();
            }
        });
    }
}