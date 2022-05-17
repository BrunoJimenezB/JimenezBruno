package com.example.jimenezbruno;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Instrumentation;
import android.content.Intent;
import android.nfc.tech.TagTechnology;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button botonSiguiente;
private Button botonMostrarResult;
private EditText textViewNombre;
private EditText textViewApellido;
private EditText textViewBASE;
private EditText textViewExponente;
private EditText textViewFactorial;
private EditText textViewPotencia;
    
ActivityResultLauncher<Intent> activityResult =registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
    @Override
    public void onActivityResult(ActivityResult result) {

    }
});


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewNombre= findViewById(R.id.textViewNombre);
        textViewApellido= findViewById(R.id.textViewApellido);
        textViewBASE= findViewById(R.id.textViewBase);
        textViewExponente= findViewById(R.id.textViewExponente);
        textViewFactorial= findViewById(R.id.textViewfact);
        textViewNombre.setFocusable(false);
        textViewApellido.setFocusable(false);
        textViewBASE.setFocusable(false);
        textViewExponente.setFocusable(false);
        textViewFactorial.setFocusable(false);

        botonSiguiente= findViewById(R.id.buttonSiguiente1);
        botonMostrarResult= findViewById(R.id.buttonMostrarResultado);

        botonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);
            }
        });
    }
    public int CalcularFactorial(int numero){
    for (int i=1; i<=numero; i++){
        numero= numero*i;
    }
return  numero;
    }

}