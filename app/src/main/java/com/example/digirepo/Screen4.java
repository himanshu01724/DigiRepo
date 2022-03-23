package com.example.digirepo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Screen4 extends AppCompatActivity {

    private Button button;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);

        button = (Button) findViewById(R.id.bun);
        btn = (Button) findViewById(R.id.again);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openScreen3();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {    //alert box code
            @Override
            public void onClick(View view) {
                CreateAlert();
            }
        });

    }
    public void openScreen3(){

        Intent intent = new Intent(this,otpverify.class);
        startActivity(intent);
    }
    public void yes(){
        Intent intent = new Intent(this,verifyNumber.class);   //If yes going back to page 2
        startActivity(intent);
    }
    public void CreateAlert(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Do you want to register using different mobile number ?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                        yes();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(Screen4.this, "Please Press next to continue", Toast.LENGTH_SHORT).show();
            }
        });
        builder.create();
        builder.show();
    }

}