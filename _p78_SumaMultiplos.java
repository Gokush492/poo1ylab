import java.util.Scanner;

public class _p78_SumaMultiplos {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Scanner sc=new Scanner(System.in);
        int ini, fin, rango;
        ini=fin=rango=0;

        System.out.print("Que multiplo desea usar [3] o [4]\nIdentificar con el numero: "); rango=sc.nextInt();

        if (rango==3){
            do{
                System.out.print("\033[H\033[2J");System.out.flush();
                System.out.println("Dame un rango de inicio a fin separado por un espacio:");
                ini=sc.nextInt(); fin=sc.nextInt();
            }while(ini>=fin);
        } else if (rango == 4){
            do{
                System.out.print("\033[H\033[2J");System.out.flush();
                System.out.println("Dame un rango de inicio a fin separado por un espacio:");
                ini=sc.nextInt(); fin=sc.nextInt();
            }while(ini>=fin);
        }
        Menu(ini, fin, rango);
    }

    public static int Multiplos(int ini, int fin, int mul){
        int suma=0;
        for (int i = 0; i <= fin; i= i+mul) {
            if (i>=ini)
                suma= suma + i;
        }
        return suma;
    }

    public static void Menu(int ini, int fin, int op){
        switch (op) {
            case 3:
                System.out.println("La suma es: " + Multiplos(ini, fin, op));
                break;
            case 4:
                System.out.println("La suma es: " + Multiplos(ini, fin, op));
                break;
            default:
                System.out.println("Opcion Invalida");
                break;
        }
    }
}
