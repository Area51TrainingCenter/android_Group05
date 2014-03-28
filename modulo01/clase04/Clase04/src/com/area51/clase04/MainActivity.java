package com.area51.clase04;

import java.util.ArrayList;

import com.aea51.custom.NuevoGridView;
import com.area51.adapters.ImagenAdapter;
import com.area51.model.Imagen;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	ArrayList<Imagen>lista;
	ImagenAdapter adapter;
	NuevoGridView matriz;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		matriz = (NuevoGridView)findViewById(R.id.matriz);
		
		lista = new ArrayList<Imagen>();

		lista.add(new Imagen(0, "sample_0",R.drawable.sample_0));
		lista.add(new Imagen(1, "sample_1",R.drawable.sample_1));
		lista.add(new Imagen(2, "sample_2",R.drawable.sample_2));
		lista.add(new Imagen(3, "sample_3",R.drawable.sample_3));
		lista.add(new Imagen(4, "sample_4",R.drawable.sample_4));
		lista.add(new Imagen(5, "sample_5",R.drawable.sample_5));
		lista.add(new Imagen(6, "sample_6",R.drawable.sample_6));
		lista.add(new Imagen(7, "sample_7",R.drawable.sample_7));
		lista.add(new Imagen(8, "sample_8",R.drawable.sample_8));
		lista.add(new Imagen(9, "sample_9",R.drawable.sample_9));		
		
		adapter = new 
				ImagenAdapter(
						this, 
						R.layout.item_gridview  , 
						lista);
		
		matriz.setAdapter(adapter);
		


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}


}
