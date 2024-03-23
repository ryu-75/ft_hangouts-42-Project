package com.example.ft_hangouts.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ft_hangouts.R;

public class ContactFragment extends Fragment {
    private ImageView   avatar;
    private TextView    userName;
    private ImageView   callBtn;
    private ImageView   messageBtn;
    private MenuItem    addContactBtn;
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View    view = inflater.inflate(R.layout.fragment_contact, container, false);

        avatar = view.findViewById(R.id.avatar);
        userName = view.findViewById(R.id.username);
        callBtn = view.findViewById(R.id.call);
        messageBtn = view.findViewById(R.id.message);
        return view;
    };
}