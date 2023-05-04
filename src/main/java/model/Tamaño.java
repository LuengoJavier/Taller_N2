package model;

public enum Tamaño {
	GRANDE ("GRANDE"),
	MEDIANO ("MEDIANO"),
	PEQUEÑO ("PEQUEÑO");

	private String tamaño;

	private Tamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getTamaño() {
		return this.tamaño;
	}
}