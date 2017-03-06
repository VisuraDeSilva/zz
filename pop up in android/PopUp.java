package com.example.visura.cw1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Visura on 17/03/10.
 */

public class PopUp extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup);

        DisplayMetrics Metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(Metrics);

        int width = Metrics.widthPixels;
        int height = Metrics.heightPixels;

        getWindow().setLayout((int) (width*.8),(int) (height*.6));

        TextView lblAbout = (TextView) findViewById(R.id.lblAbout);
        lblAbout.setText("Game Info!!\nWhen you select a level novice will give you 2 digit arithmatic expression\nEasy will give you 3 digit arithmatic expression\nMedium will give you 4 digit arithmatic expression\nGuru will give you 6 digit arithmatic expression\nIf you hit HINT button then u get four chances to awnswer one question\nEnjoy!!!!");
    }
}
