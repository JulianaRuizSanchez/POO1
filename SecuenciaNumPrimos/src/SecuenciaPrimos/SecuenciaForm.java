package SecuenciaPrimos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SecuenciaForm {

    private JPanel SecuenciaForm;
    private JTextPane Num;
    private JButton Consultar;
    private JButton Salir;
    private JLabel Respuesta;

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public SecuenciaForm(){

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

                String numeros = "";
                for (int i = 2; i <= num; i++) {
                    if (esPrimo(i)) {
                        numeros += (i + " ");
                    }
                }
                Respuesta.setText("Los números primos son: " + numeros);
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

        JFrame frame = new JFrame("Secuencia de números primos");
        frame.setContentPane(new SecuenciaForm().SecuenciaForm);
        frame.setSize(500, 250);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
