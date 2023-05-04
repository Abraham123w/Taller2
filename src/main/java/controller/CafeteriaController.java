package controller;




import model.Cafeteria;
import model.Caffe;
import model.data.DataCaffeteria;

import java.util.List;

public class CafeteriaController {

    public static Cafeteria cargaMasivaDatos(Cafeteria cafeteria){

        DataCaffeteria.leerArchivoCaffes(cafeteria, "C:\\Users\\abrah\\OneDrive\\Escritorio\\Auni2023\\TAREAS LAB PROGRAMACION\\taller2\\caffes.txt");

        return cafeteria;
    }
    public static List buscarVehiculoPorNombre(Automotora automotora, String nombre){
        return automotora.buscarAutoNombre(nombre);
    }
    public static List buscarVehiculoPorMarca(Automotora automotora, String marca){
        return automotora.buscarAutoMarca(marca);
    }
    public static Vehiculo agregarVehiculo(Automotora automotora,String modelo, int ano, double precio, int kilometrosRecorridos, String color, String marca){
        return automotora.añadirVehiculo(modelo,ano,precio,kilometrosRecorridos,color,marca);
    }
    //modelo,ano,precio,kilometrosRecorridos,color,marca

    public static void almacenarDatos(Cafeteria cafeteria) {
        // Se registran los datos de los clientes en un archivo llamado "clientes.txt"
        DataCaffeteria.registrarDatos(cafeteria.getCaffes(), "clientes.txt");



        // Se registran los datos de los vehículos a la venta en un archivo llamado "vehiculos.txt"
        DataCaffeteria.registrarDatos(cafeteria.get, "vehiculos.txt");
    }
}
