package com.area51.clase01;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	String TAG = "clase01";
	
	EditText txtNombre;
	Button btnIngreso;
	TextView txtNuevo;
	
	static String texto;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Log.d(TAG, " onCreate ");

		txtNombre = (EditText)findViewById( R.id.txtNombre );
		btnIngreso = (Button)findViewById( R.id.btnIngreso );
		txtNuevo = (TextView)findViewById( R.id.txtNuevo );
		
		if( savedInstanceState != null ){
			txtNuevo.setText( texto );
		}
		
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		
		Log.d(TAG, " onStart ");
	}
	
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.d(TAG, " onResume ");
		
		btnIngreso.setOnClickListener( new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				if( !txtNombre.getText().toString().equals("")  ){
					
					texto = txtNuevo.getText().toString() + 
							txtNombre.getText().toString() + " \n";
					
					txtNuevo.setText( texto );
					txtNombre.setText("");
					
				}else{					
					Toast.makeText( getApplicationContext(), 
							R.string.MensajeError ,
							Toast.LENGTH_SHORT )
							.show();
					
				}				
				
			}
		} );
		
		
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.d(TAG, " onPause ");
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.d(TAG, " onStop ");
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.d(TAG, " onDestroy ");
	}
	
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
