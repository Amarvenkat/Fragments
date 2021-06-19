package com.example.fragments;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LeftFragment extends Fragment implements View.OnClickListener {


    // 1.0 Create an interface and declare a method
    // 1.1 extend Fragment
    Oncolourinterface oncolour;

    public static LeftFragment newInstance() {

        // 3.0 the Static method has been created newInstance();
        // 3.1 then instantiate the left Fragment and return;

        LeftFragment leftFragment = new LeftFragment();
        return  leftFragment;
    }


    //Context context;

    // 4 Get the following  methods

    // onAttach ( get handle to main activity through oncolour line no 42 ) ,
    // onCreateView (Inflate leftFragment.xml ),
    // onViewCreated ( Get the handle for objects in leftFragment.xml)



    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        oncolour = (Oncolourinterface) context;

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        return  inflater.inflate(R.layout.leftfragment,container,false);
  //      return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button green = (Button) view.findViewById(R.id.green);
        Button red   = (Button) view.findViewById(R.id.red);
        Button blue  = (Button) view.findViewById(R.id.blue);

        green.setOnClickListener(this);
        red.setOnClickListener(this);
        blue.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.green:
                oncolour.oncolourmethod(Color.GREEN);
                break;

            case R.id.red:
                oncolour.oncolourmethod(Color.RED);
                break;
            case R.id.blue:
                oncolour.oncolourmethod(Color.BLUE);


        }

    }

    public interface Oncolourinterface{

        void oncolourmethod(int color);
    }
}









