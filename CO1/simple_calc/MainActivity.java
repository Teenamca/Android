package com.example.sjcet.simple_calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText t1;
    EditText t2;
    TextView t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1= (EditText) findViewById(R.id.n1);
        t2=(EditText) findViewById(R.id.num2);
        t3=(TextView) findViewById(R.id.t1);

    }

    public void sum(View view) {
        int x=Integer.parseInt(t1.getText().toString());
        int y=Integer.parseInt(t2.getText().toString());
        int s=x+y;
        t3.setText(Integer.toString(s));

    }

    public void diff(View view) {
        int x=Integer.parseInt(t1.getText().toString());
        int y=Integer.parseInt(t2.getText().toString());
        int s=x-y;
        t3.setText(Integer.toString(s));

    }
    public void mul(View view) {
        int x=Integer.parseInt(t1.getText().toString());
        int y=Integer.parseInt(t2.getText().toString());
        int s=x*y;
        t3.setText(Integer.toString(s));

    }
    public void div(View view) {
        int x=Integer.parseInt(t1.getText().toString());
        int y=Integer.parseInt(t2.getText().toString());
        int s=x/y;
        t3.setText(Integer.toString(s));

    }
}

