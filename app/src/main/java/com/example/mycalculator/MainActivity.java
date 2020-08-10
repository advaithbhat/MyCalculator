package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
private EditText e1;
float m1,m2;
boolean Addition,Subtraction,Multiplication,Division;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button8);
        b7=findViewById(R.id.button9);
        b8=findViewById(R.id.button11);
        b9=findViewById(R.id.button12);
        b10=findViewById(R.id.button13);
        b11=findViewById(R.id.button14);
        b12=findViewById(R.id.button15);
        b13=findViewById(R.id.button17);
        b14=findViewById(R.id.button18);
        b15=findViewById(R.id.button19);
        b16=findViewById(R.id.button20);

        e1=findViewById(R.id.editText);

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() +"1");
            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() +"2");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() +"3");
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() +"4");
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() +"5");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() +"6");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() +"7");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() +"8");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() +"9");
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText() +"0");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1==null){
                    e1.setText("");
                } else{
                    m1=Float.parseFloat(e1.getText() + "");
                    Addition=true;
                    e1.setText(null);
                }
            }
        });

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m1=Float.parseFloat(e1.getText() + "");
                Subtraction=true;
                e1.setText(null);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m1=Float.parseFloat(e1.getText() + "");
                Multiplication=true;
                e1.setText(null);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m1=Float.parseFloat(e1.getText() + "");
                Division=true;
                e1.setText(null);
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m2=Float.parseFloat(e1.getText() + "");

                if(Addition==true){
                    e1.setText(m1+m2 + "");
                    Addition=false;
                }

                if(Subtraction==true){
                    e1.setText(m1-m2 + "");
                    Subtraction=false;
                }

                if(Multiplication==true){
                    e1.setText(m1*m2 + "");
                    Multiplication=false;
                }

                if(Division==true){
                    e1.setText(m1/m2 + "");
                    Division=false;
                }
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("");
            }
        });
    }
}
