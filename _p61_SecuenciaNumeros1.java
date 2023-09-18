import java.util.Scanner;

public class _p61_SecuenciaNumeros1 {
    public static void main (String[] args){
        int opc, i, j;
        char resp;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.print("Cuantos renglones: "); opc=sc.nextInt();
            for(i=1; i<=opc; i++){
                for(j=1; j<=i; j++){
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            System.out.println("Desea continuar (S/N) ?"); resp=Character.toUpperCase(sc.next().charAt(0));
        }while(resp != 'N');
        System.out.println("Gracias por utilizar el programa!");
    }
}
