import java.util.Scanner;

public class _p84_LeerArregloCalificaciones {
    public static void main(String[] args){
        int n = 0;
        float suma = 0f, promedio =0f;
        Scanner sc=new Scanner(System.in);

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("\nCuantas calificaciones decea procesar: ");
        n = sc.nextInt();

        float[] califs = new float[n];
        System.out.printf("Introduce las %d calificaciones \n",n);
        for(int i=0; i < califs.length; i++){
            System.out.printf("Calificaciones %d: ", i+1);
            califs[i] = sc.nextFloat();
        }

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("\nLas calificaciones capturadas son:");
        for(float cal : califs){
            System.out.printf("%.2f ",cal);
            suma = suma + cal;
        }

        promedio= suma/califs.length;
        System.out.println();
        System.out.printf("\nLa suma es %.2f", suma);
        System.out.println();
        System.out.printf("\nEl promedio es %.2f", promedio);
        System.out.println();
    }
}
