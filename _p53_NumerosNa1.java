import java.util.Scanner;

public class _p53_NumerosNa1 {
    public static void main(String[] args) {
        int lim, sal;
        Scanner sc=new Scanner(System.in);

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("Numero n a 1 con Salto");
        System.out.print("En que numero quieres que empiece: "); lim=sc.nextInt();
        System.out.print("Con que salto: "); sal=sc.nextInt();

        for (int i = 1; i <= lim ; lim-=sal) {
            System.out.printf("%d ",lim);
        }
        System.out.println("\nGracias por utilizar el programa!");
    }
}
