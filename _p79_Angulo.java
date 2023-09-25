import java.util.Scanner;

public class _p79_Angulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Scanner sc=new Scanner(System.in);
        int angulo;
        System.out.print("Dame un angulo entre 0 y 360 y te dire el nombre del angulo al que pertenece\nAngulo: "); angulo=sc.nextInt();
        if(angulo>=0 && angulo<=360){
            Angulo(angulo);
        }else{
            System.out.println("Angulo Invalido");
        }
    }

    public static void Angulo(int angulo){
        if(angulo>=0 && angulo<=89){
            System.out.println(angulo + " es un angulo Agudo");
        } else if (angulo==90){
            System.out.println(angulo + " es un angulo Recto");
        }else if(angulo>=91 && angulo<=179){
            System.out.println(angulo + " es un angulo Obtuso");
        }else if(angulo == 180){
            System.out.println(angulo + " es un angulo Llano");
        }else if(angulo>=181 && angulo<=360){
            System.out.println(angulo + " es un angulo Concavo");
        }
    }
}
