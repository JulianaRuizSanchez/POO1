//2.	Crea un programa que realiza conversiones entre diferentes unidades de medida, como millas a kilómetros, libras a kilogramos,
//  grados Fahrenheit a Celsius, joule a kilocaloría y kilobyte a megabyte. Utilice métodos separados para cada tipo de conversión.

package ConversorUnidades;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ConversorForm {
    private JPanel ConversorForm;
    private JTextPane Valor;
    private JTextPane Total;
    private JButton Calcular;
    private JButton Limpiar;
    private JButton Salir;
    private JComboBox Unidad;

    public static double Longitud(double millas){
        return millas * 1.60934;
    }

    public static double Masa(double libras){
        return libras / 2.205;
    }

    public static double Temperatura(double farenheit){
        return (farenheit - 32.0) * (5.0/9.0);
    }

    public static double Energia(double joule){
        return joule / 4184.0;
    }

    public static  double Datos(double kilobyte){
        return kilobyte / 1000.0;
    }

    public ConversorForm() {

        Unidad.addItem("Seleccionar");
        Unidad.addItem("Millas a kilómetros");
        Unidad.addItem("Libras a kilogramos");
        Unidad.addItem("Farenheit a celcius");
        Unidad.addItem("Joules a kilocaloría");
        Unidad.addItem("Kilobyte a megabyte");

        Valor.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        Calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String unidad = (String)Unidad.getSelectedItem();
                double valor = Double.parseDouble(Valor.getText());
                double total = 0.0;
                switch (unidad) {
                    case "Millas a kilómetros":
                        total = Longitud(valor);
                        break;
                    case "Libras a kilogramos":
                        total = Masa(valor);
                        break;
                    case "Farenheit a celcius":
                        total = Temperatura(valor);
                        break;
                    case "Joules a kilocaloría":
                        total = Energia(valor);
                        break;
                    case "Kilobyte a megabyte":
                        total = Datos(valor);
                        break;
                }

                Total.setText(Double.toString(total));
            }
        });

        Limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Unidad.setSelectedIndex(0);
                Valor.setText(null);
                Total.setText(null);
            }
        });

        Salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Conversor unidades de medida");
        frame.setContentPane(new ConversorForm().ConversorForm);
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
