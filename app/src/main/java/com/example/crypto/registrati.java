package com.example.crypto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registrati extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrati);

        Button buttonR2 = (Button) findViewById(R.id.btnRegistrati2);
        buttonR2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switchActivitiesCD();
            }
        });



    }
    private void switchActivitiesCD() {
        Intent switchActivityIntent = new Intent(this, cifradecifra.class);
        startActivity(switchActivityIntent);
    }
}