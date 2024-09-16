package com.example.pechonjavtraining;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PokedexLogin extends AppCompatActivity {
    Button btnLogin;
    EditText uname, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pokemon_login);

        btnLogin = findViewById(R.id.btnLogin);
        uname = findViewById(R.id.utUname);
        password = findViewById(R.id.utPass);

        uname.setText("Nayeoniii");
        password.setText("123");

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve the values from EditText
                String username = uname.getText().toString();
                String userpass = password.getText().toString();

                // Check credentials
                if (username.equals("Nayeoniii") && userpass.equals("123")) {
                    Toast.makeText(PokedexLogin.this, "Welcome " + username, Toast.LENGTH_SHORT).show();
                    Intent rv = new Intent(getApplicationContext(), PokemonHomepage.class);
                    startActivity(rv);
                } else {
                    Toast.makeText(PokedexLogin.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
