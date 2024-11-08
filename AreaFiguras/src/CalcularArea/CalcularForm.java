//1.	Escribe un programa que permita calcular el área de figuras geométricas (círculo, triángulo, cuadrado) utilizando métodos para
// cada tipo de figura. El programa debe solicitar al usuario que elija la figura y proporcione los datos necesarios para calcular el área.

package CalcularArea;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CalcularForm {
    private JPanel CalcularForm;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JTextPane Radio;
    private JTextPane Base;
    private JTextPane Altura;
    private JButton Calcular;
    private JButton Limpiar;
    private JTextPane AreaTotal;
    private JLabel labelRadio;
    private JLabel labelBase;
    private JLabel labelAltura;
    private JLabel ImgCirculo;
    private JLabel ImgTriangulo;
    private JLabel ImgCuadrado;

    public static double Circulo(double radio) {
        return Math.PI * (radio * radio);
    }

    public static double Triangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double Cuadrado(double base) {
        return base * base;
    }

    public CalcularForm() {
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        ImageIcon circulo = new ImageIcon("Img/circulo.png");
        ImgCirculo.setIcon(circulo);
        ImageIcon triangulo = new ImageIcon("Img/triangulo.png");
        ImgTriangulo.setIcon(triangulo);
        ImageIcon cuadrado = new ImageIcon("Img/cuadrado.png");
        ImgCuadrado.setIcon(cuadrado);

        Radio.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!Character.isDigit(c)){
                    e.consume();
                }
            }
        });
        Base.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!Character.isDigit(c)){
                    e.consume();
                }
            }
        });
        Altura.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!Character.isDigit(c)){
                    e.consume();
                }
            }
        });

        radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelRadio.setVisible(true);
                Radio.setVisible(true);
                labelBase.setVisible(false);
                Base.setVisible(false);
                labelAltura.setVisible(false);
                Altura.setVisible(false);
            }
        });
        radioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelRadio.setVisible(false);
                Radio.setVisible(false);
                labelBase.setVisible(true);
                Base.setVisible(true);
                labelAltura.setVisible(true);
                Altura.setVisible(true);
            }
        });
        radioButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelRadio.setVisible(false);
                Radio.setVisible(false);
                labelBase.setVisible(true);
                Base.setVisible(true);
                labelAltura.setVisible(false);
                Altura.setVisible(false);
            }
        });

        Calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double area;
                if(radioButton1.isSelected()){
                    area = Circulo(Double.parseDouble(Radio.getText()));
                }else if(radioButton2.isSelected()){
                    area = Triangulo(Double.parseDouble(Base.getText()), Double.parseDouble(Altura.getText()));
                }else if(radioButton3.isSelected()){
                    area = Cuadrado(Double.parseDouble(Base.getText()));
                }else{
                    area = 0.0;
                }

                AreaTotal.setText(Double.toString(area));
            }
        });

        Limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                group.clearSelection();
                Radio.setText(null);
                Base.setText(null);
                Altura.setText(null);
                AreaTotal.setText(null);
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Calculadora de areas de figuras geométricas");
        frame.setContentPane(new CalcularForm().CalcularForm);
        frame.setSize(600,550);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
