package gui;

import javax.swing.*;
import java.awt.*;

public class InterfazCiclos extends JFrame {
    private Ejercicios Ejercicios;

    public InterfazCiclos() {
        Ejercicios = new Ejercicios();
        setTitle("Ejercicios - Ciclos");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("Cálculos", crearPanelCalculos());
        tabs.addTab("Verificaciones", crearPanelVerificaciones());
        tabs.addTab("Tabla", crearPanelTabla());
        add(tabs);
    }

    private JPanel crearPanelCalculos() {
        JPanel panel = new JPanel(new GridLayout(5, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panel.add(crearEjercicioSimple("Sumar hasta N:", n -> Ejercicios.sumarHastaN(n)));
        panel.add(crearEjercicioSimple("Factorial:", n -> Ejercicios.factorial(n)));
        panel.add(crearEjercicioSimple("Fibonacci:", n -> Ejercicios.fibonacci(n)));
        panel.add(crearEjercicioSimple("Contar dígitos:", n -> Ejercicios.contarDigitos(n) + " dígitos"));

        return panel;
    }

    private JPanel crearPanelVerificaciones() {
        JPanel panel = new JPanel(new GridLayout(4, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panel.add(crearVerificacion("¿Es número perfecto?:", n -> Ejercicios.esNumeroPerfecto(n)));
        panel.add(crearVerificacion("¿Es año bisiesto?:", n -> Ejercicios.esBisiesto(n)));
        panel.add(crearVerificacion("¿Es número mágico?:", n -> Ejercicios.numeroMagico(n)));

        return panel;
    }

    private JPanel crearEjercicioSimple(String label, FuncionCalculo funcion) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        panel.add(new JLabel(label));
        JTextField input = new JTextField(10);
        panel.add(input);

        JTextField resultado = new JTextField(15);
        resultado.setEditable(false);
        panel.add(resultado);

        JButton btn = new JButton("Calcular");
        panel.add(btn);

        btn.addActionListener(e -> {
            try {
                int num = Integer.parseInt(input.getText());
                Object res = funcion.calcular(num);
                resultado.setText(res.toString());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        });

        return panel;
    }

    private JPanel crearVerificacion(String label, FuncionVerificacion funcion) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        panel.add(new JLabel(label));
        JTextField input = new JTextField(10);
        panel.add(input);

        JTextField resultado = new JTextField(15);
        resultado.setEditable(false);
        panel.add(resultado);

        JButton btn = new JButton("Verificar");
        panel.add(btn);

        btn.addActionListener(e -> {
            try {
                int num = Integer.parseInt(input.getText());
                boolean res = funcion.verificar(num);
                resultado.setText(res ? "SÍ" : "NO");
                resultado.setBackground(res ? Color.GREEN : Color.PINK);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        });

        return panel;
    }

    private JPanel crearPanelTabla() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel top = new JPanel();
        top.add(new JLabel("Número:"));
        JTextField input = new JTextField(10);
        top.add(input);
        JButton btn = new JButton("Generar");
        top.add(btn);

        JTextArea area = new JTextArea(15, 30);
        area.setEditable(false);
        area.setFont(new Font("Monospaced", Font.PLAIN, 14));

        btn.addActionListener(e -> {
            try {
                int num = Integer.parseInt(input.getText());
                area.setText(Ejercicios.tablaMultiplicar(num));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        });

        panel.add(top, BorderLayout.NORTH);
        panel.add(new JScrollPane(area), BorderLayout.CENTER);
        return panel;
    }

    // Interfaces funcionales para hacer el código más corto
    interface FuncionCalculo {
        Object calcular(int n) throws Exception;
    }

    interface FuncionVerificacion {
        boolean verificar(int n) throws Exception;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InterfazCiclos().setVisible(true));
    }
}