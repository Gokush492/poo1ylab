import java.util.Scanner;

public class _p85_NombresEdades {
    public static void main(String[] args) {
        int n = 0, s = 0, p = 0;
        Scanner sc=new Scanner(System.in);

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("\nCuantas personas deseas procesar:"); n = sc.nextInt();
        String[] nombres = new String[n];
        int[] edades = new int[n];

        System.out.printf("\nIntroduce el nombre y las edades de las %d personas",n);
        for(int i=0; i < n; i++){
            sc.nextLine();
            System.out.printf("\nDame el nombre %d: ",i+1); nombres[i] = sc.nextLine();
            System.out.printf("Dame la edad %d: ",i+1); edades[i] = sc.nextInt();
        }

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("\nLos nombres y las edades de las personas capturadas son:");
        System.out.printf("Nombre\tEdad\n");
        for(int i=0; i<n; i++){
            System.out.printf("%s\t%d\n",nombres[i],edades[i]);
            s = s + edades[i];
        }
        p = s / edades.length;
        System.out.printf("\nEl promedio de edades es: " + p);
    }
}
