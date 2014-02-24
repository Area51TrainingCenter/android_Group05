package com.area51.clase01menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(final Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		
		for (int i = 0; i < 5; i++) {
			
			final int aux = i;
			
			menu.getItem(0)
			.getSubMenu()
			.add( i ,  i  , i, "Elemento " + ( i + 1 ) )
			.setIcon( R.drawable.vivoon )
			.setOnMenuItemClickListener( new OnMenuItemClickListener() {
				
				@Override
				public boolean onMenuItemClick(MenuItem item) {
					/*
					Toast.makeText( getApplicationContext() , 
					"" + menu.getItem(0).getSubMenu().getItem(aux).getTitle() , 
							Toast.LENGTH_SHORT).show();
					*/
					
					Toast.makeText( getApplicationContext() , 
					"" + item.getTitle() , 
							Toast.LENGTH_SHORT).show();
					
					return false;
				}
			} );
			
			
		}
		
		
		
		
		return true;
	}

}
