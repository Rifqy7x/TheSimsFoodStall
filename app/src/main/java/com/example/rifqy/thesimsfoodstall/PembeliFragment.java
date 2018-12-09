package com.example.rifqy.thesimsfoodstall;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;


public class PembeliFragment extends Fragment {

/*
    String[] Makanan ={"Nasi","sayur kangkung","tahu goreng","tempe goreng","ayam goreng","indomie goreng","indomeie rebus", "telor ceplok","es teh manis","teh manis hangat"};
*/

    Button confirm;
    public PembeliFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pembeli,container,false);

        confirm = (Button)view.findViewById(R.id.btnConfirm);
        confirm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                changeFragment(new PembeliConfirmFragment());
            }
        });
        return view;
    }

    private void changeFragment(Fragment fragment){
        FragmentManager manager = getFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();

        fragmentTransaction
                .replace(R.id.MainFrame, fragment)
                .commit();
    }


}
