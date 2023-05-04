package vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaModificarCafeteria extends JFrame implements ActionListener {

    private JTextField txtNombre;
    private JTextField txtDireccion;
    private JTextField txtFacebook;
    private JTextField txtInstagram;
    private JTextField txtTwitter;
    private JButton btnModificar;
    private JButton btnCancelar;

    public VentanaModificarCafeteria() {
        super("Modificar Información de Cafetería");

        // Configuración de la ventana
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLayout(new GridLayout(7, 2));

        // Creación de los componentes
        JLabel lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField();
        JLabel lblDireccion = new JLabel("Dirección:");
        txtDireccion = new JTextField();
        JLabel lblFacebook = new JLabel("Facebook:");
        txtFacebook = new JTextField();
        JLabel lblInstagram = new JLabel("Instagram:");
        txtInstagram = new JTextField();
        JLabel lblTwitter = new JLabel("Twitter:");
        txtTwitter = new JTextField();
        btnModificar = new JButton("Modificar");
        btnCancelar = new JButton("Cancelar");

        // Agregar los componentes a la ventana
        add(lblNombre);
        add(txtNombre);
        add(lblDireccion);
        add(txtDireccion);
        add(lblFacebook);
        add(txtFacebook);
        add(lblInstagram);
        add(txtInstagram);
        add(lblTwitter);
        add(txtTwitter);
        add(btnModificar);
        add(btnCancelar);

        // Agregar los ActionListeners a los botones
        btnModificar.addActionListener(this);
        btnCancelar.addActionListener(this);

        // Mostrar la ventana
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnModificar) {
            modificarCafeteria();
        } else if (e.getSource() == btnCancelar) {
            cancelar();
        }
    }

    private void modificarCafeteria() {
        // Implementación del botón "Modificar"
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();
        String facebook = txtFacebook.getText();
        String instagram = txtInstagram.getText();
        String twitter = txtTwitter.getText();
        // Aquí iría el código para modificar la información de la cafetería en la base de datos o realizar cualquier otra acción necesaria
        JOptionPane.showMessageDialog(this, "Información de la cafetería modificada correctamente");
        dispose(); // Cerrar la ventana
    }

    private void cancelar() {
        // Implementación del botón "Cancelar"
        dispose(); // Cerrar la ventana
    }

    public static void main(String[] args) {
        VentanaModificarCafeteria ventana = new VentanaModificarCafeteria();
    }
}