package controller;

import model.Cafe;
import model.Cafeteria;
import model.Tamaño;

import java.util.ArrayList;
import java.util.List;

public class CafeteriaController {
	private String nombre;
	private String dirección;
	private List<Cafe> cafes;

	public CafeteriaController(String nombre, String dirección) {
		this.nombre = nombre;
		this.dirección = dirección;
	}

	public void aÑadirCafe(int gramosCafe, int mlAgua, Tamaño tamaño, String ingredientes) {
		Cafe  cafe = new Cafe(nombre,gramosCafe,mlAgua,tamaño,ingredientes);
		if(buscarCafe(cafe) == null){
			cafes.add(cafe);
		}

	}

	public List<Cafe> obtenerListaCafeTamaÑo(Tamaño tamaño) {
		List<Cafe> cafes = new ArrayList<>();
		for (Cafe cafe: this.cafes){
			if(cafe.getTamaño().equals(tamaño)){
				cafes.add(cafe);
			}
		}
		return cafes;
	}
	public Cafe buscarCafe(Cafe cafe) {
		for (Cafe cafe1: this.cafes){
			if (cafe1.equals(cafe)){
				return cafe;
			}
		}
		return null;
	}
	public void eliminarCafe(Cafe cafe) {
		if (buscarCafe(cafe)!=null){
			cafes.remove(cafe);
		}
	}

	public Cafeteria modificarCafeteria(Cafeteria cafeteria) {
		for()
	}
}