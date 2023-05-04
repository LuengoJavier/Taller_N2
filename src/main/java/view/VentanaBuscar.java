package view;

import controller.CafeteriaController;
import model.Cafe;
import model.Tamaño;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
public class VentanaBuscar extends Ventana {
    private JButton botonBuscar, botonRegresar;
    private JLabel textoEncabezado, textoTamaño;
    private JComboBox listaTamaño;
    private CafeteriaController cafeteriaController;

    public VentanaBuscar(CafeteriaController cafeteriaController) {
        super("Búsqueda de café por Tamaño", 500, 520);
        this.cafeteriaController = cafeteriaController;
        generarElementosVentana();
    }
    private void generarElementosVentana() {
        generarBotonBuscarCafe();
        generarBotonCancelar();
        generarListaTamaño();
    }

    private void generarListaTamaño(){
        super.generarJLabel(this.textoTamaño,"Tamaño del café:",20,100,100,40);
        this.listaTamaño=super.generarListaDesplegable(Tamaño.values(),150,100, 150, 40);
        this.add(this.listaTamaño);
    }
    private void generarBotonBuscarCafe() {
        String textoBoton= "Buscar Vehículo";
        this.botonBuscar = super.generarBoton(textoBoton, 75, 400, 150, 20);
        this.add(this.botonBuscar);
        this.botonBuscar.addActionListener(this);
    }
    private void generarBotonCancelar() {
        String textoBotonRegresar = "Regresar";
        this.botonRegresar = super.generarBoton(textoBotonRegresar, 275, 400, 150, 20);
        this.add(this.botonRegresar);
        this.botonRegresar.addActionListener(this);
    }
    private String[][] registrarCafe(){
        List<Cafe> cafes = new ArrayList<>();
        String[][] datosCafe;
        if(this.listaTamaño.getSelectedItem()!=null){
            cafes =  cafeteriaController.obtenerListaCafeTamaÑo((Tamaño) this.listaTamaño.getSelectedItem());
        }
        datosCafe= new String[cafes.size()][4];
        for(int i=0; i<cafes.size(); i++){
            datosCafe[i][0] = cafes.get(i).getNombre();
            datosCafe[i][1] = Integer.toString(cafes.get(i).getGramosCafe());
            datosCafe[i][2] = Integer.toString(cafes.get(i).getMlAgua());
            datosCafe[i][3] = String.valueOf(cafes.get(i).getTamaño());
            datosCafe[i][4] = cafes.get(i).getIngredientes();

        }
        return datosCafe;
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.botonBuscar){
            String[] nombreColumnas={"Nombre","Gramos","Agua[ml]","Tamaño","Ingrediente"};
            VentanaTabla ventanaTabla= new VentanaTabla(registrarCafe(),nombreColumnas);
        }
        if (e.getSource() == this.botonRegresar){
            VentanaMenu ventanaMenu = new VentanaMenu(cafeteriaController);
            this.dispose();
        }

    }
}
