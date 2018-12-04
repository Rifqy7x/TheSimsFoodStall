package com.example.rifqy.thesimsfoodstall;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
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

    private void changeFragment(Fragment fragment){
        FragmentManager manager = getFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();

        fragmentTransaction
                .replace(R.id.MainFrame, fragment)
                .commit();
    }

    public void onClickPembeli(View view){
        changeFragment(new PembeliFragment());
    }

    public void onClickPenjual(View view){
        changeFragment(new PenjualFragment());
    }


}
