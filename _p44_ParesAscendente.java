import java.util.Scanner;

public class _p44_ParesAscendente {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        int n,c,s;
        char resp;
        Scanner sc = new Scanner(System.in);
       
        do {
            System.out.println("Imprime números pares ascendente\n");
            System.out.print("Hasta donde ? "); n = sc.nextInt();
            s=0;c=2;
            while( c<=n ) {
                System.out.printf("%d ",c);
                s = s + c;
                c = c+2;
            }
            System.out.printf("\nLa suma es %d",s);
            System.out.print("\nDeseas continuar (S/N) ? "); resp =
            Character.toUpperCase(sc.next().charAt(0));
        } while( resp != 'N' );
        System.out.println("\nGracias por utilizar este programa !");
    }
}