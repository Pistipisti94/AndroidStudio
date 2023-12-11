package com.example.myapplicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText editText ;
Button btn ;
TextView szoveg ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        btn.setOnClickListener(new View.OnClickListener(){

            @Override public void onClick(View v) {
                String nev = editText.getText().toString();
                szoveg.setText("Szia " + nev + "!");
            };
        });
    };
    void init(){
         editText  = (EditText) findViewById(R.id.inputName);
         btn = (Button) findViewById(R.id.btnUdv);
         szoveg = (TextView) findViewById(R.id.txtUzenet);
    };
}