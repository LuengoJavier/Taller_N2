package model;

public class Cafe {
	private String nombre;
	private int gramosCafe;
	private int mlAgua;
	private Tamaño tamaño;
	private String ingredientes;

	public Cafe(String nombre, int gramosCafe, int mlAgua, Tamaño tamaño, String ingredientes) {
		this.nombre = nombre;
		this.gramosCafe = gramosCafe;
		this.mlAgua = mlAgua;
		this.tamaño = tamaño;
		this.ingredientes = ingredientes;
	}
	public String getNombre() {
		return nombre;
	}
	public int getGramosCafe() {
		return this.gramosCafe;
	}

	public void setGramosCafe(int gramosCafe) {
		this.gramosCafe = gramosCafe;
	}

	public int getMlAgua() {
		return this.mlAgua;
	}

	public void setMlAgua(int mlAgua) {
		this.mlAgua = mlAgua;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public Tamaño getTamaño() {
		return tamaño;
	}

	@Override
	public String toString() {
		return getNombre()+","+getGramosCafe()+","+getMlAgua()+","+getIngredientes();
	}
}
