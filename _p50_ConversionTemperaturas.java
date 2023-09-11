import java.util.Scanner;

public class _p50_ConversionTemperaturas {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        int tIni, tFin, c;
        char opc;
        float convF,div;
        Scanner sc=new Scanner(System.in);

        do{
            System.out.println("°°°Imprimire un tabla de conversion de °C a °F °°°");
            do{
                System.out.print("\033[H\033[2J");System.out.flush();
                System.out.print("- Dame la temperatura inicial: "); tIni= sc.nextInt();
                System.out.print("- Dame la temperatura final: "); tFin= sc.nextInt();
            }while(tFin<tIni);

            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.println("--------------");
            System.out.println("°C\t°F");
            System.out.println("--------------");
            c=tIni;
            while(c<=tFin){
                convF = 0f;
                div= 1.8f;
                convF = (c * div) + 32;
                System.out.println(String.format("%d\t%.1f",c,convF));
                c++;
            }
            System.out.println("--------------");
            System.out.print("\nDeseas continuar (S/N) ? "); opc = Character.toUpperCase(sc.next().charAt(0));
        }while(opc != 'N');
        System.out.println("\nGracias por utilizar el programa");
    }
}
