import java.util.Scanner;

public class _p128_ExcepcionRaiz {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        
        try {
            System.out.println("°°°Calculare la Raiz Cuadrada del numero que me aportes°°°");
            System.out.print("Introduce un número: "); double num = new Scanner(System.in).nextDouble();
            num = Math.sqrt(num);
            System.out.printf("El resultado es: %.2f", num);    
        } catch (Exception e) {
            System.out.println("Error no puedo calcular la raíz cuadrada\n");
        }
    }
}
