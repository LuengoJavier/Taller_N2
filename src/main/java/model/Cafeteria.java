package model;

import java.util.ArrayList;
public class Cafeteria {
	private String nombre;
	private String direccion;
	private String facebook;
	private String instagram;
	private ArrayList<Cafe> cafes;

	public Cafeteria(String nombre, String direccion, String facebook, String instagram) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.facebook = facebook;
		this.instagram = instagram;
		this.cafes = new ArrayList<>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public String getFacebook() {
		return facebook;
	}

	public String getInstagram() {
		return instagram;
	}

	public ArrayList<Cafe> getCafes() {
		return cafes;
	}

	@Override
	public String toString() {
		return getNombre()+","+getDireccion()+","+getFacebook()+","+getInstagram();
	}
}