package com.example.circularprogressview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CircularProgressView circularProgressView;
    private TextView recommendRateCircle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circularProgressView = findViewById(R.id.progress_view_circular);
        circularProgressView.setTargetPercent(68);
    }
}
