package com.jacob.anim;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends FragmentActivity implements View.OnClickListener {

    private ImageView mImageViewLeft;
    private ImageView mImageViewRight;
    private Button mButtonShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageViewLeft = (ImageView) findViewById(R.id.button_show_left);
        mImageViewRight = (ImageView) findViewById(R.id.button_show_right);
        mButtonShow = (Button) findViewById(R.id.button_show_center);

        mImageViewLeft.setOnClickListener(this);
        mImageViewRight.setOnClickListener(this);
        mButtonShow.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_show_left:

                break;
            case R.id.button_show_right:

                break;
            case R.id.button_show_center:

                break;
        }
    }
}