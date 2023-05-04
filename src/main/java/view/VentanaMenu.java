package view;

import controller.CafeteriaController;

import javax.swing.*;
import java.awt.event.*;

public class VentanaMenu extends Ventana {

    private JLabel textoMenu;
    private JButton botonIngresarCafe;
    private JButton botonBuscarCafe;
    private JButton botonDescontinuarCafe;
    private JButton botonModificarDatos;
    private JButton botonSalida;
    private CafeteriaController cafeteriaController;

    public VentanaMenu(CafeteriaController cafeteriaController) {
        super("Menu cafeteria", 500, 520);
        this.cafeteriaController = cafeteriaController;
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        generarMensajeMenu();
        generarBotonIngresarCafe();
        generarBotonDescontinuar();
        generarBotonModificarDatos();
        generarBotonBuscarCafe();
        generarBotonSalir();
        revalidate();
        repaint();
    }

    private void generarMensajeMenu() {
        String textoBienvenida = "Gestión interna Cafeteria";
        super.generarJLabelEncabezado(this.textoMenu, textoBienvenida, 20, 10, 500, 30);
    }

    private void generarBotonIngresarCafe() {
        String textoBoton = "Añadir nuevo café";
        this.botonIngresarCafe = super.generarBoton(textoBoton, 150, 100, 200, 50);
        this.add(this.botonIngresarCafe);
        this.botonIngresarCafe.addActionListener(this);
    }

    private void generarBotonDescontinuar() {
        String textoBoton = "Descontinuar un café";
        this.botonDescontinuarCafe = super.generarBoton(textoBoton, 150, 180, 200, 50);
        this.add(this.botonDescontinuarCafe);
        this.botonDescontinuarCafe.addActionListener(this);
    }
    private void generarBotonModificarDatos(){
        String textoBoton = "Modificar datos cafeteria";
        this.botonModificarDatos=super.generarBoton(textoBoton, 150, 260, 200, 50);
        this.add(this.botonModificarDatos);
        this.botonModificarDatos.addActionListener(this);
    }
    private void generarBotonBuscarCafe(){
        String textoBoton = "Modificar datos cafeteria";
        this.botonBuscarCafe=super.generarBoton(textoBoton, 150, 260, 200, 50);
        this.add(this.botonBuscarCafe);
        this.botonBuscarCafe.addActionListener(this);
    }

    private void generarBotonSalir() {
        String textoBoton = "Salir";
        this.botonSalida = super.generarBoton(textoBoton, 175, 420, 150, 40);
        this.add(this.botonSalida);
        this.botonSalida.addActionListener(this);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonIngresarCafe) {
            VentanaAgregar ventanaAgregar= new VentanaAgregar(cafeteriaController);
            //Cierra la ventana actual
            this.dispose();
        }
        if(e.getSource() == this.botonDescontinuarCafe){
            VentanaDescontinuar ventanaDescontinuar = new VentanaDescontinuar(cafeteriaController);
            this.dispose();
        }
        if(e.getSource() == this.botonBuscarCafe){
            VentanaBuscar ventanaBuscar= new VentanaBuscar(cafeteriaController);
            this.dispose();
        }
        if(e.getSource() == this.botonModificarDatos){
           // VentanaModificar ventanaModificar = new VentanaModificar(cafeteriaController);
            this.dispose();
        }

        if (e.getSource() == this.botonSalida){
            this.dispose();
            System.exit(0);
        }
    }
}
