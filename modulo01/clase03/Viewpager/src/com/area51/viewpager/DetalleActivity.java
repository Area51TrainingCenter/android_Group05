package com.area51.viewpager;

import com.area51.adapter.ImageFragmentPageAdapter;
import com.area51.utils.Constantes;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class DetalleActivity extends FragmentActivity{

	ViewPager viewpager;
	ImageFragmentPageAdapter adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detalle);

		
		viewpager = (ViewPager)findViewById(R.id.viewpager);

	}
	
	@Override
	protected void onResume() {

		super.onResume();
		
		adapter 
		= new ImageFragmentPageAdapter
			(getSupportFragmentManager());
	
		viewpager.setAdapter(adapter);
		
		Bundle parametro = getIntent().getExtras(); 
			
		
		viewpager.setCurrentItem( 
				parametro.getInt(Constantes.parametro)
				);
		
		
	}
	



}
