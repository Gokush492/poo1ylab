import java.util.Scanner;

public class _p56_SumaPromedio {
    public static void main(String[] args) {
        int nCal, sum, n;
        float prom;
        char op;
        Scanner sc=new Scanner(System.in);

        do{
            System.out.print("\033[H\033[2J");System.out.flush();

            nCal=n=sum=0;
            prom=0f;
            System.out.println("A continuacion agregue las calificaciones\n- Cuando termine agregue un numero negativo a una calificacion para terminar el proceso");
            while(n>=0){
                nCal++;
                sum = sum + n;
                System.out.print("Deme la calificacion " + nCal + ": "); n=sc.nextInt();
            }
            nCal= nCal-1;
            prom= sum/nCal;
            System.out.printf("\nLa SUMA de las %d Calificaciones es de     : %d",nCal,sum);
            System.out.printf("\nEl PROMEDIO de las %d Calificaciones es de : %.2f",nCal,prom);

            System.out.println("\n\nDesea continua con el programa¿? (S/N) <---"); op=Character.toUpperCase(sc.next().charAt(0));
        }while(op != 'N');
        System.out.println("Gracias por utilizar el programa!");
    }
}
