package _p139_ArchivoEstudiante;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class App {

    public static void serializarDatos(String archivo, ArrayList<Estudiante> datos) throws IOException{
        FileOutputStream arch=new FileOutputStream(archivo);
        ObjectOutputStream festudiantes = new ObjectOutputStream(arch);
        festudiantes.writeObject(datos);
        festudiantes.close();
    }
    public static ArrayList<Estudiante> desSerializarDatos(String archivo) throws IOException, ClassNotFoundException{
        ArrayList<Estudiante> datos;
        FileInputStream arch=new FileInputStream(archivo);
        ObjectInputStream festudiantes = new ObjectInputStream(arch);
        datos= (ArrayList<Estudiante>) festudiantes.readObject();
        festudiantes.close();
        return datos;   
    }
    public static double getPromedioCalificacion(ArrayList<Estudiante> estudiantes){
        double suma=0;
        double div=0;
        for (Estudiante estudiante : estudiantes) {
            div++;
            suma+= estudiante.getPromedio();
        }
        return suma/div;
    }
    public static int getPromedioEdad(ArrayList<Estudiante> estudiantes){
        int suma=0;
        int div=0;
        for (Estudiante estudiante : estudiantes) {
            div++;
            suma+= estudiante.getEdad();
        }
        return suma/div;
    }
    public static int getCantHombres(ArrayList<Estudiante> estudiantes){
        int cont=0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getSexo()=='H') {
                cont++;
            }
        }
        return cont;
    }
    public static int getCantMujeres(ArrayList<Estudiante> estudiantes){
        int cont=0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getSexo()=='M') {
                cont++;
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        Scanner sc=new Scanner(System.in);
        String nombre="";
        int edad=0;
        double promedio=0;
        char sexo='N';

        int cont=0;
        char resp;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        do {
            cont++;
            System.out.print("\n°°°Proporcioname la informacion del Alumno (" + cont + ")°°°\n");
            System.out.print("Nombre: "); nombre=sc.next();
            System.out.print("Edad: "); edad=sc.nextInt();
            System.out.print("Promedio: "); promedio=sc.nextDouble();
            System.out.print("Sexo (H/M): "); sexo=Character.toUpperCase(sc.next().charAt(0));
            estudiantes.add(new Estudiante(nombre, edad, promedio, sexo));
            System.out.print("Deseas agregar otro Alumno (S/N) ? ");resp = Character.toUpperCase(sc.next().charAt(0));
        } while (resp != 'N');

        try {
            serializarDatos("estudiantes.txt", estudiantes);
        } catch (Exception e) {
            System.out.println("Problemas al procesar el Archivo: " + e);
        }
        try {
            ArrayList<Estudiante> losestudiantes= desSerializarDatos("estudiantes.txt");
            System.out.println("\nLos Estudiantes son:");
            losestudiantes.forEach(p->System.out.println(p));
        } catch (Exception e) {
            System.out.println("Problemas al procesar los archivos: " + e);
        }
        System.out.println();
        System.out.println("Promedio general Calificacion: " + getPromedioCalificacion(estudiantes));
        System.out.println("Promedio general Edad: " + getPromedioEdad(estudiantes));
        System.out.println("Cantidad de Hombres: " + getCantHombres(estudiantes));
        System.out.println("Cantidad de Mujeres: " + getCantMujeres(estudiantes));
    }
}
