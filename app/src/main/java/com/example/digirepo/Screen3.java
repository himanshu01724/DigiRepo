package com.example.digirepo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen3 extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

        button = (Button) findViewById(R.id.warningb);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openScreen4();

            }
        });
    }
    public void openScreen4(){
        Intent intent = new Intent(this,Screen4.class);
        startActivity(intent);
    }
}