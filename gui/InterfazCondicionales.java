package gui;

import javax.swing.*;
import java.awt.*;

public class InterfazCondicionales extends JFrame {
    private Ejercicios ejercicios;

    public InterfazCondicionales() {
        ejercicios = new Ejercicios();
        setTitle("Ejercicios - Condicionales");
        setSize(750, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("Verificaciones", crearPanelVerificaciones());
        tabs.addTab("Evaluaciones", crearPanelEvaluaciones());
        tabs.addTab("Categorías", crearPanelCategorias());
        add(tabs);
    }

    private JPanel crearPanelVerificaciones() {
        JPanel panel = new JPanel(new GridLayout(3, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panel.add(crearVerificacionSimple("¿Es mayor de edad?:", edad -> ejercicios.esMayorDeEdad(edad)));
        panel.add(crearClasificacionNumero());
        panel.add(crearCategoriaPorEdad());

        return panel;
    }

    private JPanel crearPanelEvaluaciones() {
        JPanel panel = new JPanel(new GridLayout(3, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panel.add(crearEvaluacionPrueba());
        panel.add(crearEvaluacionAptitud());
        panel.add(crearDescuentoEstudiante());

        return panel;
    }

    private JPanel crearPanelCategorias() {
        JPanel panel = new JPanel(new GridLayout(2, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panel.add(crearCategoriaPorEdad());

        return panel;
    }

    private JPanel crearVerificacionSimple(String label, FuncionVerificacion funcion) {
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
                int valor = Integer.parseInt(input.getText());
                boolean res = funcion.verificar(valor);
                resultado.setText(res ? "SÍ" : "NO");
                resultado.setBackground(res ? Color.GREEN : Color.PINK);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        });

        return panel;
    }

    private JPanel crearClasificacionNumero() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        panel.add(new JLabel("Clasificar número:"));
        JTextField input = new JTextField(10);
        panel.add(input);

        JTextField resultado = new JTextField(15);
        resultado.setEditable(false);
        panel.add(resultado);

        JButton btn = new JButton("Clasificar");
        panel.add(btn);

        btn.addActionListener(e -> {
            try {
                int num = Integer.parseInt(input.getText());
                String res = ejercicios.clasificarNumero(num);
                resultado.setText(res);
                resultado.setBackground(
                        res.equals("positivo") ? Color.GREEN :
                                res.equals("negativo") ? Color.PINK : Color.YELLOW
                );
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        });

        return panel;
    }

    private JPanel crearEvaluacionPrueba() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        panel.add(new JLabel("Evaluar prueba (nota):"));
        JTextField inputNota = new JTextField(8);
        panel.add(inputNota);

        JTextField resultado = new JTextField(12);
        resultado.setEditable(false);
        panel.add(resultado);

        JButton btn = new JButton("Evaluar");
        panel.add(btn);

        btn.addActionListener(e -> {
            try {
                double nota = Double.parseDouble(inputNota.getText());
                String res = ejercicios.evaluarPrueba(nota);
                resultado.setText(res);
                resultado.setBackground(res.equals("apto") ? Color.GREEN : Color.PINK);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        });

        return panel;
    }

    private JPanel crearEvaluacionAptitud() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        panel.add(new JLabel("Evaluar aptitud - Nota:"));
        JTextField inputNota = new JTextField(5);
        panel.add(inputNota);

        panel.add(new JLabel("Edad:"));
        JTextField inputEdad = new JTextField(5);
        panel.add(inputEdad);

        JCheckBox checkExperiencia = new JCheckBox("Tiene experiencia");
        panel.add(checkExperiencia);

        JTextField resultado = new JTextField(10);
        resultado.setEditable(false);
        panel.add(resultado);

        JButton btn = new JButton("Evaluar");
        panel.add(btn);

        btn.addActionListener(e -> {
            try {
                double nota = Double.parseDouble(inputNota.getText());
                int edad = Integer.parseInt(inputEdad.getText());
                boolean experiencia = checkExperiencia.isSelected();
                String res = ejercicios.evaluarAptitud(nota, edad, experiencia);
                resultado.setText(res);
                resultado.setBackground(res.equals("apto") ? Color.GREEN : Color.PINK);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        });

        return panel;
    }

    private JPanel crearDescuentoEstudiante() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        panel.add(new JLabel("Descuento estudiante - Precio:"));
        JTextField inputPrecio = new JTextField(6);
        panel.add(inputPrecio);

        panel.add(new JLabel("Edad:"));
        JTextField inputEdad = new JTextField(5);
        panel.add(inputEdad);

        JCheckBox checkEstudiante = new JCheckBox("Es estudiante");
        panel.add(checkEstudiante);

        JTextField resultado = new JTextField(10);
        resultado.setEditable(false);
        panel.add(resultado);

        JButton btn = new JButton("Calcular");
        panel.add(btn);

        btn.addActionListener(e -> {
            try {
                double precio = Double.parseDouble(inputPrecio.getText());
                int edad = Integer.parseInt(inputEdad.getText());
                boolean esEstudiante = checkEstudiante.isSelected();
                double res = ejercicios.calcularDescuentoEstudiante(precio, edad, esEstudiante);
                resultado.setText("$" + String.format("%.2f", res));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        });

        return panel;
    }

    private JPanel crearCategoriaPorEdad() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        panel.add(new JLabel("Categoría por edad:"));
        JTextField inputEdad = new JTextField(10);
        panel.add(inputEdad);

        JTextField resultado = new JTextField(15);
        resultado.setEditable(false);
        panel.add(resultado);

        JButton btn = new JButton("Determinar");
        panel.add(btn);

        btn.addActionListener(e -> {
            try {
                int edad = Integer.parseInt(inputEdad.getText());
                String categoria = ejercicios.determinarCategoria(edad);
                resultado.setText(categoria);
                resultado.setBackground(
                        categoria.equals("niño") ? new Color(135, 206, 250) :
                                categoria.equals("adolescente") ? new Color(255, 218, 185) :
                                        categoria.equals("adulto") ? new Color(144, 238, 144) :
                                                categoria.equals("adulto mayor") ? new Color(221, 160, 221) :
                                                        Color.WHITE
                );
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        });

        return panel;
    }

    interface FuncionVerificacion {
        boolean verificar(int valor) throws Exception;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InterfazCondicionales().setVisible(true));
    }
}