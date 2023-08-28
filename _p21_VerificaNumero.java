import java.util.Scanner;

public class _p21_VerificaNumero {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        
        int n;
        System.out.println("Verfica si un número es postivo, negativo o cero\n");
        System.out.print("Dame un numero ? ");
        n = new Scanner(System.in).nextInt();
        
        if( n>0 )
        System.out.println(String.format("%d es positivo",n));
        if( n<0 )
        System.out.println(String.format("%d es negativo",n));
        if( n==0 )
        System.out.println(String.format("%d es cero",n));
    }
}