package com.example.ejerciciosuno;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Eleccion extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_eleccion);
	}
	
	public void IrEjercicioUno(View v){
		Intent ejercicio1= new Intent(this, Ejer1.class);
		startActivity(ejercicio1);
	}
	
	public void IrEjercicioDos(View v){
		Intent ejercicio2= new Intent(this, Ejer2.class);
		startActivity(ejercicio2);
	}
	
	public void IrEjercicioTres(View v){
		Intent ejercicio3= new Intent(this, Ejer3.class);
		startActivity(ejercicio3);
	}
}
