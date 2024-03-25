package com.example.ft_hangouts;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.Gravity;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ft_hangouts.fragment.HeaderFragment;

public class ContactList extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_list);

        FrameLayout frameLayout = findViewById(R.id.fragment_header);
        HeaderFragment headerFragment = new HeaderFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(frameLayout.getId(), headerFragment);
        transaction.commit();
    }
}
