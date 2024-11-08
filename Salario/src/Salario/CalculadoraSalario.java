//3.	Elaborar una aplicación que permita calcular el salario neto de un trabajador en función del número de horas trabajadas,
// pago por hora de trabajo y un descuento fijo al sueldo bruto del 20 %.

package Salario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CalculadoraSalario {
    private JPanel CalculadoraForm;
    private JTextPane NombreCompleto;
    private JTextPane Horas;
    private JTextPane PagoxHora;
    private JTextPane Subtotal;
    private JTextPane Descuento;
    private JTextPane Total;
    private JButton Aceptar;
    private JButton Limpiar;
    private JButton Salir;

    public CalculadoraSalario() {

        Horas.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!Character.isDigit(c)){
                    e.consume();
                }
            }
        });
        PagoxHora.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!Character.isDigit(c)){
                    e.consume();
                }
            }
        });

        Aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double horas = Double.parseDouble(Horas.getText());
                double pago = Double.parseDouble((PagoxHora.getText()));
                double subtotal = horas * pago;
                double descuento = subtotal * 0.20;
                double total = subtotal - descuento;

                Subtotal.setText(Double.toString(subtotal));
                Descuento.setText(Double.toString(descuento));
                Total.setText(Double.toString(total));
            }
        });

        Limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NombreCompleto.setText(null);
                Horas.setText(null);
                PagoxHora.setText(null);
                Subtotal.setText(null);
                Descuento.setText(null);
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

    public static void main(String[] args){
        JFrame frame = new JFrame("Cálculo de salario neto");
        frame.setContentPane(new CalculadoraSalario().CalculadoraForm);
        frame.setSize(500,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
