//3.	Desarrolla un programa que solicite al usuario ingresar un número entero positivo. El programa debe verificar si el número ingresado es primo o no.
// Para ello, crea un método llamado 'esPrimo' que reciba como parámetro el número ingresado y devuelva un valor booleano indicando si es primo o no.
//  Dentro del método principal, utiliza un ciclo para verificar si el número es divisible únicamente por 1 y por sí mismo. Si el número es primo,
//   muestra un mensaje indicándolo; de lo contrario, muestra un mensaje indicando que no es primo.

package NumPrimo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class NumPrimoForm {
    private JPanel NumPrimoForm;
    private JButton Consultar;
    private JButton Salir;
    private JTextPane Num;
    private JLabel Respuesta;

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public NumPrimoForm() {

        Num.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        Consultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(Num.getText());
                boolean respuesta = esPrimo(num);
                if(respuesta){
                    Respuesta.setText("El número ingresado es primo");
                }else {
                    Respuesta.setText("El número ingresado no es primo");
                }
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
        frame.setContentPane(new NumPrimoForm().NumPrimoForm);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
