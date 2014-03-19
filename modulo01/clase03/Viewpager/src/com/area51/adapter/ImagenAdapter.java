package com.area51.adapter;

import java.util.ArrayList;

import com.area51.modelo.Imagen;
import com.area51.utils.BitmapManager;
import com.area51.utils.ImageLoader;
import com.area51.viewpager.R;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

public class ImagenAdapter extends ArrayAdapter<Imagen> {

	Activity actividad;
	ArrayList<Imagen>ArrayImagen;
	Context context;
	
	public ImagenAdapter(Context context, 
			int resource, 
			ArrayList<Imagen> ArrayImagen,
			Activity actividad
			) {
		super(context, resource, ArrayImagen);

		this.actividad = actividad;
		this.context = context;
		this.ArrayImagen = ArrayImagen;
		
	}

	static class ViewHolder{		
		public ImageView imagenItem;		
	}
		
	@Override
	public View getView(int position, View vistaItem, 
			ViewGroup parent) {
		
		if( vistaItem == null ){
			
			vistaItem = LayoutInflater
					.from( context )
					.inflate( R.layout.item_gridview 
							, parent, false  );
			
			ViewHolder viewHolder = new ViewHolder();
			viewHolder.imagenItem = 
					(ImageView)vistaItem
					.findViewById(R.id.imagenItem);
		
			vistaItem.setTag( viewHolder );
		
		}
		
		ViewHolder holder = (ViewHolder)vistaItem.getTag();
		
		String url = ArrayImagen.get(position).getRutaImagen() ;
		
		
		ImageLoader imgloader = new ImageLoader( context );
		
		imgloader.DisplayImage(url,  holder.imagenItem );
		
		/*
		BitmapManager
			.getInstance()
			.loadBitmap(url, holder.imagenItem );		
		
		/*
		int imagenTemporal = actividad
				.getResources()
				.getIdentifier(
						ArrayImagen.get(position).getRutaImagen(), 
						null, 
						actividad.getPackageName()  );
		
		holder.imagenItem.setImageDrawable(				
				actividad.getResources()
				.getDrawable(imagenTemporal)
				);
		 */
		//holder.imagenItem.setContentDescription("ContentDescription :D");
		
		return vistaItem;
	}
	
	
}
