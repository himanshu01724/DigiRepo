package com.example.digirepo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Screen5 extends AppCompatActivity {

    EditText editText,editText2,editText3,editText4;
    Button button,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen5);
        editText = findViewById(R.id.inputcode1);
        editText2 = findViewById(R.id.inputcode2);
        editText3 = findViewById(R.id.inputcode3);
        editText4 = findViewById(R.id.inputcode4);
        button = findViewById(R.id.clear);
        button2 = findViewById(R.id.Next);    //activated once text is written //and changes to next screen

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.getText().clear();
                editText2.getText().clear();
                editText3.getText().clear();
                editText4.getText().clear();
                Toast.makeText(Screen5.this, "OTP send to **********", Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pinscreen();
            }
        });
        editText4.addTextChangedListener(appear);

    }
    public void pinscreen(){
        Intent intent = new Intent(this,setpinscreen.class);
        startActivity(intent);
    }
    private TextWatcher appear = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String text4 = editText4.getText().toString().trim();
            button2.setEnabled(!text4.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
}
//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 Token for android studio login to github
