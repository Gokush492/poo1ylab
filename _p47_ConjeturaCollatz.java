import java.util.Scanner;

public class _p47_ConjeturaCollatz {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        int n;
        char resp;
        Scanner sc=new Scanner(System.in);
        
        do {
            System.out.println("Imprime la conjetura de collatz para un número entero positivo\n");
            do {
                System.out.print("Dame un numero positivo ? ");
                n = sc.nextInt();
            } while( n < 0);
            do {
                System.out.printf("%d ",n);
                if( n%2 == 0)
                n = n / 2;
                else
                n = n * 3 + 1;
            } while(n != 1);
            System.out.printf("%d ", n);
            System.out.print("\nDeseas continuar (S/N) ? ");resp = Character.toUpperCase(sc.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
    }
}
