import java.util.Scanner;

public class _p76_DiaSemana {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        DiaSemana(ValidarOpcion(0));
    }

    public static void DiaSemana(int opc){
        switch (opc) {
            case 1:
                System.out.print("\n-El dia 1 pertenece a °DOMINGO°\n");
                break;
            case 2:
                System.out.print("\n-El dia 2 pertenece a °LUNES°\n");
                break;
            case 3:
                System.out.print("\n-El dia 3 pertenece a °MARTES°\n");
                break;
            case 4:
                System.out.print("\n-El dia 4 pertenece a °MIERCOLES°\n");
                break;
            case 5:
                System.out.print("\n-El dia 5 pertenece a °JUEVES°\n");
                break;
            case 6:
                System.out.print("\n-El dia 6 pertenece a °VIERNES°\n");
                break;
            case 7:
                System.out.print("\n-El dia 7 pertenece a °SABADO°\n");
                break;
        }
    }

    public static int ValidarOpcion(int opc){
        Scanner sc= new Scanner(System.in);
        do{
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.print("Dame un numero entre 1 y 7: "); opc =  sc.nextInt();
            while(opc>7){
                System.out.print("\033[H\033[2J");System.out.flush();
                System.out.print("Dame un numero entre 1 y 7: "); opc =  sc.nextInt();  
            }
        }while (opc<1);
        return opc;
    }
}
