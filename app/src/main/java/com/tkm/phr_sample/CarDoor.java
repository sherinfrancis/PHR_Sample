package com.tkm.phr_sample;

import android.util.Log;

/**
 * Created by SD1080615 on 4/4/2018.
 */

public class CarDoor extends Door {

    @Override
    public void open() {

        Log.i("CarrrrrrDoorrrrrrr","Car*****************************subclass");

    }

    @Override
    void close() {
        Log.i("CarrrrrrDoorrrrrrr","*****************************close");
    }
}
