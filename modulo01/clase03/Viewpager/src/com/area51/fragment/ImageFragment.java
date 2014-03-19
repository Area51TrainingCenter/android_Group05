package com.area51.fragment;

import com.area51.utils.BitmapManager;
import com.area51.utils.Constantes;
import com.area51.utils.ImageLoader;
import com.area51.viewpager.R;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageFragment extends Fragment {

	public String FRAGMENT_POSITION = "FRAGMENT_POSITION";
	
	

	@Override
	public View onCreateView(LayoutInflater inflater, 
			ViewGroup container,
			Bundle savedInstanceState) {
		
		View vistaFragment = inflater
				.inflate( R.layout.fragment_detalle ,
						null );
		
		
		ImageView imagenFragment = (ImageView)
				vistaFragment.findViewById(R.id.imagenFragment);
		
		TextView nombreFragment = (TextView)
				vistaFragment.findViewById(R.id.nombreFragment);
		
		
		nombreFragment.setText(
				Constantes.Arreglo
				.get( getArguments()
						.getInt(FRAGMENT_POSITION) )
				.getTituloImagen());
		
		String url = Constantes.Arreglo
				.get( getArguments()
						.getInt(FRAGMENT_POSITION) )
						.getRutaImagen();
		
		ImageLoader imgloader = new 
				ImageLoader( getActivity().getApplicationContext() );
		imgloader.DisplayImage(url, imagenFragment);
		
		//imgloader.clearCache();
		
		/*
		BitmapManager
		.getInstance()
		.loadBitmap(url, imagenFragment);
		*/
		
		
		return vistaFragment;
	}
	
	
	
}
