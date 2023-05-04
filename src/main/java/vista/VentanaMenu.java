package vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMenu extends JFrame implements ActionListener {

    private JButton btnAgregarCafe;
    private JButton btnObtenerListaCafes;
    private JButton btnDescontinuarCafe;
    private JButton btnModificarInformacion;
    private JButton btnSalir;

    public VentanaMenu() {
        super("Menú Cafetería");

        // Configuración de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new GridLayout(5, 1));

        // Creación de los botones
        btnAgregarCafe = new JButton("Agregar Café");
        btnObtenerListaCafes = new JButton("Obtener Lista de Cafés");
        btnDescontinuarCafe = new JButton("Descontinuar Café");
        btnModificarInformacion = new JButton("Modificar Información de la Cafetería");
        btnSalir = new JButton("Salir");

        // Agregar los botones a la ventana
        add(btnAgregarCafe);
        add(btnObtenerListaCafes);
        add(btnDescontinuarCafe);
        add(btnModificarInformacion);
        add(btnSalir);

        // Agregar los ActionListeners a los botones
        btnAgregarCafe.addActionListener(this);
        btnObtenerListaCafes.addActionListener(this);
        btnDescontinuarCafe.addActionListener(this);
        btnModificarInformacion.addActionListener(this);
        btnSalir.addActionListener(this);

        // Mostrar la ventana
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAgregarCafe) {
            agregarCafe();
        } else if (e.getSource() == btnObtenerListaCafes) {
            obtenerListaCafes();
        } else if (e.getSource() == btnDescontinuarCafe) {
            descontinuarCafe();
        } else if (e.getSource() == btnModificarInformacion) {
            modificarInformacionCafeteria();
        } else if (e.getSource() == btnSalir) {
            salir();
        }
    }

    private void agregarCafe() {
        // Implementación del botón "Agregar Café"
        System.out.println("Agregar Café");
    }

    private void obtenerListaCafes() {
        // Implementación del botón "Obtener Lista de Cafés"
        System.out.println("Obtener Lista de Cafés");
    }

    private void descontinuarCafe() {
        // Implementación del botón "Descontinuar Café"
        System.out.println("Descontinuar Café");
    }

    private void modificarInformacionCafeteria() {
        // Implementación del botón "Modificar Información de la Cafetería"
        System.out.println("Modificar Información de la Cafetería");
    }

    private void salir() {
        // Implementación del botón "Salir"
        System.exit(0);
    }

    public static void main(String[] args) {
        VentanaMenu ventana = new VentanaMenu();
    }
}