package com.example.ft_hangouts.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;

import com.example.ft_hangouts.MainActivity;
import com.example.ft_hangouts.R;
import com.example.ft_hangouts.interfaces.OnAddContactClickListener;

public class HeaderFragment extends Fragment implements OnAddContactClickListener {
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
                showPopupMenu(v);
            }
        });
        return view;
    }

    public void showPopupMenu(View v) {
        PopupMenu   popupMenu = new PopupMenu(getActivity(), colorMenu);
        popupMenu.getMenuInflater().inflate(R.menu.menu_dropdown, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.add_contact) {
                    onAddContactClicked();
                    return true;
                } else return item.getItemId() == R.id.change_color;
            }
        });
        popupMenu.show();
    }

    @Override
    public void onAddContactClicked() {
        ContactFragment contactFragment = new ContactFragment();
        FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_header, contactFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}