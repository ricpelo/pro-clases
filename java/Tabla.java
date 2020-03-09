import java.util.Scanner;

/**
 * Tabla
 */
public class Tabla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int numero;
        int i;

        System.out.print("Tabla a mostrar: ");
        numero = scanner.nextInt();

        if (numero >= 0 && numero <= 10) {
            for (i = 0; i <= 10; i++) {
                System.out.print(numero);
                System.out.print(" x ");
                System.out.print(i);
                System.out.print(" = ");
                System.out.println(numero * i);
            }
        } else {
            System.err.println("El número debe estar comprendido entre 0 y 10.");
        }
    }
}