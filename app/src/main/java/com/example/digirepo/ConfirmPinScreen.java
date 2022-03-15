package com.example.digirepo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

public class ConfirmPinScreen extends AppCompatActivity {
    EditText editText;
    Button buttton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_pin_screen);
        editText = findViewById(R.id.inputcode4);
        buttton = findViewById(R.id.confirm);
        editText.addTextChangedListener(hide1);

    }
    private TextWatcher hide1 = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String text4 = editText.getText().toString().trim();
            buttton.setEnabled(!text4.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
}