package com.example.jimenezbruno;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
private EditText EdittexNombre;
private EditText EditBase;
private Button BotonSiguiente2;
    private Button BotonCerrar;
    ActivityResultLauncher<Intent> ActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<androidx.activity.result.ActivityResult>() {
        @Override
        public void onActivityResult(androidx.activity.result.ActivityResult result) {

        }
    });
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        EdittexNombre=findViewById(R.id.textViewNombre2);
        EditBase= findViewById(R.id.textViewBase2);
        BotonSiguiente2= findViewById(R.id.buttonSiguiente2);
        BotonCerrar= findViewById(R.id.buttonCerrar2);
        EdittexNombre.setFocusable(false);
        EditBase.setFocusable(false);
        BotonCerrar.setFocusable(false);

        BotonSiguiente2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity2.this, Activity3.class);
                ActivityResult.launch(intent);
            }
        });
    }
}