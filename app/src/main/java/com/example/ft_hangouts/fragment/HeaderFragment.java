package com.example.ft_hangouts.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.ft_hangouts.ContactList;
import com.example.ft_hangouts.MainActivity;
import com.example.ft_hangouts.R;

public class HeaderFragment extends Fragment {
    private ImageView   logoImageView;
    private ImageView   colorMenu;
    public HeaderFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View    view = inflater.inflate(R.layout.fragment_header, container, false);
        // Init views
        logoImageView = view.findViewById(R.id.logo);
        colorMenu = view.findViewById(R.id.color_menu);
        // Add initial header content
        setLogoVisibility(true);
        setColorMenu(true);
        // Add onClickListener on logo
        logoImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });
        colorMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(getActivity(), ContactList.class);
                startActivity(intent);
            }
        });
        return view;
    }

    public void setLogoVisibility(boolean isVisible) {
        logoImageView.setVisibility(isVisible ? View.VISIBLE : View.GONE);
    }

    public void setColorMenu(boolean isVisible) {
        colorMenu.setVisibility(isVisible ? View.VISIBLE : View.GONE);
    }
}