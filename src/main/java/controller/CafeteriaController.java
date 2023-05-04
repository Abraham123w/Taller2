package controller;




import model.Cafeteria;
import model.Caffe;
import model.data.DataCaffeteria;

import java.util.List;

public class CafeteriaController {

    public static Cafeteria cargaMasivaDatos(Automotora automotora){

        DataAutomotora.leerArchivoClientes(automotora, "C:\\Users\\abrah\\OneDrive\\Escritorio\\Auni2023\\TAREAS LAB PROGRAMACION\\casoautomotora3.0\\clientes.txt");
        DataAutomotora.leerArchivoVehiculos(automotora, "C:\\Users\\abrah\\OneDrive\\Escritorio\\Auni2023\\TAREAS LAB PROGRAMACION\\casoautomotora3.0\\vehiculos.txt");
        return automotora;
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

    public static void almacenarDatos(Automotora automotora) {
        // Se registran los datos de los clientes en un archivo llamado "clientes.txt"
        DataAutomotora.registrarDatos(automotora.getClientes(), "clientes.txt");



        // Se registran los datos de los vehículos a la venta en un archivo llamado "vehiculos.txt"
        DataAutomotora.registrarDatos(automotora.getVehiculos(), "vehiculos.txt");
    }
}
