// Lo que queremos hacer primeramente es convertir cierta cantidad de pesos a dólares, euros, yenes, libras esterlinas, franco suizo y rublo ruso.

package CambioDivisa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CambioForm {
    private JPanel CambioDivisasForm;
    private JComboBox MonedaCombo;
    private JTextPane CantidadPane;
    private JTextPane TotalPane;
    private JButton Calcular;
    private JButton Cancelar;

    public CambioForm() {
        MonedaCombo.addItem("Dolar");
        MonedaCombo.addItem("Euro");
        MonedaCombo.addItem("Yen");
        MonedaCombo.addItem("Libras esterlinas");
        MonedaCombo.addItem("Franco suizo");
        MonedaCombo.addItem("Rublo ruso");

        CantidadPane.addKeyListener(new KeyAdapter() {
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
                double cantidad = Double.parseDouble(CantidadPane.getText());
                String moneda = (String)MonedaCombo.getSelectedItem();
                double valorMoneda = 0.0;
                switch (moneda) {
                    case "Dolar":
                        valorMoneda = 0.00023;
                        break;
                    case "Euro":
                        valorMoneda = 0.00021;
                        break;
                    case "Yen":
                        valorMoneda = 0.035;
                        break;
                    case "Libras esterlinas":
                        valorMoneda = 0.00018;
                        break;
                    case "Franco suizo":
                        valorMoneda = 0.00020;
                        break;
                    case "Rublo ruso":
                        valorMoneda = 0.022;
                        break;

                }

                double total = valorMoneda * cantidad;

                TotalPane.setText(Double.toString(total));

            }
        });

        Cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cambio divisas");
        frame.setContentPane(new CambioForm().CambioDivisasForm);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}
