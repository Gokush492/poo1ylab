import java.util.InputMismatchException;
import java.util.Scanner;

public class _p130_ExcepcionEdades {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Scanner sc=new Scanner(System.in);
        int[] personas = new int[5];

        try {
            int cont=0;

            System.out.println("Captura las edades de 5 perosnas:");
            for (int i = 0; i < personas.length; i++) {
                cont++;
                System.out.printf("Edad persona %d: ", cont); int edad=sc.nextInt();
                personas[i] = edad;
            }
            System.out.println("Captura terminada las edades son...");
            for (int i = 0; i < personas.length; i++)
                System.out.print(personas[i] + " ");
        } catch (InputMismatchException e) {
            System.out.println("Introduce un número entero");
        }
    }
}
