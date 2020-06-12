package utilidades;

import clases.Aeropuerto;
import clases.AeropuertoPrivado;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JComboBox;

public class MetodosSueltos {

    
    public static void leerAeropuertos() {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(VariablesGlobales.FICHERO_AEROPUERTOS))) {

            while (true) {
                Aeropuerto a = (Aeropuerto) ois.readObject();
                VariablesGlobales.aeropuertos.add(a);
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        actualizarId();
    }

    
    public static void escribirAeropuerto(Aeropuerto a, boolean aniadirLista) throws FileNotFoundException, IOException {

        File f = new File(VariablesGlobales.FICHERO_AEROPUERTOS);

        if (f.exists()) {
            MiObjectOutputStream oos = new MiObjectOutputStream(new FileOutputStream(VariablesGlobales.FICHERO_AEROPUERTOS, true));
            oos.writeObject(a);
            oos.close();
        } else {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(VariablesGlobales.FICHERO_AEROPUERTOS));
            oos.writeObject(a);
            oos.close();
        }
        
        if(aniadirLista){
        VariablesGlobales.aeropuertos.add(a);
        }
    }

    
    public static boolean validaNumeroEntero(String texto) {
        return texto.matches("^-?[0-9]+$");
    }

    
    public static boolean validaNumeroReal(String texto) {
        return texto.matches("^-?[0-9]+([\\.,][0-9]+)?$");
    }

    private static void actualizarId() {
        if (VariablesGlobales.aeropuertos.size() > 0) {
            int idMayor = 1;
            for (Aeropuerto e : VariablesGlobales.aeropuertos) { //VariablesGlobales.aeropuertos es un array (o arraylist en este caso)

                if (e.getId() > idMayor) { //En la primera iteraccion e.getId() es igual a 1. Luego si se cierra
                    // el programa, cuando ingreso otro aeropuerto, el bucle foreach 
                    //va otra vez a iterar por el primero, y el segundo aeropuerto.
                    idMayor = e.getId();
                }
            }

            Aeropuerto.setIdAutonumerado(idMayor + 1);
        }
    }
    
    
    public static void cargarAeropuertos(JComboBox cmb) {
        String estado = "";

        for (Aeropuerto e : VariablesGlobales.aeropuertos) {
            estado = e.getNombre();

            if (e instanceof AeropuertoPrivado) {
                estado += "(Privado)";
            } else {
                estado += "(Publico)";
            }

            cmb.addItem(estado);
        }
    }

    public static void actualizarFichero() throws IOException {
        
        File f = new File(VariablesGlobales.FICHERO_AEROPUERTOS);
        f.delete();
        
        for(Aeropuerto e: VariablesGlobales.aeropuertos){
            escribirAeropuerto(e, false);
        }

    }

}
