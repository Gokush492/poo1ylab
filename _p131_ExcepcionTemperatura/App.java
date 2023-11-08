package _p131_ExcepcionTemperatura;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static double conversorTemperatura(double centigrados) throws TemperturaExcesiva{
        if (centigrados > 100)
            throw new TemperturaExcesiva("Temperatura demasiado alta, no se puede convertir");
        return (centigrados * 9 / 5) + 32;
    }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        try {
            System.out.print("Dame una temperatura en centigrados: "); double centigrados = new Scanner(System.in).nextDouble();
            System.out.println(centigrados + " grados centigrados, equivale a "+ conversorTemperatura(centigrados) +" grados farenheit");
        } catch (InputMismatchException e) {
            System.out.println("La temperatura a convertir, debe ser un valor numérico");
        } catch (TemperturaExcesiva e) {
            System.out.println("Error: " + e);
        }
    }
}
