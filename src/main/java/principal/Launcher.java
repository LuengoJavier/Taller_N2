package principal;

import controller.CafeteriaController;
import view.VentanaMenu;

public class Launcher {

	public static void main(String[] args) {
		CafeteriaController cafeteriaController = new CafeteriaController("Cafeteria delicias","Temuco");
		cafeteriaController.cargarCafe();
		VentanaMenu ventanaMenu = new VentanaMenu(cafeteriaController);

	}
}