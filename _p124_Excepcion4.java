import java.util.InputMismatchException;
import java.util.Scanner;

public class _p124_Excepcion4 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        Scanner sc=new Scanner(System.in);
        try {
            System.out.print("Valor del numerador  : "); int a=sc.nextInt();
            System.out.print("Valor del denominador: "); int b=sc.nextInt();
            int c = a/b;
            System.out.println("El resultado es: " + c);
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println("Los valores deben ser númericos y el denominador diferente de 0");
            System.out.println("Mensaje del Sistema: " + e);
        }
    }
}
