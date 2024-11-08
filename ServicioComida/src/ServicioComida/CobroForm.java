//Este ejercicio se trata de cuando se selecciones uno de los combos   me aparecerá el precio y la imagen de este en TOTAL A COBRAR
//Si selecciono la opción otro pedido me permitirá adquirir alimentos individuales:
//Allí podre adquirir cualquiera de ellos digitando la cantidad al darle clik en el botón calcular me debe aparecer el valor en total a cobrar.

package ServicioComida;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CobroForm {
    private JPanel CobroForm;
    private JRadioButton Combo4;
    private JRadioButton Combo1;
    private JRadioButton Combo2;
    private JTextPane Total;
    private JTextPane CantHambur;
    private JTextPane CantHotDog;
    private JTextPane CantSandwich;
    private JTextPane CantTe;
    private JTextPane CantGaseosa;
    private JTextPane CantPapas;
    private JButton Calcular;
    private JButton Salida;
    private JRadioButton Combo3;
    private JLabel ImgHamburguesa;
    private JLabel ImgHotDog;
    private JLabel ImgSandwich;
    private JLabel ImgTe;
    private JLabel ImgGaseosa;
    private JLabel ImgPapas;
    private JLabel ImgComboGeneral;

    public CobroForm() {

        double precioHambur = 15000;
        double precioHotDog = 9000;
        double precioSandwich = 12000;
        double precioTe = 4000;
        double precioGaseosa = 4500;
        double precioPapas = 6000;

        ButtonGroup group = new ButtonGroup();
        group.add(Combo1);
        group.add(Combo2);
        group.add(Combo3);
        group.add(Combo4);

        ImageIcon hambur = new ImageIcon("Img/hamburguesa.png");
        ImgHamburguesa.setIcon(hambur);
        ImageIcon hotDog = new ImageIcon("Img/hot-dog.png");
        ImgHotDog.setIcon(hotDog);
        ImageIcon sandwich = new ImageIcon("Img/sandwich.png");
        ImgSandwich.setIcon(sandwich);
        ImageIcon te = new ImageIcon("Img/limonada.png");
        ImgTe.setIcon(te);
        ImageIcon gaseosa = new ImageIcon("Img/refresco.png");
        ImgGaseosa.setIcon(gaseosa);
        ImageIcon papas = new ImageIcon("Img/papas-fritas.png");
        ImgPapas.setIcon(papas);
        ImageIcon calculo = new ImageIcon("Img/calculadora.png");
        Calcular.setIcon(calculo);
        ImageIcon salir = new ImageIcon("Img/cerrar-sesion.png");
        Salida.setIcon(salir);

        CantHambur.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!Character.isDigit(c)){
                    e.consume();
                }
            }
        });
        CantHotDog.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!Character.isDigit(c)){
                    e.consume();
                }
            }
        });
        CantSandwich.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!Character.isDigit(c)){
                    e.consume();
                }
            }
        });
        CantTe.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!Character.isDigit(c)){
                    e.consume();
                }
            }
        });
        CantGaseosa.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!Character.isDigit(c)){
                    e.consume();
                }
            }
        });
        CantPapas.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!Character.isDigit(c)){
                    e.consume();
                }
            }
        });

        Combo1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CantHambur.setEditable(false);
                CantHotDog.setEditable(false);
                CantSandwich.setEditable(false);
                CantTe.setEditable(false);
                CantGaseosa.setEditable(false);
                CantPapas.setEditable(false);
                CantHambur.setText("1");
                CantGaseosa.setText("1");
                CantPapas.setText("1");
                CantHotDog.setText("0");
                CantSandwich.setText("0");
                CantTe.setText("0");
            }
        });
        Combo2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CantHambur.setEditable(false);
                CantHotDog.setEditable(false);
                CantSandwich.setEditable(false);
                CantTe.setEditable(false);
                CantGaseosa.setEditable(false);
                CantPapas.setEditable(false);
                CantHambur.setText("0");
                CantGaseosa.setText("1");
                CantPapas.setText("1");
                CantHotDog.setText("1");
                CantSandwich.setText("0");
                CantTe.setText("0");
            }
        });
        Combo3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CantHambur.setEditable(false);
                CantHotDog.setEditable(false);
                CantSandwich.setEditable(false);
                CantTe.setEditable(false);
                CantGaseosa.setEditable(false);
                CantPapas.setEditable(false);
                CantHambur.setText("0");
                CantGaseosa.setText("1");
                CantPapas.setText("1");
                CantHotDog.setText("0");
                CantSandwich.setText("1");
                CantTe.setText("0");
            }
        });
        Combo4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CantHambur.setEditable(true);
                CantHotDog.setEditable(true);
                CantSandwich.setEditable(true);
                CantTe.setEditable(true);
                CantGaseosa.setEditable(true);
                CantPapas.setEditable(true);
                CantHambur.setText("0");
                CantGaseosa.setText("0");
                CantPapas.setText("0");
                CantHotDog.setText("0");
                CantSandwich.setText("0");
                CantTe.setText("0");
            }
        });

        Calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Combo1.isSelected()) {
                    double total = precioHambur + precioGaseosa + precioPapas;
                    ImageIcon comboHam = new ImageIcon("Img/hamburguesa-papas-gaseosa.png");
                    ImgComboGeneral.setIcon(comboHam);
                    Total.setText(Double.toString(total));
                } else if (Combo2.isSelected()) {
                    double total = precioHotDog + precioGaseosa + precioPapas;
                    ImageIcon comboHam = new ImageIcon("Img/perro-papas-gaseosa.jpg");
                    ImgComboGeneral.setIcon(comboHam);
                    Total.setText(Double.toString(total));
                } else if (Combo3.isSelected()) {
                    double total = precioSandwich + precioGaseosa + precioPapas;
                    ImageIcon comboHam = new ImageIcon("Img/sandwich-papas-gaseosa.jpg");
                    ImgComboGeneral.setIcon(comboHam);
                    Total.setText(Double.toString(total));
                } else if (Combo4.isSelected()) {
                    double cantHambur = Double.parseDouble(CantHambur.getText());
                    double cantHotDog = Double.parseDouble(CantHotDog.getText());
                    double cantSandwich = Double.parseDouble(CantSandwich.getText());
                    double cantTe = Double.parseDouble(CantTe.getText());
                    double cantGaseosa = Double.parseDouble(CantGaseosa.getText());
                    double cantPapas = Double.parseDouble(CantPapas.getText());
                    double total = (precioHambur * cantHambur) + (precioHotDog * cantHotDog) + (precioSandwich * cantSandwich) + (precioTe * cantTe) + (precioGaseosa * cantGaseosa) + (precioPapas * cantPapas);
                    ImageIcon comboGeneral = new ImageIcon("Img/otro-pedido.png");
                    ImgComboGeneral.setIcon(comboGeneral);
                    Total.setText(Double.toString(total));
                }
            }
        });

        Salida.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cobro de servicios de comida");
        frame.setContentPane(new CobroForm().CobroForm);
        frame.setSize(600,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
