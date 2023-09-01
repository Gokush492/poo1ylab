import java.util.Scanner;

public class _p33_NumerosConsecutivos {
    // °Diego de Jesús Alvarado Díaz°
    // Programa donde ingresaras 3 numeros enteros y te dira si son consecutivos o no
    // 31/08/2023 Version 1
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        
        Scanner sc=new Scanner(System.in);
        int num1, num2, num3, np2, np3;
        num1=num2=num3=np2=np3=0;

        System.out.println("Investigare si los 3 numeros que me proporcionaras son consecutivos");
        System.out.println("Dame el primer numero entero: "); num1 = sc.nextInt();
        System.out.println("Dame el segundo numero entero: "); num2 = sc.nextInt();
        System.out.println("Dame el tercer numero entero: "); num3 = sc.nextInt();

        //n1 n2 n3
        if (num1<num2 && num2<num3){
            //1 2 3
            np2 = num1 + 1;
            np3 = num1 + 2;
            if (num2==np2 && num3==np3){
                System.out.println(String.format("\n°°°Los numeros %d, %d, %d son consecutivos :)°°°", num1,num2,num3));
                System.out.println("Gracias por utilizar el programa");
            }else{
                System.out.println(String.format("\n°°°Los numeros %d, %d, %d no son consecutivos :(°°°", num1,num2,num3));
                System.out.println("Gracias por utilizar el programa");
            }
        }
        if (num2<num3 && num3<num1){
            //2 3 1
            np2 = num2 + 1;
            np3 = num2 + 2;
            if (num3==np2 && num1==np3){
                System.out.println(String.format("\n°°°Los numeros %d, %d, %d son consecutivos :)°°°", num2,num3,num1));
                System.out.println("Gracias por utilizar el programa");
            }else{
                System.out.println(String.format("\n°°°Los numeros %d, %d, %d no son consecutivos :(°°°", num2,num3,num1));
                System.out.println("Gracias por utilizar el programa");
            }
        }
        if (num3<num2 && num2<num1){
            //3 2 1
            np2 = num3 + 1;
            np3 = num3 + 2;
            if (num2==np2 && num1==np3){
                System.out.println(String.format("\n°°°Los numeros %d, %d, %d son consecutivos :)°°°", num3,num2,num1));
                System.out.println("Gracias por utilizar el programa");
            }else{
                System.out.println(String.format("\n°°°Los numeros %d, %d, %d no son consecutivos :(°°°", num3,num2,num1));
                System.out.println("Gracias por utilizar el programa");
            }
        }
        if (num1<num3 && num3<num2){
            //1 3 2
            np2 = num1 + 1;
            np3 = num1 + 2;
            if (num3==np2 && num2==np3){
                System.out.println(String.format("\n°°°Los numeros %d, %d, %d son consecutivos :)°°°", num1,num3,num2));
                System.out.println("Gracias por utilizar el programa");
            }else{
                System.out.println(String.format("\n°°°Los numeros %d, %d, %d no son consecutivos :(°°°", num1,num3,num2));
                System.out.println("Gracias por utilizar el programa");
            }
        }
        if (num2<num1 && num1<num3){
            //2 1 3
            np2 = num2 + 1;
            np3 = num2 + 2;
            if (num1==np2 && num3==np3){
                System.out.println(String.format("\n°°°Los numeros %d, %d, %d son consecutivos :)°°°", num2,num1,num3));
                System.out.println("Gracias por utilizar el programa");
            }else{
                System.out.println(String.format("\n°°°Los numeros %d, %d, %d no son consecutivos :(°°°", num2,num1,num3));
                System.out.println("Gracias por utilizar el programa");
            }
        }
        if (num3<num1 && num1<num2){
            //3 1 2
            np2 = num3 + 1;
            np3 = num3 + 2;
            if (num1==np2 && num2==np3){
                System.out.println(String.format("\n°°°Los numeros %d, %d, %d son consecutivos :)°°°", num3,num1,num2));
                System.out.println("Gracias por utilizar el programa");
            }else{
                System.out.println(String.format("\n°°°Los numeros %d, %d, %d no son consecutivos :(°°°", num3,num1,num2));
                System.out.println("Gracias por utilizar el programa");
            }
        }
    }
}
