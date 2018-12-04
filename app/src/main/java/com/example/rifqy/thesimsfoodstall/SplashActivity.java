package com.example.rifqy.thesimsfoodstall;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    public static final int default_value = 0;
    Intent nextIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        int SPLASH_TIME = 4000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(getValue() == 0) {
                    nextIntent = new Intent(SplashActivity.this, DescriptionActivity.class);
                }
                else {
                    nextIntent = new Intent(SplashActivity.this, MainActivity.class);
                }
                startActivity(nextIntent);
                finish();
            }
        }, SPLASH_TIME);
    }

    private int getValue(){
        SharedPreferences sharedPreferences = getSharedPreferences("Value", MODE_PRIVATE);
        return sharedPreferences.getInt("value", default_value);
    }
}
