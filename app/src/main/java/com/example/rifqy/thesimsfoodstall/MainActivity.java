package com.example.rifqy.thesimsfoodstall;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeFragment(new PembeliFragment());
    }


    public void btnToCrypto(View view){
        Intent intent = new Intent(MainActivity.this, CryptoActivity.class);
        startActivity(intent);
        finish();
    }

    private void changeFragment(android.app.Fragment fragment){
        FragmentManager manager = getFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();

        fragmentTransaction
                .replace(R.id.MainFrame, fragment)
                .commit();
    }

    public void onClickPembeli(View view){
        changeFragment(new PembeliFragment());
    }

    public void onClickPembeliConfirm(View view){
        changeFragment(new PembeliConfirmFragment());
    }

    public void onClickPenjual(View view){
        changeFragment(new PenjualFragment());
    }

    public void onClickConfirmPembeli(View view){
        changeFragment(new PembeliFragment());
    }

    public void onConfirmPenjual(View view){
        changeFragment(new PenjualFragment());
    }
}
