package com.example.digirepo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeUser extends AppCompatActivity {

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_user);

        button = findViewById(R.id.Next);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opendashboard();
            }
        });
    }
    public void opendashboard(){
        Intent intent = new Intent(this,dashboard.class);
        startActivity(intent);
    }
}