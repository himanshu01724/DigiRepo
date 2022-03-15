package com.example.digirepo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Screen2 extends AppCompatActivity {

    private Button next;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        next = (Button) findViewById(R.id.Next);
        editText = findViewById(R.id.editTextPhone);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openScreen3();

            }
        });
        editText.addTextChangedListener(come);
    }
    public void openScreen3(){
        Intent intent = new Intent(this,Screen5.class);
        startActivity(intent);
    }
    private TextWatcher come = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String text4 = editText.getText().toString().trim();
            next.setEnabled(!text4.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };

}