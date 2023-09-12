import java.util.Scanner;

public class _p52_Numeros1aN {
    public static void main(String[] args) {
        int lim, sal;
        Scanner sc=new Scanner(System.in);

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("Numeros 1 a n con salto");
        System.out.print("Hasta que numero  : "); lim=sc.nextInt();
        System.out.print("Con que salto     : "); sal=sc.nextInt();

        for (int i = 1; i <= lim; i+=sal) {
            System.out.printf("%d ",i);
        }
        System.out.print("\nGracias por utilizar el programa!");
    }
}
