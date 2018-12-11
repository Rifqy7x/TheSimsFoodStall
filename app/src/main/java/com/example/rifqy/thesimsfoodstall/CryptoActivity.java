package com.example.rifqy.thesimsfoodstall;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CryptoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crypto);
        changeFragmentCrypto(new InboxCryptoFragment());
    }

    public void btnToMain(View view){
        Intent intent = new Intent(CryptoActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void changeFragmentCrypto(Fragment fragment){
        FragmentManager manager = getFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();

        fragmentTransaction
                .replace(R.id.CryptoFrame, fragment)
                .commit();
    }

    public void onBackCrypto(View view){
        changeFragmentCrypto(new InboxCryptoFragment());
    }
}
