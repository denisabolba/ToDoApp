package com.example.todoapp.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.todoapp.R;
import com.example.todoapp.databinding.FragmentProfileBinding;


public class ProfileFragment extends Fragment {


    FragmentProfileBinding binding;
    public ProfileFragment() {

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentProfileBinding.inflate(inflater, container, false);


        binding.uploadYourGrage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new MapsFragment();
                FragmentTransaction fragmentTransaction = getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction();
                fragmentTransaction.replace(R.id.container,fragment)
                        .addToBackStack("name")
                        .setReorderingAllowed(true)
                        .commit();
            }
        });

        return binding.getRoot();

    }
}