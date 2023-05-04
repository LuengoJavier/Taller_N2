package controller;

import model.Cafe;
import model.Cafeteria;
import model.Tamaño;

import java.util.ArrayList;
import java.util.List;

public class CafeteriaController {
	private List<Cafe> cafes;

	public void aÑadirCafe(int gramosCafe, int mlAgua, String tamaño, ArrayList<String> ingredientes) {

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

	public void eliminarCafe(Cafe cafe) {
		throw new UnsupportedOperationException();
	}

	public Cafeteria modificarCafeteria(Cafeteria cafeteria) {
		throw new UnsupportedOperationException();
	}
}