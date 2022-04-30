package com.fizzanasir.login_page;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{
 TextView title;
 View app;
 EditText Uname, Upass;
 String un, pass;
 Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title=findViewById(R.id.main_title);
        app=findViewById(R.id.app_base);
        login=findViewById(R.id.login_btn);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
//        Uname=(EditText) findViewById(R.id.user_input);
//        un=Uname.getText().toString();
//        Upass=(EditText) findViewById(R.id.user_password);
//        pass=Upass.getText().toString();
        title.setText("Welcome User");
        title.setBackgroundColor(Color.rgb(255, 204, 213));
        app.setBackgroundColor(Color.rgb(255, 179, 193));
    }
}