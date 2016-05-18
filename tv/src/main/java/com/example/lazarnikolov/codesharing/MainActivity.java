package com.example.lazarnikolov.codesharing;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

import com.example.lazarnikolov.common.Constants;

public class MainActivity extends Activity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        textView.setText(Constants.sharedText);
    }

}
