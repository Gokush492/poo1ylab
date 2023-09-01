import java.util.Scanner;

public class _p35_ContinentesMundo {
    // °Diego de Jesús Alvarado Díaz°
    // Programa donde ingresaras 1 valor del 1 al 6 y te imprimira un continente dependiendo el numero, en caso de otro numero marcara un error
    // 31/08/2023 Version 1

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        int opc = 0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Dame un numero entre 1 y 6, te dare el continente al que corresponde el numero\nNumero: "); opc = sc.nextInt();

        switch (opc) {
            case 1:
                System.out.println("\n°°°El continente 1 es: Asia°°°");
                System.out.println("Gracias por utilizar el programa");
                break;

            case 2:
                System.out.println("\n°°°El continente 2 es: África°°°");
                System.out.println("Gracias por utilizar el programa");
                break;
            
            case 3:
                System.out.println("\n°°°El continente 3 es: América del Norte°°°");
                System.out.println("Gracias por utilizar el programa");
                break;

            case 4:
                System.out.println("\n°°°El continente 4 es: América del Sur°°°");
                System.out.println("Gracias por utilizar el programa");
                break;

            case 5:
                System.out.println("\n°°°El continente 5 es: Antártida°°°");
                System.out.println("Gracias por utilizar el programa");
                break;

            case 6:
                System.out.println("\n°°°El continente 6 es: Europa°°°");
                System.out.println("Gracias por utilizar el programa");
                break;

            default:
                System.out.println("Error: Numero Invalido");
                break;
        }
    }
}
