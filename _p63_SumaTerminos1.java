import java.util.Scanner;

public class _p63_SumaTerminos1 {
    public static void main (String[] args){
        int i,j,ter;
        float div,res,sum;
        char resp;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.print("Cuantos terminos: "); ter=sc.nextInt();
            div=sum=0f;
            for (i=1; i<=ter; i++) {
                div++;
                res=0f;
                for(j=1; j<=1; j++){
                    System.out.printf("1/%d + ",i);    
                }
                res = 1/div;
                sum += res;
            }
            System.out.printf("\nSuma: %f",sum);
            System.out.println("\nDesea continuar (S/N) ?"); resp=Character.toUpperCase(sc.next().charAt(0));
        }while (resp != 'N');
        System.out.println("Gracias por utilizar el programa!");
    }
}
