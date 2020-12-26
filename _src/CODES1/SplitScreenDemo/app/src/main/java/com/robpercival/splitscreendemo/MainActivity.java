package com.robpercival.splitscreendemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        super.onMultiWindowModeChanged(isInMultiWindowMode);

        // Multi-window mode has changed

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (isInMultiWindowMode()) {

            // We're in multi window mode!

        }

        if (isInPictureInPictureMode()) {

            // We're in picture in picture mode

        }

    }
}
