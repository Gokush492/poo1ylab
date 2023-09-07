import java.util.Scanner;

public class _p46_TablaConversion {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        int ini, fin, c;
        float tc = 19.99f;
        char resp;
        Scanner sc=new Scanner(System.in);

        do {
            System.out.println("Imprime una tabla de conversion de peso a dolar\n");
            do {
                System.out.print("Inicio : "); ini = sc.nextInt();
                System.out.print("Fin : "); fin = sc.nextInt();
            } while( fin < ini );
            c=ini;
            System.out.println("Peso\tDolar");
            while( c<=fin ) {
                System.out.printf("%d\t%.2f\n",c,c/tc);
                c++;
            }
            System.out.print("\nDeseas continuar (S/N) ? ");resp = Character.toUpperCase(sc.next().charAt(0));
        } while( resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
    }
}
