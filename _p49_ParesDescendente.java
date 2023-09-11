import java.util.Scanner;

public class _p49_ParesDescendente {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        int x,sum,prom,lim,div;
        char opc;
        Scanner sc=new Scanner(System.in);

        do{
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.println("°°°Te imprimire los numeros pares de forma Descendente partiendo de 100°°°");
            System.out.print("- Hasta que numero positivo quieres que termine: "); lim= sc.nextInt();
            x=100;
            div=sum=0;
            while(lim<=x){
                System.out.printf("%d ",x);
                sum = sum+x;
                x = x-2;
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
