package com.measure.interfacetest.myapplication.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.measure.interfacetest.myapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);


        //Any changes to the toolbar must be made before setting.
        myToolbar.setTitle(R.string.app_name);


        setSupportActionBar(myToolbar);
    }
}
