package com.iesch.pmdm.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.iesch.pmdm.login.databinding.ActivityHomeBinding;
import com.iesch.pmdm.login.databinding.ActivityMainBinding;

public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        TextView mensajeHomeTV = binding.mensajeHomeTV;
        Bundle extras = getIntent().getExtras();

        mensajeHomeTV.setText("Bienvenido: " +  extras.getString("email"));
        setTitle(extras.getString("email"));
    }
}