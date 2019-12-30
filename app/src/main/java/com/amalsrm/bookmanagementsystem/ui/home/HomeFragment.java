package com.amalsrm.bookmanagementsystem.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.amalsrm.bookmanagementsystem.R;

public class HomeFragment extends Fragment {
    EditText el1,el2,el3,el4,el5,el6,el7;
    Button blbtn;

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_home, container, false);
        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
               el1=(EditText)root.findViewById(R.id.adde1);
               el2=(EditText)root.findViewById(R.id.adde2);
               el3=(EditText)root.findViewById(R.id.adde3);
               el2=(EditText)root.findViewById(R.id.adde4);
               el2=(EditText)root.findViewById(R.id.adde5);
               el2=(EditText)root.findViewById(R.id.adde6);
               el2=(EditText)root.findViewById(R.id.adde7);
               blbtn=(Button)root.findViewById(R.id.addb);
               blbtn.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {

                   }
               });
            }
        });
        return root;
    }
}