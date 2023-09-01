import java.util.Scanner;

public class _p34_NumeroMayor {
    // °Diego de Jesús Alvarado Díaz°
    // Programa donde ingresaras 3 numeros enteros y te dira cual es el numero mayor
    // 31/08/2023 Version 1

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        Scanner sc=new Scanner(System.in);
        int num1, num2, num3;
        num1=num2=num3=0;

        System.out.println("De los 3 numeros enteros que me proporcionaras te dire cual es el mayor");
        System.out.println("Dame el primer numero entero: "); num1 = sc.nextInt();
        System.out.println("Dame el segundo numero entero: "); num2 = sc.nextInt();
        System.out.println("Dame el tercer numero entero: "); num3 = sc.nextInt();

        if (num1<num2 && num2<num3){
            System.out.println(String.format("\n°°°De los 3 numeros que me proporcionaste --> %d <-- es el mayor°°°",num3));
            System.out.println("Gracias por utilizar el programa");
        }
        if (num2<num3 && num3<num1){
            System.out.println(String.format("\n°°°De los 3 numeros que me proporcionaste --> %d <-- es el mayor°°°",num1));
            System.out.println("Gracias por utilizar el programa");
        }
        if (num3<num2 && num2<num1){
            System.out.println(String.format("\n°°°De los 3 numeros que me proporcionaste --> %d <-- es el mayor°°°",num1));
            System.out.println("Gracias por utilizar el programa");
        }
        if (num1<num3 && num3<num2){
            System.out.println(String.format("\n°°°De los 3 numeros que me proporcionaste --> %d <-- es el mayor°°°",num2));
            System.out.println("Gracias por utilizar el programa");
        }
        if (num2<num1 && num1<num3){
            System.out.println(String.format("\n°°°De los 3 numeros que me proporcionaste --> %d <-- es el mayor°°°",num3));
            System.out.println("Gracias por utilizar el programa");
        }
        if (num3<num1 && num1<num2){
            System.out.println(String.format("\n°°°De los 3 numeros que me proporcionaste --> %d <-- es el mayor°°°",num2));
            System.out.println("Gracias por utilizar el programa");
        }
    }
}
