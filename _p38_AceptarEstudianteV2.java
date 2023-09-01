import java.util.Scanner;

public class _p38_AceptarEstudianteV2 {
    // °Diego de Jesús Alvarado Díaz°
    // Programa para aceptar estudiantes en una universidad, con parametros para ver si es apto o no de ingresar
    // 01/09/2023 Version 2
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        String nombre = "Fulano";
        String sexo = "Sexo";
        int edad = 0;
        float cal1, cal2, cal3, prom;

        Scanner sc=new Scanner(System.in);
        cal1=cal2=cal3=prom=0f;

        System.out.println("°°°Favor de ingresar los siguientes datos para ver si es aceptado en la Universidad Kitty Kat SA°°°");
        System.out.print("Nombre: "); nombre= sc.nextLine();
        System.out.print("Sexo (H/M) marcar con una letra: "); sexo=sc.nextLine();
        System.out.print("Edad: "); edad=sc.nextInt();
        System.out.println("Favor de proporcionar sus 3 calificaciones...");
        System.out.print("Calificacion 1: "); cal1=sc.nextFloat();
        System.out.print("Calificacion 2: "); cal2=sc.nextFloat();
        System.out.print("Calificacion 3: "); cal3=sc.nextFloat();

        switch (sexo.toUpperCase()) {
            case "H":
                System.out.print("\033[H\033[2J"); System.out.flush();

                prom = cal1 + cal2 + cal3;
                prom = prom / 3;

                System.out.println(String.format("El estudiante: %s\nDe edad: %d\nY promedio: %.2f\nNo Fue Aprovado\n",nombre,edad,prom));
                System.out.println("°°°La Universidad Kitty Kat SA solo admite estudiantes mujeres°°°");
                break;
        
            case "M":
                if (edad>21){
                    prom = cal1 + cal2 + cal3;
                    prom = prom / 3;
                    if (prom<8){
                        System.out.print("\033[H\033[2J"); System.out.flush();
                        System.out.println(String.format("La estudiante: %s\nDe edad: %d\nY promedio: %.2f\nNo Fue Aprovada\n",nombre,edad,prom));
                        System.out.println("°°°La Universidad Kitty Kat SA solo admite promedios entre 8 y 9.5°°°");
                    }
                    if (prom>9.5){
                        System.out.print("\033[H\033[2J"); System.out.flush();
                        System.out.println(String.format("La estudiante: %s\nDe edad: %d\nY promedio: %.2f\nNo Fue Aprovada\n",nombre,edad,prom));
                        System.out.println("°°°La Universidad Kitty Kat SA solo admite promedios entre 8 y 9.5°°°");
                    }
                    if (prom>=8 && prom<=9.5){
                        System.out.print("\033[H\033[2J"); System.out.flush();
                        System.out.println(String.format("La estudiante: %s\nDe edad: %d\nY promedio: %.2f\n¡¡¡Fue Aprovada!!!\n",nombre,edad,prom));
                        System.out.println("°°°Bienvenida a La Universidad Kitty Kat SA ahora formas parte de la familia°°°");
                    }

                }else{
                    System.out.print("\033[H\033[2J"); System.out.flush();
                    prom = cal1 + cal2 + cal3;
                    prom = prom / 3;
                    System.out.println(String.format("La estudiante: %s\nDe edad: %d\nY promedio: %.2f\nNo Fue Aprovada\n",nombre,edad,prom));
                    System.out.println("°°°La Universidad Kitty Kat SA solo admite estudiantes mayores a 21 años°°°");
                }
                break;

            default:
                System.out.print("\033[H\033[2J"); System.out.flush();
                System.out.println("Error: no aceptamos marcianos en esta universidad");
                break;
        }
    }
}
