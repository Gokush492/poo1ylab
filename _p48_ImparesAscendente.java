import java.util.Scanner;

public class _p48_ImparesAscendente {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        int lim,prom,sum,div,x;
        char opc;
        Scanner sc=new Scanner(System.in);

        do{
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.println("°°°Te imprimire los numeros impares de forma Ascendente°°°");
            System.out.print("- Hasta que numero quieres que imprima: "); lim = sc.nextInt();
            x=1;
            sum=div=0;
            while(x<=lim){
                System.out.printf("%d ",x);
                sum = sum+x;
                x = x+2;
                div++;    
            }
            prom = sum/div;
            System.out.println("\nLa suma es: " + sum);
            System.out.println("El promedio es: " + prom);
            
            System.out.print("\nDeseas continuar (S/N) ? "); opc = Character.toUpperCase(sc.next().charAt(0));
        }while(opc != 'N');
        System.out.println("Gracias por utilizar el programa");
    }
} 