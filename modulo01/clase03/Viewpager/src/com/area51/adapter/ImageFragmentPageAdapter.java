package com.area51.adapter;

import com.area51.fragment.ImageFragment;
import com.area51.utils.Constantes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;




public class ImageFragmentPageAdapter 
extends FragmentPagerAdapter {

	public ImageFragmentPageAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int position) {
		
		//Llamamos al fragmento a mostrar 
		ImageFragment fragment = new ImageFragment();
		
		Bundle parametro = new Bundle();
		parametro.putInt(  fragment.FRAGMENT_POSITION , position );
		
		fragment.setArguments( parametro );	
		
		return fragment;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return Constantes.Arreglo.size();
	}

}
