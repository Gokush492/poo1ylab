import java.util.Scanner;

public class _p125_Excepcion5 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        int a[] = {10,20,30,40};
        try {
            System.out.print("Que posición del arreglo deseas acceder? : "); int pos=new Scanner(System.in).nextInt();
            System.out.println("La posición " + pos + ", contiene el valor de " + a[pos]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Estas tratando de acceder una posición del arreglo fuera de límite");
            System.out.println("Mensaje del sistema:" + e);
        } finally {
            System.out.print("Los elementos que tiene el arreglo son: ");
            for (int i : a) {
                System.out.print(i + " ");
            }
        }
    }
}
