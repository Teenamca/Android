package com.example.sjcet.exam2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Name,Surname,Mark;
    TextView DataV;
    MyDatabase database=new MyDatabase(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name=(EditText)findViewById(R.id.editText1);
        Surname=(EditText)findViewById(R.id.editText2);
        Mark=(EditText)findViewById(R.id.editText3);
        DataV=(TextView)findViewById(R.id.textView);
    }

    public void insert(View view) {
        String userval=Name.getText().toString();
        String surval=Surname.getText().toString();
        Integer passval=Integer.parseInt(Mark.getText().toString());
        boolean result=database.insert(userval,surval,passval);
        if(result==true){
            Toast.makeText(this, "Data inserted successfully", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Data inserted failure ", Toast.LENGTH_SHORT).show();
        }
    }

    public void delete(View view) {
        String userval=Name.getText().toString();
        //int delete=database.delete(userval);
        Toast.makeText(this, "Data deleted successfully", Toast.LENGTH_SHORT).show();
    }
}
