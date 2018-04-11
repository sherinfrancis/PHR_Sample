package com.tkm.phr_sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public abstract class
MainActivity extends AppCompatActivity implements View.OnClickListener,Car{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
Door door = new CarDoor();

door.open();
door.close();
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void gear() {


    }

    @Override
    public void gear(String s) {

    }


}
