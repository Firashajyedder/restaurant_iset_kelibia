package com.firas.restaurantisetkelibia;

import androidx.appcompat.app.AppCompatActivity;
import api.UtilisateurHelper;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.Save).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText FName=findViewById(R.id.First_Name);
                String fname=FName.getText().toString();
                EditText LName=findViewById(R.id.Last_Name);
                String lname=LName.getText().toString();
                EditText Cin=findViewById(R.id.N_CIN);
                String cin=Cin.getText().toString();
                int ncin=Integer.parseInt(cin);
                EditText Password=findViewById(R.id.Password);
                String password=Password.getText().toString();
                EditText C_password=findViewById(R.id.confirm_your_password);
                String c_password=C_password.getText().toString();
                UtilisateurHelper uh= new UtilisateurHelper();
                uh.AddUtilisateur(fname,lname,ncin,password);
            }
        });
    }
}
