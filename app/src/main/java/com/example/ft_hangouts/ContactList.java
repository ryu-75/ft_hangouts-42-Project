package com.example.ft_hangouts;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.ft_hangouts.fragment.HeaderFragment;

public class ContactList extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_list);

        // Récupérer une référence à votre LinearLayout racine

        FrameLayout frameLayout = findViewById(R.id.fragment_header);
        // Créer une instance de HeaderFragment
        HeaderFragment headerFragment = new HeaderFragment();

        // Ajouter le fragment au conteneur
        getSupportFragmentManager().beginTransaction()
                .add(frameLayout.getId(), headerFragment)
                .commit();
    }
}
