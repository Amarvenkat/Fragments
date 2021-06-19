package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements LeftFragment.Oncolourinterface {

    LeftFragment leftFragment;
    RightFragment rightFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2 Implement the interface in the main activitynjm

        // 3 Create a handle to the left fragment and call newInstance() where you create an object to Left Fragment

        leftFragment =  LeftFragment.newInstance();

        getSupportFragmentManager().beginTransaction().replace(R.id.leftfragment,leftFragment).commit();


    }

    @Override
    public void oncolourmethod(int color) {

        rightFragment = RightFragment.newInstance(color);


        switch (color){

            case Color.RED:

                getSupportFragmentManager().beginTransaction().replace(R.id.rightfragment,rightFragment).commit();
                break;

            case  Color.GREEN:

                getSupportFragmentManager().beginTransaction().replace(R.id.rightfragment,rightFragment).commit();
                break;
            case Color.BLUE:

                getSupportFragmentManager().beginTransaction().replace(R.id.rightfragment,rightFragment).commit();
                break;



        }


    }
}










