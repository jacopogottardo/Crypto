package com.example.crypto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.security.SecureRandom;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
//import javax.xml.bind.DatatypeConverter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonA = (Button) findViewById(R.id.btnAccedi);
        buttonA.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switchActivitiesAccesso();
            }
        });

        Button buttonR = (Button) findViewById(R.id.btnRegistrati);
        buttonR.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switchActivitiesRegistrati();
            }
        });
    }

    private void switchActivitiesAccesso() {
        Intent switchActivityIntent = new Intent(this, accedi.class);
        startActivity(switchActivityIntent);
    }

    private void switchActivitiesRegistrati() {
        Intent switchActivityIntent = new Intent(this, registrati.class);
        startActivity(switchActivityIntent);
    }
}