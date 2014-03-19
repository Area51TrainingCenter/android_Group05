package com.area51.modelo;

public class Imagen {

	protected int idImagen;
	protected String tituloImagen;
	protected String rutaImagen;
	
	
	
	
	public Imagen(int idImagen, String tituloImagen, String rutaImagen) {
		super();
		this.idImagen = idImagen;
		this.tituloImagen = tituloImagen;
		this.rutaImagen = rutaImagen;
	}
	
	public int getIdImagen() {
		return idImagen;
	}
	public void setIdImagen(int idImagen) {
		this.idImagen = idImagen;
	}
	public String getTituloImagen() {
		return tituloImagen;
	}
	public void setTituloImagen(String tituloImagen) {
		this.tituloImagen = tituloImagen;
	}
	public String getRutaImagen() {
		return rutaImagen;
	}
	public void setRutaImagen(String rutaImagen) {
		this.rutaImagen = rutaImagen;
	}
	
	
	
}
