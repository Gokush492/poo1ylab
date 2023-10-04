import java.util.Scanner;

public class _p92_MayorMenor {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Scanner sc=new Scanner(System.in);
        int cantNumeros=0;

        System.out.print("Cuantos numeros enteros desea capturar: "); cantNumeros=sc.nextInt();
        int[] regNumeros = new int[cantNumeros];
        RegistroNumeros(regNumeros);
        System.out.print("\nLos Elementos del Arreglo son :");
        Mostrar(regNumeros);
        System.out.println("\nEl numero Mayor del Arreglo es: "+ NumeroMayor(regNumeros));
        System.out.println("El numero Menor del Arreglo es: "+ NumeroMenor(regNumeros));
    }

    public static void RegistroNumeros(int[] n){
        Scanner sc=new Scanner(System.in);
        int num = 0;

        for (int i = 0; i < n.length ; i++) {
            int ii= i+1;
            System.out.print("Dame el " + ii + " numero entero: "); num=sc.nextInt();
            n[i] = num ;
        }
    }

    public static void Mostrar(int[] n){
        for (int i = 0; i < n.length; i++) {
            System.out.printf(" %d",n[i]);
        }
    }

    public static int NumeroMayor(int[] n){
        int numMayor=Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
            if(n[i] > numMayor)
                numMayor=n[i];
        }
        return numMayor;
    }

    public static int NumeroMenor(int[] n){
        int numMenor=Integer.MAX_VALUE;
        for (int i = 0; i < n.length; i++) {
            if(n[i] < numMenor)
                numMenor=n[i];
        }
        return numMenor;
    }
}
