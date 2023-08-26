import java.util.Scanner;

public class _p11_CalcularAngulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        double angulo1, angulo2, angulo3;

        Scanner sc=new Scanner(System.in);

        angulo1=angulo2=angulo3=0;
        System.out.println("°Dame la medida de los angulos del Triangulo°");
        System.out.println("Medida del angulo 1: "); angulo1=sc.nextDouble();
        System.out.println("Medida del angulo 2: "); angulo2=sc.nextDouble();
        angulo3 = 180 - (angulo1 + angulo2);

        System.out.println(String.format("La medida de el angulo faltante es: %.2f",angulo3));    
    }
}
