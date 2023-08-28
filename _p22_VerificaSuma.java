import java.util.Scanner;

public class _p22_VerificaSuma {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        int num1, num2, num3;
        Scanner obj = new Scanner(System.in);

        System.out.println("Verificar si la suma de dos numeros es igual a un tercero\n");
        System.out.print("Dame el primer numero ? "); num1 = obj.nextInt();
        System.out.print("Dame el seguno numero ? "); num2 = obj.nextInt();
        System.out.print("Dame el tercer numero ? "); num3 = obj.nextInt();
        
        if( num1+num2 == num3 ){
            System.out.println("\nSon iguales");
        }
        else{
            System.out.println("\nSon diferentes");
        }
        System.out.println("\nGracias por utilizar este programa\nAhi los vidrios");
    }
}
