import java.util.Scanner;

public class _p51_SerieFibonacci {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        int n1,n2,n3,nF,lim;
        char opc;
        Scanner sc=new Scanner(System.in);

        do{
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.println("°°°Voy a imprimir la serie Fibonacci°°°");
            System.out.print("Hasta que numero quieres que acabe la serie: "); lim=sc.nextInt();
            nF= 0;
            n1=1;
            n2=0;

            System.out.println("\nLa sucesion Fibonacci es: ");
            while(nF<=lim){
                System.out.print(nF + " ");
                n2 = nF + n1;
                nF = n1;
                n1 = n2;
            }

            System.out.print("\nDeseas continuar (S/N) ? "); opc = Character.toUpperCase(sc.next().charAt(0));
        }while(opc != 'N');
        System.out.println("\nGracias por utilizar el programa");
    }
}
