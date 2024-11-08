//Realizar una factura de compra para 4 productos, se solicita calcular importe=P.unitario*cantidad de cada producto el total es la suma de los cuatro importes
//El IGV es el 19% del total y el total a pagar es la resta del total- IGV.
//En tipo de pago debe aparecer como mínimo  4 opciones

package Factura;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.*;
import java.awt.event.*;

public class FacturaForm {
    private JPanel FacturaForm;
    private JSpinner Numero;
    private JTextPane Cliente;
    private JTextPane Direccion;
    private JComboBox TipoPago;
    private JTextPane Ruc;
    private JTextPane Ciudad;
    private JComboBox CantLetras;
    private JTextPane Cantidad1;
    private JTextPane Telefono;
    private JTextPane Cantidad2;
    private JTextPane Cantidad3;
    private JTextPane Cantidad4;
    private JTextPane Descripcion1;
    private JTextPane PrecioUnitario1;
    private JTextPane Importe1;
    private JTextPane Importe2;
    private JTextPane Importe3;
    private JTextPane PrecioUnitario2;
    private JTextPane Descripcion2;
    private JTextPane Descripcion3;
    private JTextPane PrecioUnitario3;
    private JTextPane Descripcion4;
    private JTextPane PrecioUnitario4;
    private JTextPane Importe4;
    private JTextPane Total;
    private JTextPane IGV;
    private JTextPane TotalPago;
    private JButton Limpiar;
    private JButton Calcular;
    private JButton Nuevo;
    private JLabel LabelFactura;
    private JLabel LabelTitulo;

    public FacturaForm() {
        TipoPago.addItem("Seleccionar");
        TipoPago.addItem("Efectivo");
        TipoPago.addItem("Transferencia");
        TipoPago.addItem("Tarjeta débito");
        TipoPago.addItem("Tarjeta crédito");
        CantLetras.addItem("Seleccionar");
        CantLetras.addItem("5");
        CantLetras.addItem("10");
        CantLetras.addItem("15");
        CantLetras.addItem("20");
        LabelFactura.setFont(new Font("Arial", Font.PLAIN, 28));
        LabelTitulo.setFont(new Font("Arial", Font.PLAIN, 20));
        LabelFactura.setForeground(Color.CYAN);

        PrecioUnitario1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });
        PrecioUnitario2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });
        PrecioUnitario3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });
        PrecioUnitario4.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });
        Cantidad1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });
        Cantidad2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });
        Cantidad3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });
        Cantidad4.addKeyListener(new KeyAdapter() {
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
                double cantidad1 = Double.parseDouble(Cantidad1.getText());
                double cantidad2 = Double.parseDouble(Cantidad2.getText());
                double cantidad3 = Double.parseDouble(Cantidad3.getText());
                double cantidad4 = Double.parseDouble(Cantidad4.getText());
                double precioUnitario1 = Double.parseDouble(PrecioUnitario1.getText());
                double precioUnitario2 = Double.parseDouble(PrecioUnitario2.getText());
                double precioUnitario3 = Double.parseDouble(PrecioUnitario3.getText());
                double precioUnitario4 = Double.parseDouble(PrecioUnitario4.getText());

                double importe1 = cantidad1 * precioUnitario1;
                double importe2 = cantidad2 * precioUnitario2;
                double importe3 = cantidad3 * precioUnitario3;
                double importe4 = cantidad4 * precioUnitario4;

                double total = importe1 + importe2 + importe3 + importe4;
                double igv = total * 0.19;
                double totalPago = total - igv;

                Importe1.setText(Double.toString(importe1));
                Importe2.setText(Double.toString(importe2));
                Importe3.setText(Double.toString(importe3));
                Importe4.setText(Double.toString(importe4));
                Total.setText(Double.toString(total));
                IGV.setText(Double.toString(igv));
                TotalPago.setText(Double.toString(totalPago));

            }
        });

        Limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TipoPago.setSelectedIndex(0);
                CantLetras.setSelectedIndex(0);
                Numero.setValue(0);
                Cliente.setText(null);
                Direccion.setText(null);
                Ruc.setText(null);
                Ciudad.setText(null);
                Telefono.setText(null);
                Cantidad1.setText(null);
                Cantidad2.setText(null);
                Cantidad3.setText(null);
                Cantidad4.setText(null);
                Descripcion1.setText(null);
                Descripcion2.setText(null);
                Descripcion3.setText(null);
                Descripcion4.setText(null);
                PrecioUnitario1.setText(null);
                PrecioUnitario2.setText(null);
                PrecioUnitario3.setText(null);
                PrecioUnitario4.setText(null);
                Importe1.setText(null);
                Importe2.setText(null);
                Importe3.setText(null);
                Importe4.setText(null);
                Total.setText(null);
                IGV.setText(null);
                TotalPago.setText(null);
            }
        });

        Nuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TipoPago.setSelectedIndex(0);
                CantLetras.setSelectedIndex(0);
                Numero.setValue(0);
                Cliente.setText(null);
                Direccion.setText(null);
                Ruc.setText(null);
                Ciudad.setText(null);
                Telefono.setText(null);
                Cantidad1.setText(null);
                Cantidad2.setText(null);
                Cantidad3.setText(null);
                Cantidad4.setText(null);
                Descripcion1.setText(null);
                Descripcion2.setText(null);
                Descripcion3.setText(null);
                Descripcion4.setText(null);
                PrecioUnitario1.setText(null);
                PrecioUnitario2.setText(null);
                PrecioUnitario3.setText(null);
                PrecioUnitario4.setText(null);
                Importe1.setText(null);
                Importe2.setText(null);
                Importe3.setText(null);
                Importe4.setText(null);
                Total.setText(null);
                IGV.setText(null);
                TotalPago.setText(null);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Factura");
        frame.setContentPane(new FacturaForm().FacturaForm);
        frame.setSize(650, 550);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
