package com.example.ashish.movielisting.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.ashish.movielisting.R;
import com.example.ashish.movielisting.rest.response.Result;

public class CheckActivity extends AppCompatActivity {

    private static final String TAG =CheckActivity.class.getSimpleName() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        Intent intent =getIntent();
        Result movieDetail = (Result) intent.getExtras().get("MOVIES_DETAIL");

        Log.i(TAG,"onCreate :: "+ movieDetail.getOriginalTitle());
    }
}
