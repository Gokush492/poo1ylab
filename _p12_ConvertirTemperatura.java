import java.util.Scanner;

public class _p12_ConvertirTemperatura {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        float celsius, fahrenheit, num1, num2, div;
        Scanner sc=new Scanner(System.in);

        celsius=fahrenheit=num1=num2=div=0f;
        System.out.println("*Cual es la medida en °Fahrenheit que desea convertir a °Celcius*");
        System.out.println("Medida en °Fahrenheit: "); fahrenheit=sc.nextFloat();

        num1 = 5f;
        num2 = 9f;
        div = (num1 / num2);
        celsius=(fahrenheit - 32) * (div);

        System.out.println(String.format("Los %f °Fahrenheit son %f °Celcius",fahrenheit,celsius));
    }
}
