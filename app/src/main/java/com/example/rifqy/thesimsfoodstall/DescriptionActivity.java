package com.example.rifqy.thesimsfoodstall;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
    }

    public void btnOkClick(View view){
        storeValue(1);
        Intent intent = new Intent(DescriptionActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void storeValue(int value){
        SharedPreferences mSharedPreferences = getSharedPreferences("Value", MODE_PRIVATE);
        SharedPreferences.Editor mEditor = mSharedPreferences.edit();
        mEditor.putInt("value", value);
        mEditor.apply();
    }

}
