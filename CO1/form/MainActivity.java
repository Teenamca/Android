package com.example.sjcet.registration;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    Button bcancel,bproceed;
    EditText etFirstName, etLastName, etEmail, etPassword;

    boolean isAllFieldsChecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bproceed = findViewById(R.id.prbtn);
        bcancel = findViewById(R.id.cancelbtn);
        radioGroup = (RadioGroup)findViewById(R.id.groupradio);



        radioGroup.clearCheck();


        etFirstName = findViewById(R.id.e1);
        etLastName = findViewById(R.id.e2);
        etEmail = findViewById(R.id.e3);
        etPassword = findViewById(R.id.e4);

        bproceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                isAllFieldsChecked = CheckAllFields();


                if (isAllFieldsChecked) {
                    Intent i = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(i);
                }
            }
        });


        bcancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.finish();
                System.exit(0);
            }
        });
    }


    private boolean CheckAllFields() {
        if (etFirstName.length() == 0) {
            etFirstName.setError("This field is required");
            return false;
        }

        if (etLastName.length() == 0) {
            etLastName.setError("This field is required");
            return false;
        }


        if (etEmail.length() == 0) {
            etEmail.setError("Email is required");
            return false;
        }

        if (etPassword.length() == 0) {
            etPassword.setError("Password is required");
            return false;
        } else if (etPassword.length() < 8) {
            etPassword.setError("Password must be minimum 8 characters");
            return false;
        }


        return true;
    }
}
