package view;
import controller.CafeteriaController;
import model.Cafe;
import model.Tamaño;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaDescontinuar extends Ventana {
    private JLabel textoEncabezado, textoNombre, textoGramos, textoAgua, textoIngrediente, textoTamaño;
    private JTextField  campoNombre, campoGramos, campoAgua, campoIngrediente;
    private JComboBox listaTamaño;
    private JButton botonRegistrar, botonCancelar;
    private CafeteriaController cafeteriaController;


    public VentanaDescontinuar(CafeteriaController cafeteriaController){
        super("Registro de cliente", 500, 520);
        this.cafeteriaController = cafeteriaController;
        generarElementosVentana();
    }
    private void generarElementosVentana() {
        generarEncabezado();
        generarBotonCancelar();
        generarBotonRegistrar();
        generarCampoCantidadGramos();
        generarCampoNombre();
        generarCampoCantidadAgua();
        generarCampoIngrediente();
        generarListaTamaño();
        revalidate();
        repaint();
    }
    private void generarEncabezado() {
        String textoCabecera = "Registro de nuevo café";
        super.generarJLabelEncabezado(this.textoEncabezado, textoCabecera, 190, 10, 200, 50);

    }
    private void generarBotonRegistrar() {
        String textoBoton= "Registrar Cliente";
        this.botonRegistrar = super.generarBoton(textoBoton, 75, 400, 150, 20);
        this.add(this.botonRegistrar);
        this.botonRegistrar.addActionListener(this);
    }
    private void generarBotonCancelar() {
        String textoBotonCancelar = "Cancelar";
        this.botonCancelar = super.generarBoton(textoBotonCancelar, 275, 400, 150, 20);
        this.add(this.botonCancelar);
        this.botonCancelar.addActionListener(this);
    }
    private void generarCampoNombre(){
        String textoNombre= "Nombre:";
        super.generarJLabel(this.textoNombre,textoNombre,20,50,150,20);
        this.campoNombre= super.generarJTextField(200,50,250,20);
        this.add(this.campoNombre);
    }
    private void generarCampoCantidadGramos(){
        String textoGramos= "Cantidad de gramos[g]: ";
        super.generarJLabel(this.textoGramos,textoGramos,20,100,150,20);
        this.campoGramos= super.generarJTextField(200,100,250,20);
        this.add(this.campoGramos);
    }
    private void generarCampoCantidadAgua(){
        String textoAgua= "Cantidad de agua [ml]:";
        super.generarJLabel(this.textoAgua,textoAgua,20,150,150,20);
        this.campoAgua= super.generarJTextField(200,150,250,20);
        this.add(this.campoAgua);
    }
    private void generarCampoIngrediente(){
        String textoIngrediente= "Ingrediente extra:";
        super.generarJLabel(this.textoIngrediente, textoIngrediente,20,200,150,20);
        this.campoIngrediente= super.generarJTextField(200,200,250,20);
        this.add(this.campoIngrediente);
    }
    private void generarListaTamaño(){
        super.generarJLabel(this.textoTamaño,"Tamaño café:",20,250,100,20);
        this.listaTamaño=super.generarListaDesplegable(Tamaño.values(),120,250, 100, 20);
        this.add(this.listaTamaño);
    }
    private boolean registrarCafe(){
        if(this.campoNombre.getText().length()== 0|| this.campoGramos.getText().length()==0 ||
                this.campoAgua.getText().length()==0 || this.campoIngrediente.getText().length()==0 ||
                this.listaTamaño.getSelectedItem() == null){
            return false;
        }
        else{

            return true;
        }
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonRegistrar) {
            if(registrarCafe()) {
                cafeteriaController.eliminarCafe(new Cafe(this.campoNombre.getText(),Integer.parseInt(this.campoGramos.getText()),Integer.parseInt(this.campoAgua.getText()),
                        (Tamaño) this.listaTamaño.getSelectedItem(),this.campoIngrediente.getText()));
                JOptionPane.showMessageDialog(this,"Café eliminado correctamente");
                VentanaMenu ventanaMenu = new VentanaMenu(cafeteriaController);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this,"Ingrese datos válidos");
            }

        }
        if (e.getSource() == this.botonCancelar){
            VentanaMenu ventanaMenu = new VentanaMenu(cafeteriaController);
            this.dispose();
        }

    }
}