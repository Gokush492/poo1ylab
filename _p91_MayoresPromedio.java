import java.util.Scanner;

public class _p91_MayoresPromedio {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Scanner sc=new Scanner(System.in);
        int numCalificaciones = 0;
        System.out.print("Cuantas calificaciones desea capturar: "); numCalificaciones=sc.nextInt();
        float[] calificaciones = new float[numCalificaciones];
        IngresarCalificaciones(calificaciones);
        System.out.print("\nElementos del Arreglo: ");
        Mostrar(calificaciones);
        System.out.println();
        SumYPromCalificaciones(calificaciones);
    }

    public static void IngresarCalificaciones(float[] c){
        Scanner sc=new Scanner(System.in);
        float nCal = 0;

        for (int i = 0; i < c.length ; i++) {
            int ii= i+1;
            System.out.print("Dame la Calificacion " + ii + ": "); nCal=sc.nextFloat();
            c[i] = nCal ;
        }
    }

    public static void Mostrar(float[] c){
        for (int i = 0; i < c.length; i++) {
            System.out.printf(" %.2f",c[i]);
        }
    }

    public static void SumYPromCalificaciones(float[] c){
        float promSuma=0f;
        float promedio =0f;
        float numCalificaciones=0f;
        int cont=0;
        for (int i = 0; i < c.length; i++) {
            promSuma = promSuma + c[i];
            numCalificaciones = i+1;
        }
        System.out.printf("Suma del Arreglo: \t%.2f",promSuma);
        promedio = promSuma/numCalificaciones;
        System.out.printf("\nPromedio del Arreglo: \t%.2f",promedio);

        System.out.print("\nElementos del Arreglo Mayores al Promedio:   ");
        for (int i = 0; i < c.length; i++) {
            if(c[i] > promedio){
                System.out.printf(" %.2f",c[i]);
                cont++;
            }
        }
        System.out.println("\nLa cantidad de elementos Mayores al Promedio: "+cont);
    }
}
