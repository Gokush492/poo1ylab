import java.util.Scanner;

public class _p14_CalculoTiempo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        int dias,horas, minutos, segundos;
        Scanner sc=new Scanner(System.in);

        dias=horas=minutos=segundos=0;
        System.out.println("°Favor de proporcionar una cantidad en horas°"); horas=sc.nextInt();

        dias= (horas/24);
        minutos= horas*60;
        segundos= horas*60*60;
        System.out.println(String.format("%d Horas es equivalente a %d Dias",horas,dias));
        System.out.println(String.format("%d Horas es equivalente a %d Minutos",horas,minutos));
        System.out.println(String.format("%d Horas es equivalente a %d Segundos",horas,segundos));
    }
}
