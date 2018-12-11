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


public class PembeliConfirmFragment extends Fragment {

    public PembeliConfirmFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pembeli_confirm,container,false);

        return view;
    }
    private void changeFragment(Fragment fragment){
        FragmentManager manager = getFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();

        fragmentTransaction
                .replace(R.id.MainFrame, fragment)
                .commit();
    }

    public void onClickConfirmPembeli(View view){
        changeFragment(new PembeliFragment());
    }

}
