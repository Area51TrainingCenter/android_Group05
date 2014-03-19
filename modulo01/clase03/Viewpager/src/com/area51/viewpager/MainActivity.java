package com.area51.viewpager;

import java.util.ArrayList;

import com.area51.adapter.ImagenAdapter;
import com.area51.modelo.Imagen;
import com.area51.utils.Constantes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class MainActivity extends Activity {

	GridView matriz;
	ImagenAdapter adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		matriz = (GridView)findViewById(R.id.matriz);
		
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
		
		//Instanciamos el arreglo y lo llenamos de información
		Constantes.Arreglo = new ArrayList<Imagen>();
		
		Constantes.Arreglo.add( 
				new Imagen(
						0, 
						"Dr Tv", 
						"http://segundoacosta.com/static/sample_0.jpg") 
				);

		Constantes.Arreglo.add( 
				new Imagen(
						1, 
						"Corazon indomable", 
						"http://segundoacosta.com/static/sample_1.jpg") 
				);

		Constantes.Arreglo.add( 
				new Imagen(
						2, 
						"sample_2", 
						"http://segundoacosta.com/static/sample_2.jpg") 
				);

		Constantes.Arreglo.add( 
				new Imagen(
						3, 
						"sample_3", 
						"http://segundoacosta.com/static/sample_3.jpg") 
				);

		Constantes.Arreglo.add( 
				new Imagen(
						4, 
						"sample_4", 
						"http://segundoacosta.com/static/sample_4.jpg") 
				);

		Constantes.Arreglo.add( 
				new Imagen(
						5, 
						"sample_5", 
						"http://segundoacosta.com/static/sample_5.jpg") 
				);

		Constantes.Arreglo.add( 
				new Imagen(
						6, 
						"sample_6", 
						"http://segundoacosta.com/static/sample_6.jpg") 
				);

		Constantes.Arreglo.add( 
				new Imagen(
						7, 
						"sample_7", 
						"http://segundoacosta.com/static/sample_7.jpg") 
				);

		Constantes.Arreglo.add( 
				new Imagen(
						8, 
						"sample_8", 
						"http://segundoacosta.com/static/sample_8.jpg") 
				);

		Constantes.Arreglo.add( 
				new Imagen(
						9, 
						"sample_9", 
						"http://segundoacosta.com/static/sample_9.jpg") 
				);

		Constantes.Arreglo.add( 
				new Imagen(
						10, 
						"sample_10", 
						"http://segundoacosta.com/static/sample_10.jpg") 
				);		
		
		//Inicializamos el adapter con sus parametros 
		//respectivos
		adapter = new ImagenAdapter(
				this, 
				R.layout.item_gridview, 
				Constantes.Arreglo, 
				this);
		
		//Pasamos el adapter con la información
		//Hacia el gridview
		matriz.setAdapter(adapter);
		
		matriz.setOnItemClickListener( 
				new OnItemClickListener() {

					@Override
					public void onItemClick(AdapterView<?> parent,
							View view,
							int position, long id) {
						
						Bundle bundle = new Bundle();
						bundle.putInt( Constantes.parametro , position);  
						
						Intent intent = new Intent();
						intent
						.setClass( 
								MainActivity.this , 
								DetalleActivity.class );  
						
						intent.putExtras(bundle);
						
						startActivity(intent);
						
						overridePendingTransition(
								R.anim.push_left_out, 
								R.anim.push_left_in
								);
						
						
						
					}
		});
		
		
		
	}



}
