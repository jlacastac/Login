package com.iesch.pmdm.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.iesch.pmdm.login.databinding.ActivityMainBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        EditText emailET = binding.emailET;
        EditText contraseñaET = binding.contrasenyaET;
        Button entrarBtn = binding.entrarBtn;

        entrarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email = emailET.getText().toString();
                String contraseña = contraseñaET.getText().toString();

                login(email, contraseña);
            }
        });
    }

    private void login(String email, String contraseña) {

        if(checkLogin(email, contraseña)) {
            Intent irAHome = new Intent(this, HomeActivity.class);

            irAHome.putExtra("email", email);
            startActivity(irAHome);
        }
    }

    private boolean checkLogin(String email, String contraseña) {
        return email != null && contraseña != null;
    }
}