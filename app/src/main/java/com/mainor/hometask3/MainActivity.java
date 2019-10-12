package com.mainor.hometask3;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText et;
    ToggleButton tb;
    Double a;
    TextView tv;
    final double Miles = 1.609344;


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et=(EditText) findViewById(R.id.editText);
        b1=(Button) findViewById(R.id.button);
        tb=(ToggleButton) findViewById(R.id.toggleButton);
        tv=(TextView) findViewById(R.id.textView);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(et.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please enter value", Toast.LENGTH_LONG);
                }

                else if(tb.isChecked())
                {
                    a=Double.parseDouble(String.valueOf(et.getText()));
                    Double b=a*Miles;
                    String r=String.valueOf(b);
                    tv.setText(r + " Kilometer");
                }

                else
                {
                    a=Double.parseDouble(String.valueOf(et.getText()));
                    Double b=a/Miles;
                    String r=String.valueOf(b);
                    tv.setText(r + " Miles");
                }
            }
        });
    }
}