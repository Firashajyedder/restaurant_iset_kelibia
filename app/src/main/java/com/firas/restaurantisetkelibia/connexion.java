package com.firas.restaurantisetkelibia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class connexion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);
findViewById(R.id.inscription).setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v)
    {
          startActivity(new Intent(connexion.this,MainActivity.class));

    }
});
    }
}
