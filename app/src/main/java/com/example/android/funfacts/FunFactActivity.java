package com.example.android.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class FunFactActivity extends AppCompatActivity {
    private FunBook mFunBook = new FunBook();
    private ColorWheel mColorWheel = new ColorWheel();
    private TextView mFactTextView;
    private Button mButton1;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_fact);
        mFactTextView =  (TextView) findViewById(R.id.factTextView);
        mButton1 = (Button) findViewById(R.id.button1);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                mFactTextView.setText(mFunBook.getFact());
                int color = mColorWheel.getColor();
                mRelativeLayout.setBackgroundColor(color);
                mButton1.setTextColor(color);
            }
        };
        mButton1.setOnClickListener(listener);
    }

}
