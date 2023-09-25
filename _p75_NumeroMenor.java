import java.util.Scanner;

public class _p75_NumeroMenor {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        int num1, num2, num3, num4;
        Scanner sc= new Scanner(System.in);

        System.out.println("°°°Dame 4 numeros enteros, te dire cual es el menor°°°");
        System.out.print("Numeros separados por espacio: ");
        num1 = sc.nextInt(); num2 = sc.nextInt(); num3 = sc.nextInt(); num4 = sc.nextInt();

        System.out.println("\nEl numero menor es: " + NumMenor(num1, num2, num3, num4));
    }

    public static int NumMenor(int n1, int n2, int n3, int n4){
        int r = Integer.MAX_VALUE;
        if (n1 < r) r = n1;
        if (n2 < n1) r = n2;
        if (n3 < n2) r = n3;
        if (n4 < n3) r = n4;
        return r;
    }
}
