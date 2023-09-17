import java.util.Scanner;

public class _p57_TablasMultiplicar {
    public static void main(String[] args) {
        int i, j, n, m;
        char resp;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.print("Hasta que tabla: "); n=sc.nextInt();
            System.out.print("Hasta donde: "); m=sc.nextInt();
            for(i=1; i<=n; i++){
                System.out.printf("\nTabla del %d\n",i);
                for(j=1; j<=m; j++){
                    System.out.printf("%d x %d = %d\n",i,j,i*j);
                }
            }
            System.out.print("\nDeseas continuar (S/N) ? ");resp=Character.toUpperCase(sc.next().charAt(0));
        }while (resp != 'N');
        System.out.println("Gracias por utilizar el programa!");
    }
}
