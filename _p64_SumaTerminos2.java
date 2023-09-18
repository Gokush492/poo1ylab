import java.util.Scanner;

public class _p64_SumaTerminos2 {
    public static void main(String[] args) {
        int i,j,k,l,m,n,term,sum;
        char resp;
        Scanner sc=new Scanner(System.in);

        do{
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.print("Cuantos terminos: "); term=sc.nextInt();
            n =term;
            k=1;
            for(i=1; i<=term; i++){
                for(j=1; j<=i; j++){
                    System.out.print(k);
                }
                System.out.print(" + ");
            }
            System.out.println();
            System.out.print("Suma: ");
            for(l=1; l<=n; l++){
                System.out.print(l + " ");
            }
            System.out.println("\nDesea continuar (S/N) ?"); resp=Character.toUpperCase(sc.next().charAt(0));
        }while(resp != 'N');
        System.out.println("Gracias por utilizar el programa!");
    }
}
