import java.util.Scanner;

public class _p59_FactorialNumeros {
    public static void main(String[] args) {
        int i, j, f, n; 
        char resp;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.print("Cuantos números: "); n = sc.nextInt();
            for(i=1; i<=n; i++){
                System.out.printf("%d! = ",i);
                f=1;
                for(j=1; j<=i; j++){
                    f*=j;
                }
                System.out.println(f);
            }
            System.out.println("Desea continuar (S/N) ?"); resp=Character.toUpperCase(sc.next().charAt(0));
        }while (resp != 'N');
        System.out.println("Gracias por utilizar el programa!");
    }
}
