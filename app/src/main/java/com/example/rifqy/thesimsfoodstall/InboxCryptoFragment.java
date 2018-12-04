package com.example.rifqy.thesimsfoodstall;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class InboxCryptoFragment extends Fragment {

    public InboxCryptoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_inbox_crypto,container,false);

        return view;
    }

    private void changeFragmentCrypto(Fragment fragment){
        FragmentManager manager = getFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();

        fragmentTransaction
                .replace(R.id.CryptoFrame, fragment)
                .commit();
    }

    public void onNextCrypto(View view){
        changeFragmentCrypto(new MessageCryptoFragment());
    }

}
