package com.example.sjcet.cycle2_1;


import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
    }
    protected void onStop() {
        super.onStop();

        SharedPreferences mypref=getSharedPreferences("myprefsfile",0);
        SharedPreferences.Editor editor=mypref.edit();
        editor.putString("user",et1.getText().toString());
        editor.putString("pass",et2.getText().toString());
        editor.commit();

    }

    protected void onResume() {
        super.onResume();

        SharedPreferences mypref=getSharedPreferences("myprefsfile",0);

        String username=mypref.getString("user",null);
        String password=mypref.getString("pass",null);
        et1.setText(username);
        et2.setText(password);
    }
}
