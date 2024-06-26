package com.curso.android.app.practica.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class SecondFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        // link the layout file with this class (FirstFragment.java)
        View view = inflater.inflate(R.layout.fragment_second,container, false);

        Button firstBtn = view.findViewById(R.id.btn_frag2);
        firstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Good bye from second Fragment!", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}