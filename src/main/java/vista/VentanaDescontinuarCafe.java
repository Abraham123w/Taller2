package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaDescontinuarCafe extends JFrame implements ActionListener {

    private JComboBox<String> cmbCafes;
    private JButton btnDescontinuar;
    private JButton btnCancelar;

    public VentanaDescontinuarCafe() {
        super("Descontinuar Café");

        // Configuración de la ventana
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 150);
        setLayout(new GridLayout(3, 2));

        // Creación de los componentes
        JLabel lblCafes = new JLabel("Seleccione el café a descontinuar:");
        String[] cafes = {"Café 1", "Café 2", "Café 3"}; // Ejemplo
        cmbCafes = new JComboBox<>(cafes);
        btnDescontinuar = new JButton("Descontinuar");
        btnCancelar = new JButton("Cancelar");

        // Agregar los componentes a la ventana
        add(lblCafes);
        add(cmbCafes);
        add(btnDescontinuar);
        add(btnCancelar);

        // Agregar los ActionListeners a los botones
        btnDescontinuar.addActionListener(this);
        btnCancelar.addActionListener(this);

        // Mostrar la ventana
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnDescontinuar) {
            descontinuarCafe();
        } else if (e.getSource() == btnCancelar) {
            cancelar();
        }
    }

    private void descontinuarCafe() {
        // Implementación del botón "Descontinuar"
        String cafeSeleccionado = (String) cmbCafes.getSelectedItem();
        // Aquí iría el código para descontinuar el café seleccionado
        JOptionPane.showMessageDialog(this, "Café descontinuado correctamente");
        dispose(); // Cerrar la ventana
    }

    private void cancelar() {
        // Implementación del botón "Cancelar"
        dispose(); // Cerrar la ventana
    }

    public static void main(String[] args) {
        VentanaDescontinuarCafe ventana = new VentanaDescontinuarCafe();
    }
}