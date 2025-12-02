package gui;

import javax.swing.*;
import java.awt.*;

public class InterfazOperadores extends JFrame {
    private Ejercicios ejercicios;

    public InterfazOperadores() {
        ejercicios = new Ejercicios();
        initComponents();
    }

    private void initComponents() {
        setTitle("Ejercicios - Operadores");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.addTab("Operaciones Básicas", crearPanelOperacionesBasicas());
        tabbedPane.addTab("Comparaciones", crearPanelComparaciones());
        tabbedPane.addTab("Verificaciones", crearPanelVerificaciones());

        add(tabbedPane);
    }

    private JPanel crearPanelOperacionesBasicas() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Sumar dos números
        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(new JLabel("Sumar dos números:"), gbc);

        JTextField txtNum1 = new JTextField(8);
        gbc.gridx = 1;
        panel.add(txtNum1, gbc);

        gbc.gridx = 2;
        panel.add(new JLabel("+"), gbc);

        JTextField txtNum2 = new JTextField(8);
        gbc.gridx = 3;
        panel.add(txtNum2, gbc);

        JTextField txtResultadoSuma = new JTextField(10);
        txtResultadoSuma.setEditable(false);
        gbc.gridx = 4;
        panel.add(txtResultadoSuma, gbc);

        JButton btnSumar = new JButton("Calcular");
        gbc.gridx = 5;
        panel.add(btnSumar, gbc);

        btnSumar.addActionListener(e -> {
            try {
                int a = Integer.parseInt(txtNum1.getText());
                int b = Integer.parseInt(txtNum2.getText());
                int resultado = ejercicios.sumarDosNumeros(a, b);
                txtResultadoSuma.setText(String.valueOf(resultado));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese números válidos");
            }
        });

        // Calcular Resto
        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(new JLabel("Calcular Resto:"), gbc);

        JTextField txtDividendo = new JTextField(8);
        gbc.gridx = 1;
        panel.add(txtDividendo, gbc);

        gbc.gridx = 2;
        panel.add(new JLabel("%"), gbc);

        JTextField txtDivisor = new JTextField(8);
        gbc.gridx = 3;
        panel.add(txtDivisor, gbc);

        JTextField txtResultadoResto = new JTextField(10);
        txtResultadoResto.setEditable(false);
        gbc.gridx = 4;
        panel.add(txtResultadoResto, gbc);

        JButton btnResto = new JButton("Calcular");
        gbc.gridx = 5;
        panel.add(btnResto, gbc);

        btnResto.addActionListener(e -> {
            try {
                int dividendo = Integer.parseInt(txtDividendo.getText());
                int divisor = Integer.parseInt(txtDivisor.getText());
                if (divisor == 0) {
                    JOptionPane.showMessageDialog(this, "No se puede dividir por cero");
                    return;
                }
                int resultado = ejercicios.calcularResto(dividendo, divisor);
                txtResultadoResto.setText(String.valueOf(resultado));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese números válidos");
            }
        });

        // Incrementar en uno
        gbc.gridx = 0; gbc.gridy = 2;
        panel.add(new JLabel("Incrementar en 1:"), gbc);

        JTextField txtIncremento = new JTextField(8);
        gbc.gridx = 1;
        panel.add(txtIncremento, gbc);

        JTextField txtResultadoInc = new JTextField(10);
        txtResultadoInc.setEditable(false);
        gbc.gridx = 4;
        panel.add(txtResultadoInc, gbc);

        JButton btnIncrementar = new JButton("Incrementar");
        gbc.gridx = 5;
        panel.add(btnIncrementar, gbc);

        btnIncrementar.addActionListener(e -> {
            try {
                int num = Integer.parseInt(txtIncremento.getText());
                int resultado = ejercicios.incrementarEnUno(num);
                txtResultadoInc.setText(String.valueOf(resultado));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese un número válido");
            }
        });

        return panel;
    }

    private JPanel crearPanelComparaciones() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Es mayor que
        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(new JLabel("¿Es mayor que?:"), gbc);

        JTextField txtMayor1 = new JTextField(8);
        gbc.gridx = 1;
        panel.add(txtMayor1, gbc);

        gbc.gridx = 2;
        panel.add(new JLabel(">"), gbc);

        JTextField txtMayor2 = new JTextField(8);
        gbc.gridx = 3;
        panel.add(txtMayor2, gbc);

        JTextField txtResultadoMayor = new JTextField(10);
        txtResultadoMayor.setEditable(false);
        gbc.gridx = 4;
        panel.add(txtResultadoMayor, gbc);

        JButton btnMayor = new JButton("Verificar");
        gbc.gridx = 5;
        panel.add(btnMayor, gbc);

        btnMayor.addActionListener(e -> {
            try {
                int a = Integer.parseInt(txtMayor1.getText());
                int b = Integer.parseInt(txtMayor2.getText());
                boolean resultado = ejercicios.esMayorQue(a, b);
                txtResultadoMayor.setText(String.valueOf(resultado));
                txtResultadoMayor.setBackground(resultado ? Color.GREEN : Color.PINK);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese números válidos");
            }
        });

        // Es par y positivo
        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(new JLabel("¿Es par Y positivo?:"), gbc);

        JTextField txtParPos = new JTextField(8);
        gbc.gridx = 1;
        panel.add(txtParPos, gbc);

        JTextField txtResultadoParPos = new JTextField(10);
        txtResultadoParPos.setEditable(false);
        gbc.gridx = 4;
        panel.add(txtResultadoParPos, gbc);

        JButton btnParPos = new JButton("Verificar");
        gbc.gridx = 5;
        panel.add(btnParPos, gbc);

        btnParPos.addActionListener(e -> {
            try {
                int num = Integer.parseInt(txtParPos.getText());
                boolean resultado = ejercicios.esParYPositivo(num);
                txtResultadoParPos.setText(String.valueOf(resultado));
                txtResultadoParPos.setBackground(resultado ? Color.GREEN : Color.PINK);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese un número válido");
            }
        });

        return panel;
    }

    private JPanel crearPanelVerificaciones() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Es múltiplo de 3
        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(new JLabel("¿Es múltiplo de 3?:"), gbc);

        JTextField txtMult3 = new JTextField(10);
        gbc.gridx = 1;
        panel.add(txtMult3, gbc);

        JTextField txtResultadoMult3 = new JTextField(10);
        txtResultadoMult3.setEditable(false);
        gbc.gridx = 2;
        panel.add(txtResultadoMult3, gbc);

        JButton btnMult3 = new JButton("Verificar");
        gbc.gridx = 3;
        panel.add(btnMult3, gbc);

        btnMult3.addActionListener(e -> {
            try {
                int num = Integer.parseInt(txtMult3.getText());
                boolean resultado = ejercicios.esMultiploDeTres(num);
                txtResultadoMult3.setText(resultado ? "SÍ" : "NO");
                txtResultadoMult3.setBackground(resultado ? Color.GREEN : Color.PINK);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese un número válido");
            }
        });

        // Es múltiplo de N
        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(new JLabel("¿Es múltiplo de N?:"), gbc);

        JTextField txtNumMultN = new JTextField(10);
        gbc.gridx = 1;
        panel.add(txtNumMultN, gbc);

        JTextField txtN = new JTextField(10);
        gbc.gridx = 2;
        panel.add(txtN, gbc);

        JTextField txtResultadoMultN = new JTextField(10);
        txtResultadoMultN.setEditable(false);
        gbc.gridx = 3;
        panel.add(txtResultadoMultN, gbc);

        JButton btnMultN = new JButton("Verificar");
        gbc.gridx = 4;
        panel.add(btnMultN, gbc);

        btnMultN.addActionListener(e -> {
            try {
                int num = Integer.parseInt(txtNumMultN.getText());
                int n = Integer.parseInt(txtN.getText());
                if (n == 0) {
                    JOptionPane.showMessageDialog(this, "N no puede ser cero");
                    return;
                }
                boolean resultado = ejercicios.esMultiploDeN(num, n);
                txtResultadoMultN.setText(resultado ? "SÍ" : "NO");
                txtResultadoMultN.setBackground(resultado ? Color.GREEN : Color.PINK);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese números válidos");
            }
        });

        // Es divisible por
        gbc.gridx = 0; gbc.gridy = 2;
        panel.add(new JLabel("¿Es divisible por?:"), gbc);

        JTextField txtNumDiv = new JTextField(10);
        gbc.gridx = 1;
        panel.add(txtNumDiv, gbc);

        JTextField txtDivisorDiv = new JTextField(10);
        gbc.gridx = 2;
        panel.add(txtDivisorDiv, gbc);

        JTextField txtResultadoDiv = new JTextField(10);
        txtResultadoDiv.setEditable(false);
        gbc.gridx = 3;
        panel.add(txtResultadoDiv, gbc);

        JButton btnDiv = new JButton("Verificar");
        gbc.gridx = 4;
        panel.add(btnDiv, gbc);

        btnDiv.addActionListener(e -> {
            try {
                int num = Integer.parseInt(txtNumDiv.getText());
                int divisor = Integer.parseInt(txtDivisorDiv.getText());
                if (divisor == 0) {
                    JOptionPane.showMessageDialog(this, "No se puede dividir por cero");
                    return;
                }
                boolean resultado = ejercicios.esDivisiblePor(num, divisor);
                txtResultadoDiv.setText(resultado ? "SÍ" : "NO");
                txtResultadoDiv.setBackground(resultado ? Color.GREEN : Color.PINK);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese números válidos");
            }
        });

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new InterfazOperadores().setVisible(true);
        });
    }
}