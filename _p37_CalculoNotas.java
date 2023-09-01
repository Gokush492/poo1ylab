import java.util.Scanner;

public class _p37_CalculoNotas {
    // °Diego de Jesús Alvarado Díaz°
    // Programa que sacara promedio a partir de 5 calificaciones, dependiendo el promedio imprimira el promedio con una leyenda
    // 01/09/2023 Version 1
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        float cal1, cal2, cal3, cal4, cal5, promedio;
        Scanner sc=new Scanner(System.in);

        cal1=cal2=cal3=cal4=cal5=promedio=0f;
        System.out.println("Voy a calcular tu promedio, a continacion proporcioname tus 5 calificaciones...");
        System.out.print("Calificación 1: "); cal1 = sc.nextFloat();
        System.out.print("Calificación 2: "); cal2 = sc.nextFloat();
        System.out.print("Calificación 3: "); cal3 = sc.nextFloat();
        System.out.print("Calificación 4: "); cal4 = sc.nextFloat();
        System.out.print("Calificación 5: "); cal5 = sc.nextFloat();
        promedio = cal1 + cal2 + cal3 + cal4 + cal5;
        promedio = promedio / 5;
        if (promedio>=0 && promedio<=6){
            System.out.println(String.format("\nTu promedio fue de: %.2f --> Quedas reprobado :c <--",promedio));
        }
        if (promedio>6 && promedio<=7){
            System.out.println(String.format("\nTu promedio fue de: %.2f --> Pasas de panzaso :P <--",promedio));
        }
        if (promedio>7 && promedio<=8){
            System.out.println(String.format("\nTu promedio fue de: %.2f --> Muy bien, puedes mejorar ;) <--",promedio));
        }
        if (promedio>8 && promedio<=9){
            System.out.println(String.format("\nTu promedio fue de: %.2f --> Excelente sigue asi ;D <--",promedio));
        }
        if (promedio>9 && promedio<=10){
            System.out.println(String.format("\nTu promedio fue de: %.2f --> ¡Perfecto!, tu esfuerzo valio la pena!!! ;3 <--",promedio));
        }
        if (promedio<0){
            System.out.println("Error: promedio invalido");
        }
        if (promedio>10){
            System.out.println("Error: promedio invalido");
        }
    }
}
