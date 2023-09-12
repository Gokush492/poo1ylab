import java.util.Scanner;

public class _p54_ArribaAbajo {
    public static void main(String[] args) {
        
        int n, op;
        Scanner sc=new Scanner(System.in);

        do{
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.println("Numeros de 1 a N... [1]");
            System.out.println("Numeros de N a 1... [2]");
            System.out.println("Salir...            [3]");
            System.out.print("Elija la opcion: "); op=sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Hasta que numero: "); n=sc.nextInt();
                    for (int i = 1; i <= n; i++) {
                        System.out.printf("%d ",i);
                    }
                    break;

                case 2:
                    System.out.print("Desde que numero: "); n=sc.nextInt();
                    for (int i = n; i >= 1; i--) {
                        System.out.printf("%d ",i);
                    }
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
