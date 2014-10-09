package com.example.ejerciciosdos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Menu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		
	}
	
	public void IrEje1 (View mostrar){
		Intent ejer1 = new Intent(this, Ejer1.class);
		startActivity(ejer1);
	}
	
	public void IrEje2 (View mostrar){
		Intent ejer2 = new Intent(this, Ejer2.class);
		startActivity(ejer2);
	}
}
