package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaObtenerListaCaffes extends JFrame implements ActionListener {

    private JComboBox<String> cmbTamanos;
    private JButton btnObtener;
    private JButton btnCancelar;

    public VentanaObtenerListaCaffes() {
        super("Obtener Lista de Cafés");

        // Configuración de la ventana
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 150);
        setLayout(new GridLayout(3, 2));

        // Creación de los componentes
        JLabel lblTamanos = new JLabel("Seleccione el tamaño:");
        String[] tamanos = {"Pequeño", "Mediano", "Grande"};
        cmbTamanos = new JComboBox<>(tamanos);
        btnObtener = new JButton("Obtener Lista");
        btnCancelar = new JButton("Cancelar");

        // Agregar los componentes a la ventana
        add(lblTamanos);
        add(cmbTamanos);
        add(btnObtener);
        add(btnCancelar);

        // Agregar los ActionListeners a los botones
        btnObtener.addActionListener(this);
        btnCancelar.addActionListener(this);

        // Mostrar la ventana
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnObtener) {
            obtenerListaCafes();
        } else if (e.getSource() == btnCancelar) {
            cancelar();
        }
    }

    private void obtenerListaCafes() {
        // Implementación del botón "Obtener Lista"
        String tamanoSeleccionado = (String) cmbTamanos.getSelectedItem();
        // Aquí iría el código para obtener la lista de cafés del tamaño seleccionado
        JOptionPane.showMessageDialog(this, "Lista de cafés obtenida correctamente");
        dispose(); // Cerrar la ventana
    }

    private void cancelar() {
        // Implementación del botón "Cancelar"
        dispose(); // Cerrar la ventana
    }

    public static void main(String[] args) {
        VentanaObtenerListaCaffes ventana = new VentanaObtenerListaCaffes();
    }
}