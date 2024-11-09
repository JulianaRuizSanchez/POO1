//5.	Desarrolla un programa que calcule e imprima la suma de los dígitos de un número entero ingresado por el usuario.
// Utiliza un ciclo while para iterar sobre los dígitos del número y sumarlos.

package Sumdigitos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SumaDigitosForm {
    private JPanel SumaDigitosForm;
    private JTextPane Num;
    private JButton Calcular;
    private JButton Salir;
    private JTextPane Suma;

    public SumaDigitosForm(){

        Num.addKeyListener(new KeyAdapter() {
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
                int num = Integer.parseInt(Num.getText());
                int suma = 0;

                while (num != 0){
                    int digito = num % 10;
                    suma += digito;
                    num /= 10;
                }

                Suma.setText(Integer.toString(suma));
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
        JFrame frame = new JFrame("Cambio divisas");
        frame.setContentPane(new SumaDigitosForm().SumaDigitosForm);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
