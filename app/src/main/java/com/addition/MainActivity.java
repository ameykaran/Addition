package com.addition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public EditText value1;
    public TextView result;
    public EditText value2;
    public EditText value3;
    public EditText value4;
    public EditText value5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        value1 =  findViewById(R.id.editText1);
        value2 =  findViewById(R.id.editText2);
        value3 =  findViewById(R.id.editText3);
        value4 =  findViewById(R.id.editText4);
        value5 =  findViewById(R.id.editText5);
        result =  findViewById(R.id.textViewresult);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:



                float inputValue1 = Float.parseFloat(value1.getText().toString());
                float inputValue2 = Float.parseFloat(value1.getText().toString());
                float inputValue3 = Float.parseFloat(value1.getText().toString());
                float inputValue4 = Float.parseFloat(value1.getText().toString());
                float inputValue5 = Float.parseFloat(value1.getText().toString());

                result.setText( String.valueOf(Addition.addx(inputValue1,inputValue2,inputValue3,inputValue4,inputValue5)));

        }

    }


}