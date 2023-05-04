package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAgregarCaffe extends JFrame implements ActionListener {

    private JTextField txtGramosCafe;
    private JTextField txtMlAgua;
    private JTextField txtTamanoCafe;
    private JComboBox<String> cmbIngredientes;
    private JButton btnAgregar;
    private JButton btnCancelar;

    public VentanaAgregarCaffe() {
        super("Agregar Café");

        // Configuración de la ventana
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLayout(new GridLayout(6, 2));

        // Creación de los componentes
        JLabel lblGramosCafe = new JLabel("Gramos de Café:");
        txtGramosCafe = new JTextField();
        JLabel lblMlAgua = new JLabel("Ml de Agua:");
        txtMlAgua = new JTextField();
        JLabel lblTamanoCafe = new JLabel("Tamaño del Café:");
        txtTamanoCafe = new JTextField();
        JLabel lblIngredientes = new JLabel("Ingredientes Adicionales:");
        String[] ingredientes = {"Chocolate", "Leche", "Crema"};
        cmbIngredientes = new JComboBox<>(ingredientes);
        btnAgregar = new JButton("Agregar");
        btnCancelar = new JButton("Cancelar");

        // Agregar los componentes a la ventana
        add(lblGramosCafe);
        add(txtGramosCafe);
        add(lblMlAgua);
        add(txtMlAgua);
        add(lblTamanoCafe);
        add(txtTamanoCafe);
        add(lblIngredientes);
        add(cmbIngredientes);
        add(btnAgregar);
        add(btnCancelar);

        // Agregar los ActionListeners a los botones
        btnAgregar.addActionListener(this);
        btnCancelar.addActionListener(this);

        // Mostrar la ventana
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAgregar) {
            agregarCafe();
        } else if (e.getSource() == btnCancelar) {
            cancelar();
        }
    }

    private void agregarCafe() {
        // Implementación del botón "Agregar"
        int gramosCafe = Integer.parseInt(txtGramosCafe.getText());
        int mlAgua = Integer.parseInt(txtMlAgua.getText());
        String tamanoCafe = txtTamanoCafe.getText();
        String ingredientesAdicionales = (String) cmbIngredientes.getSelectedItem();
        // Aquí iría el código para agregar el café a la base de datos o realizar cualquier otra acción necesaria
        JOptionPane.showMessageDialog(this, "Café agregado correctamente");
        dispose(); // Cerrar la ventana
    }

    private void cancelar() {
        // Implementación del botón "Cancelar"
        dispose(); // Cerrar la ventana
    }

    public static void main(String[] args) {
        VentanaAgregarCaffe ventana = new VentanaAgregarCaffe();
    }
}