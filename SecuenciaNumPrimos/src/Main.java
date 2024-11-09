//4.	Escribe un programa que solicite al usuario ingresar un número entero positivo.
// El programa deberá imprimir la secuencia de números primos hasta el número ingresado por el usuario,
// utilizando un ciclo for y un método que determine si un número es primo o no.

import java.util.Scanner;

public class Main {

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

    public static void main(String[] args) {

        System.out.println("Ingrese un número entero positivo");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println("Los número primos son: ");

        for (int i = 2; i <= num; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}