import java.util.Scanner;

public class _p55_SumaParesImpares {
    public static void main(String[] args) {
        
        int n, op, sum;
        Scanner sc=new Scanner(System.in);

        do{
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.println("Numeros pares de 2 a N y su Suma...   [1]");
            System.out.println("Numeros impares de 1 a N y su suma... [2]");
            System.out.println("Salir...                              [3]");
            System.out.print("Elija la opcion: "); op=sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Numeros Pares\nHasta que numero: "); n=sc.nextInt();
                    sum=0;
                    for (int i = 2; i <= n; i+=2) {
                        sum= sum+i;
                        System.out.printf("%d ",i);
                    }System.out.printf("\nLa suma es: %d",sum);
                    break;

                case 2:
                    System.out.print("Numeros Impares\nHasta que numero: "); n=sc.nextInt();
                    sum=0;
                    for (int i = 1; i <= n; i+=2) {
                        sum= sum+i;
                        System.out.printf("%d ",i);
                    }System.out.printf("\nLa suma es: %d",sum);
                    break;

                case 3:
                    System.out.println("\nTe vas por que quieres nadie te corre"); break;
                    
                default:
                    System.out.println("\nOpcion Invalida"); break;
            }
        System.out.println("\nPresiona <Enter> para continuar"); sc.nextLine();sc.nextLine();
        }while(op !=  3);
        System.out.println("\nProceso Terminado ....");
    }
}
