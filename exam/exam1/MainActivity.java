package com.example.sjcet.exam1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.Open:
                Toast.makeText(this, "Open clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Share:
                Toast.makeText(this, "Share clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Delete:
                Toast.makeText(this, "Delete clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Search:
                Toast.makeText(this, "Search clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Settings:
                Toast.makeText(this, "Settings Clicked", Toast.LENGTH_SHORT).show();
                break;


        }
        return true;
    }
}
