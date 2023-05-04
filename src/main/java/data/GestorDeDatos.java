package data;
import model.Cafe;
import model.Cafeteria;
import model.Tamaño;

import java.io.*;
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
    public static List<Cafeteria> leerArchivoCafeterias(String direccion) {
        List<Cafeteria> cafeterias = new ArrayList<>();
        String textoArchivo = "";
        try {
            File archivo = new File(direccion);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            //Lee cada linea del archivo hasta que la linea sea nula
            while ((textoArchivo = br.readLine()) != null) {
                String[] data = textoArchivo.split(",");
                cafeterias.add(new Cafeteria(data[0], data[1], data[2], data[4]));
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Documento no disponible, favor contactar con administrador");
        }
        return cafeterias;
    }
    public static void registrarDato(Object objeto, String direccion) {
        boolean lineaVacia = false;
        try {
            File file = new File(direccion);
            if (!file.exists()) {
                file.createNewFile();
                lineaVacia = true;
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            if (lineaVacia == false) {
                bw.newLine();
            }
            bw.write(objeto.toString());
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("Error al ingresar hora de llegada, favor contactar con administrador");
        }
    }

}