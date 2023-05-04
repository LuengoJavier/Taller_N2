package data;
import model.Cafe;
import model.Cafeteria;
import model.Tamaño;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class GestorDeDatos {
    public static List<Cafe> leerArchivoCafes(String direccion) {
        List<Cafe> cafes = new ArrayList<>();
        String textoArchivo = "";
        try {
            File archivo = new File(direccion);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            //Lee cada linea del archivo hasta que la linea sea nula
            while ((textoArchivo = br.readLine()) != null) {
                String[] data = textoArchivo.split(",");
                cafes.add(new Cafe(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), Tamaño.valueOf(data[3].toUpperCase()) , data[4]));
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Documento no disponible, favor contactar con administrador");
        }
        return cafes;
    }

}