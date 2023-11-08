import java.util.InputMismatchException;
import java.util.Scanner;

public class _p129_ExcepcionDulces {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        try {
            System.out.print("Numero de niños en el barrio: "); int poblacion=new Scanner(System.in).nextInt();
            System.out.print("Cantidad de dulces existente: "); int capital=new Scanner(System.in).nextInt();
            int dulceXniño = capital/poblacion;
            System.out.printf("A cada niño le tocan %d dulces.", dulceXniño);
        } catch (ArithmeticException e) {
            System.out.println("Si no hay niños, no puedo repartir dulces\n");
        }catch (InputMismatchException e) {
            System.out.println("Los niños y los dulces, deben ser cantidades numéricas\n");
        }
    }
}
