package model;

import java.util.ArrayList;
public class Cafeteria {
	private String nombre;
	private String direccion;
	private ArrayList<String> redesSociales;
	private ArrayList<Cafe> cafes;

	public Cafeteria(String nombre, String direccion, ArrayList<String> redesSociales) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.redesSociales = redesSociales;
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

	public ArrayList<String> getRedesSociales() {
		return this.redesSociales;
	}

	public void setRedesSociales(ArrayList<String> redesSociales) {
		this.redesSociales = redesSociales;
	}

	@Override
	public String toString() {
		return getNombre()+","+getDireccion()+","+getRedesSociales();
	}
}