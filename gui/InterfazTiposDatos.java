package gui;

import javax.swing.*;
import java.awt.*;

public class InterfazTiposDatos extends JFrame {
    private JTabbedPane tabbedPane;
    private Ejercicios ejercicios;

    public InterfazTiposDatos() {
        ejercicios = new Ejercicios();
        initComponents();
    }

    private void initComponents() {
        setTitle("Ejercicios - Tipos de Datos y Conversión");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        tabbedPane = new JTabbedPane();

        tabbedPane.addTab("Declaraciones", crearPanelDeclaraciones());
        tabbedPane.addTab("Conversiones", crearPanelConversiones());

        add(tabbedPane);
    }

    private JPanel crearPanelDeclaraciones() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Declarar Entero
        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(new JLabel("Declarar Entero:"), gbc);

        JTextField txtEntero = new JTextField(20);
        txtEntero.setEditable(false);
        gbc.gridx = 1;
        panel.add(txtEntero, gbc);

        JButton btnEntero = new JButton("Ejecutar");
        gbc.gridx = 2;
        panel.add(btnEntero, gbc);

        btnEntero.addActionListener(e -> {
            int resultado = ejercicios.declararEntero();
            txtEntero.setText(String.valueOf(resultado));
        });

        // Declarar Decimal
        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(new JLabel("Declarar Decimal:"), gbc);

        JTextField txtDecimal = new JTextField(20);
        txtDecimal.setEditable(false);
        gbc.gridx = 1;
        panel.add(txtDecimal, gbc);

        JButton btnDecimal = new JButton("Ejecutar");
        gbc.gridx = 2;
        panel.add(btnDecimal, gbc);

        btnDecimal.addActionListener(e -> {
            double resultado = ejercicios.declararDecimal();
            txtDecimal.setText(String.valueOf(resultado));
        });

        // Declarar Texto
        gbc.gridx = 0; gbc.gridy = 2;
        panel.add(new JLabel("Declarar Texto:"), gbc);

        JTextField txtTexto = new JTextField(20);
        txtTexto.setEditable(false);
        gbc.gridx = 1;
        panel.add(txtTexto, gbc);

        JButton btnTexto = new JButton("Ejecutar");
        gbc.gridx = 2;
        panel.add(btnTexto, gbc);

        btnTexto.addActionListener(e -> {
            String resultado = ejercicios.declararTexto();
            txtTexto.setText(resultado);
        });

        // Declarar Booleano
        gbc.gridx = 0; gbc.gridy = 3;
        panel.add(new JLabel("Declarar Booleano:"), gbc);

        JTextField txtBooleano = new JTextField(20);
        txtBooleano.setEditable(false);
        gbc.gridx = 1;
        panel.add(txtBooleano, gbc);

        JButton btnBooleano = new JButton("Ejecutar");
        gbc.gridx = 2;
        panel.add(btnBooleano, gbc);

        btnBooleano.addActionListener(e -> {
            boolean resultado = ejercicios.declararBooleano();
            txtBooleano.setText(String.valueOf(resultado));
        });

        return panel;
    }

    private JPanel crearPanelConversiones() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Convertir Entero a Texto
        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(new JLabel("Entero a Texto:"), gbc);

        JTextField txtEnteroInput = new JTextField(10);
        gbc.gridx = 1;
        panel.add(txtEnteroInput, gbc);

        JTextField txtEnteroResult = new JTextField(10);
        txtEnteroResult.setEditable(false);
        gbc.gridx = 2;
        panel.add(txtEnteroResult, gbc);

        JButton btnEnteroATexto = new JButton("Convertir");
        gbc.gridx = 3;
        panel.add(btnEnteroATexto, gbc);

        btnEnteroATexto.addActionListener(e -> {
            try {
                int num = Integer.parseInt(txtEnteroInput.getText());
                String resultado = ejercicios.convertirEnteroATexto(num);
                txtEnteroResult.setText(resultado);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese un número válido");
            }
        });

        // Convertir Texto a Entero
        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(new JLabel("Texto a Entero:"), gbc);

        JTextField txtTextoInput = new JTextField(10);
        gbc.gridx = 1;
        panel.add(txtTextoInput, gbc);

        JTextField txtTextoResult = new JTextField(10);
        txtTextoResult.setEditable(false);
        gbc.gridx = 2;
        panel.add(txtTextoResult, gbc);

        JButton btnTextoAEntero = new JButton("Convertir");
        gbc.gridx = 3;
        panel.add(btnTextoAEntero, gbc);

        btnTextoAEntero.addActionListener(e -> {
            try {
                int resultado = ejercicios.convertirTextoAEntero(txtTextoInput.getText());
                txtTextoResult.setText(String.valueOf(resultado));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese un texto con números válidos");
            }
        });

        // Convertir Decimal a Entero
        gbc.gridx = 0; gbc.gridy = 2;
        panel.add(new JLabel("Decimal a Entero:"), gbc);

        JTextField txtDecimalInput = new JTextField(10);
        gbc.gridx = 1;
        panel.add(txtDecimalInput, gbc);

        JTextField txtDecimalResult = new JTextField(10);
        txtDecimalResult.setEditable(false);
        gbc.gridx = 2;
        panel.add(txtDecimalResult, gbc);

        JButton btnDecimalAEntero = new JButton("Convertir");
        gbc.gridx = 3;
        panel.add(btnDecimalAEntero, gbc);

        btnDecimalAEntero.addActionListener(e -> {
            try {
                double num = Double.parseDouble(txtDecimalInput.getText());
                int resultado = ejercicios.convertirDecimalAEntero(num);
                txtDecimalResult.setText(String.valueOf(resultado));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese un número decimal válido");
            }
        });

        // Convertir Entero a Decimal
        gbc.gridx = 0; gbc.gridy = 3;
        panel.add(new JLabel("Entero a Decimal:"), gbc);

        JTextField txtEnteroDecInput = new JTextField(10);
        gbc.gridx = 1;
        panel.add(txtEnteroDecInput, gbc);

        JTextField txtEnteroDecResult = new JTextField(10);
        txtEnteroDecResult.setEditable(false);
        gbc.gridx = 2;
        panel.add(txtEnteroDecResult, gbc);

        JButton btnEnteroADecimal = new JButton("Convertir");
        gbc.gridx = 3;
        panel.add(btnEnteroADecimal, gbc);

        btnEnteroADecimal.addActionListener(e -> {
            try {
                int num = Integer.parseInt(txtEnteroDecInput.getText());
                double resultado = ejercicios.convertirEnteroADecimal(num);
                txtEnteroDecResult.setText(String.valueOf(resultado));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese un número válido");
            }
        });

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new InterfazTiposDatos().setVisible(true);
        });
    }
}