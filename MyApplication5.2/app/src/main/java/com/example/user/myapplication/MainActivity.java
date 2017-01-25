package com.example.user.myapplication;


import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        menu.add(1, 1, 0, "Computer");

        menu.add(1, 2, 1, "Gamepad");

        menu.add(1, 3, 2, "Camera");

        menu.add(1, 4, 3, "Video");

        menu.add(1, 5, 4, "Email");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case 1:
                Toast.makeText(this, "Clicked on Computer Option", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, "Clicked on Gamepad Option", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this, "Clicked on Camera Option", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(this, "Clicked on Video Option", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                Toast.makeText(this, "Clicked on Email Option", Toast.LENGTH_SHORT).show();
                break;



        }
        return true;
    }
}