package gui;

import javax.swing.*;
import java.awt.*;

public class InterfazVariables extends JFrame {
    private Ejercicios ejercicios;

    public InterfazVariables() {
        ejercicios = new Ejercicios();
        setTitle("Ejercicios - Variables y Asignación");
        setSize(750, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("Asignación", crearPanelAsignacion());
        tabs.addTab("Operaciones", crearPanelOperaciones());
        add(tabs);
    }

    private JPanel crearPanelAsignacion() {
        JPanel panel = new JPanel(new GridLayout(4, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panel.add(crearAsignarEdad());
        panel.add(crearAsignarNombre());
        panel.add(crearIntercambiarValores());
        panel.add(crearConcatenarDatos());

        return panel;
    }

    private JPanel crearPanelOperaciones() {
        JPanel panel = new JPanel(new GridLayout(2, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panel.add(crearCalcularSalarioTotal());
        panel.add(crearActualizarContador());

        return panel;
    }

    private JPanel crearAsignarEdad() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        panel.add(new JLabel("Asignar edad:"));
        JTextField input = new JTextField(10);
        panel.add(input);

        JTextField resultado = new JTextField(15);
        resultado.setEditable(false);
        panel.add(resultado);

        JButton btn = new JButton("Asignar");
        panel.add(btn);

        btn.addActionListener(e -> {
            try {
                int edad = Integer.parseInt(input.getText());
                int res = ejercicios.asignarEdad(edad);
                resultado.setText("Edad asignada: " + res);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        });

        return panel;
    }

    private JPanel crearAsignarNombre() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        panel.add(new JLabel("Asignar nombre:"));
        JTextField input = new JTextField(15);
        panel.add(input);

        JTextField resultado = new JTextField(20);
        resultado.setEditable(false);
        panel.add(resultado);

        JButton btn = new JButton("Asignar");
        panel.add(btn);

        btn.addActionListener(e -> {
            try {
                String nombre = input.getText();
                String res = ejercicios.asignarNombre(nombre);
                resultado.setText("Nombre: " + res);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        });

        return panel;
    }

    private JPanel crearIntercambiarValores() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        panel.add(new JLabel("Intercambiar valores - A:"));
        JTextField inputA = new JTextField(6);
        panel.add(inputA);

        panel.add(new JLabel("B:"));
        JTextField inputB = new JTextField(6);
        panel.add(inputB);

        JTextField resultado = new JTextField(15);
        resultado.setEditable(false);
        panel.add(resultado);

        JButton btn = new JButton("Intercambiar");
        panel.add(btn);

        btn.addActionListener(e -> {
            try {
                int a = Integer.parseInt(inputA.getText());
                int b = Integer.parseInt(inputB.getText());
                int[] res = ejercicios.intercambiarValores(a, b);
                resultado.setText("[" + res[0] + ", " + res[1] + "]");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        });

        return panel;
    }

    private JPanel crearConcatenarDatos() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        panel.add(new JLabel("Concatenar - Nombre:"));
        JTextField inputNombre = new JTextField(10);
        panel.add(inputNombre);

        panel.add(new JLabel("Edad:"));
        JTextField inputEdad = new JTextField(6);
        panel.add(inputEdad);

        JTextField resultado = new JTextField(25);
        resultado.setEditable(false);
        panel.add(resultado);

        JButton btn = new JButton("Concatenar");
        panel.add(btn);

        btn.addActionListener(e -> {
            try {
                String nombre = inputNombre.getText();
                int edad = Integer.parseInt(inputEdad.getText());
                String res = ejercicios.concatenarDatos(nombre, edad);
                resultado.setText(res);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        });

        return panel;
    }

    private JPanel crearCalcularSalarioTotal() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        panel.add(new JLabel("Salario total - Base:"));
        JTextField inputBase = new JTextField(8);
        panel.add(inputBase);

        panel.add(new JLabel("Bonos:"));
        JTextField inputBonos = new JTextField(8);
        panel.add(inputBonos);

        JTextField resultado = new JTextField(12);
        resultado.setEditable(false);
        panel.add(resultado);

        JButton btn = new JButton("Calcular");
        panel.add(btn);

        btn.addActionListener(e -> {
            try {
                double base = Double.parseDouble(inputBase.getText());
                double bonos = Double.parseDouble(inputBonos.getText());
                double res = ejercicios.calcularSalarioTotal(base, bonos);
                resultado.setText("$" + String.format("%.2f", res));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        });

        return panel;
    }

    private JPanel crearActualizarContador() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        panel.add(new JLabel("Actualizar contador - Actual:"));
        JTextField inputActual = new JTextField(8);
        panel.add(inputActual);

        panel.add(new JLabel("Incremento:"));
        JTextField inputIncremento = new JTextField(8);
        panel.add(inputIncremento);

        JTextField resultado = new JTextField(12);
        resultado.setEditable(false);
        panel.add(resultado);

        JButton btn = new JButton("Actualizar");
        panel.add(btn);

        btn.addActionListener(e -> {
            try {
                int actual = Integer.parseInt(inputActual.getText());
                int incremento = Integer.parseInt(inputIncremento.getText());
                int res = ejercicios.actualizarContador(actual, incremento);
                resultado.setText("Nuevo: " + res);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        });

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InterfazVariables().setVisible(true));
    }
}