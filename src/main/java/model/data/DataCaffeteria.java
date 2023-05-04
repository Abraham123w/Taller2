package model.data;



import model.Cafeteria;
import model.Caffe;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DataCaffeteria {

    public static Cafeteria leerArchivoCaffes(Cafeteria cafeteria, String direccionArchivo) {
        String textoArchivo = "";

        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            //Lee cada linea del archivo hasta que la linea sea nula
            while ((textoArchivo = br.readLine()) != null) {
                String[] data = textoArchivo.split(",");
                cafeteria.getCaffes().add(new Caffe(Integer.parseInt(data[0]), Integer.parseInt(data[1]), data[2], data[3]));

                //int gramos, int mililitrosAgua, String tamano, String ingredienteAdicional
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Documento no disponible, favor contactar con administrador");
        }
        return cafeteria;
    }

/*crea un metodo leerArchioVehiculo que resiva por parametro un objeto e tipo Automotora  que contiene una
 lista de vehiculos y reciba la direccion del archivo, los vehiculos tienen como parametro String nombre,
 String rut, String direccion, String numeroTel, String correo y retorne la automotora con los vehiculos anadidos
 */

    /*public static Cafeteria leerArchivoCafeteria(Cafeteria cafeteria, String direccionArchivo) {
        String textoArchivo = "";
        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            //Lee cada linea del archivo hasta que la linea sea nula
            while ((textoArchivo = br.readLine()) != null) {
                System.out.println("encontré el archivo");
                String[] data = textoArchivo.split(",");
                //se llama a una lista de vehiculos alojada en automotora y se  anaden los vehiculos
                // a esa lista de vehiculos

                cafeteria cafeteria1 = new cafeteria(data[0], Integer.parseInt(data[1]), Double.parseDouble(data[2]), Integer.parseInt(data[3]), data[4], data[5]);
                // Suponiendo que tienes una lista de vehículos llamada "vehiculos"

                //String modelo, int ano, double precio, int kilometrosRecorridos, String color, String marca
                //exp, Integer.parseInt(data[3])
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Documento no disponible, favor contactar con administrador");
        }
        return cafeteria;
    }*/
    /*public static Automotora leerArchivoVehiculo(Automotora automotora, String direccionArchivo) {
        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] data = linea.split(",");
                Vehiculo vehiculo = new Vehiculo(data[0], Integer.parseInt(data[1]), Double.parseDouble(data[2]),
                        Integer.parseInt(data[3]), data[4], data[5]);
                automotora.getVehiculos().add(vehiculo);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: archivo no encontrado en la ruta especificada");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de vehículos: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir datos numéricos: " + e.getMessage());
        }
        return automotora;
    }*/

    public static boolean registrarDato(Object objeto, String direccionArchivo) {
        boolean lineaVacia = false;
        try {
            File file = new File(direccionArchivo);
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
            return true;
        } catch (Exception e) {
            System.out.println("Error al ingresar hora de llegada, favor contactar con administrador");
            return false;
        }
    }

    /**
     * Registra los datos de una lista de objetos en un archivo de texto.
     * @param objetos la lista de objetos a registrar.
     * @param direccionArchivo la dirección del archivo de texto.
     * @return true si se registraron los datos correctamente, false si no.
     */
    public static boolean registrarDatos(List objetos, String direccionArchivo) {
        try {
            // Se crea un objeto File con la dirección del archivo.
            File file = new File(direccionArchivo);

            // Si el archivo ya existe, se borra.
            if (Files.deleteIfExists(Paths.get("C:\\Users\\abrah\\OneDrive\\Escritorio\\Auni2023\\TAREAS LAB PROGRAMACION\\" + direccionArchivo))) {
                System.out.println("El fichero ha sido borrado satisfactoriamente");
            } else {
                System.out.println("El fichero no puede ser borrado");
            }

            // Se crea un nuevo archivo con la dirección especificada.
            File fichero = new File(direccionArchivo);
            fichero.createNewFile();

            // Se crea un objeto FileWriter y BufferedWriter para escribir en el archivo.
            FileWriter fw = new FileWriter(fichero, true);
            BufferedWriter bw = new BufferedWriter(fw);

            // Se escribe cada objeto de la lista en una línea del archivo.
            for (Object objeto : objetos) {
                bw.write(objeto.toString());
                bw.newLine();
            }

            // Se cierran los objetos BufferedWriter y FileWriter.
            bw.close();
            fw.close();

            // Se retorna true indicando que se registraron los datos correctamente.
            return true;

        } catch (Exception e) {
            // Si ocurre una excepción, se imprime el mensaje de la excepción y se retorna false.
            System.out.println(e.getMessage());
            return false;
        }
    }


}