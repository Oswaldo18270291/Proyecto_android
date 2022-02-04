package com.example.a291_e31_minicalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView mResultado;
    private EditText mValor1, mValor2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //se instacncias las vista
        mResultado= findViewById(R.id.resultado);
        mValor1= findViewById(R.id.valor1);
        mValor2= findViewById(R.id.valor2);
    }

    public void fnSuma(View view) {
        try{
            //se leen los valores
            String sValor1= mValor1.getText().toString();
            String sValor2= mValor2.getText().toString();
            //se convierte los valores a tipo DOUBLE
            double dValor1= Double.parseDouble(sValor1);
            double dValor2= Double.parseDouble(sValor2);

            mResultado.setText((dValor1+dValor2)+ "");
        }catch (NumberFormatException e){
            Toast.makeText(this, "Error falta algun valor", Toast.LENGTH_SHORT).show();
        }

    }

    public void fnResta(View view) {
        try{
        String sValor1= mValor1.getText().toString();
        String sValor2= mValor2.getText().toString();
        //se convierte los valores a tipo DOUBLE
        double dValor1= Double.parseDouble(sValor1);
        double dValor2= Double.parseDouble(sValor2);

        mResultado.setText((dValor1-dValor2)+"");
        }catch (NumberFormatException e){
            Toast.makeText(this, "Error falta algun valor", Toast.LENGTH_SHORT).show();
        }
    }

    public void fnMultiplicar(View view) {
        try{
        String sValor1= mValor1.getText().toString();
        String sValor2= mValor2.getText().toString();
        //se convierte los valores a tipo DOUBLE
        double dValor1= Double.parseDouble(sValor1);
        double dValor2= Double.parseDouble(sValor2);

        mResultado.setText((dValor1*dValor2)+"");
    }catch (NumberFormatException e){
        Toast.makeText(this, "Error falta algun valor", Toast.LENGTH_SHORT).show();
    }
    }

    public void fnDividir(View view) {
        try{
        String sValor1= mValor1.getText().toString();
        String sValor2= mValor2.getText().toString();
        //se convierte los valores a tipo DOUBLE
        double dValor1= Double.parseDouble(sValor1);
        double dValor2= Double.parseDouble(sValor2);

        mResultado.setText((dValor1/dValor2)+"");
        }catch (NumberFormatException e){
            Toast.makeText(this, "Falta algun valor", Toast.LENGTH_SHORT).show();
        }
    }

    public void fnClear(View view) {
        mValor1.setText("");
        mValor2.setText("");
        mResultado.setText("0");
    }
}