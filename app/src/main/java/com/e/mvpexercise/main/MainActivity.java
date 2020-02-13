package com.e.mvpexercise.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.e.mvpexercise.R;

public class MainActivity extends AppCompatActivity implements Contract.MvpView {

    private MainPresenter mpresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mpresenter= new MainPresenter(this);
    }
}
