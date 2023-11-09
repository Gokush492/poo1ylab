package _p136_Archivos5;

import java.io.*;
import java.util.ArrayList;

public class App {
    public static void serializarDatos(String archivo, ArrayList<Persona> datos) throws IOException{
        FileOutputStream arch=new FileOutputStream(archivo);
        ObjectOutputStream fpersonas=new ObjectOutputStream(arch);
        fpersonas.writeObject(datos);
        fpersonas.close();
    }

    public static ArrayList<Persona> desSerializadorDatos(String archivo) throws IOException, ClassNotFoundException{
        ArrayList<Persona> datos;
        FileInputStream arch=new FileInputStream(archivo);
        ObjectInputStream fpersonas = new ObjectInputStream(arch);
        datos = (ArrayList<Persona>) fpersonas.readObject();
        fpersonas.close();
        return datos;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Checo Perez", 22, 85.5, "cPerez@gmail.com"));
        personas.add(new Persona("Maria Lopez", 15, 34.56, "mlopez@msn.com"));
        personas.add(new Persona("Maria Lopez", 15, 34.56, "mlopez@msn.com"));

        try {
            serializarDatos("datos.dat", personas);
        } catch (Exception e) {
            System.out.println("Problemas al procesar el archivo..." +  e);
        }

        try {
            ArrayList<Persona> laspersonas = desSerializadorDatos("datos.dat");
            System.out.println("Los datos leidos del archivo son: ");
            laspersonas.forEach(p->System.out.println(p));
            System.out.println(laspersonas.size());
        } catch (Exception e) {
            System.out.println("Problemas al procesar el archivo..." + e);
        }
    }
}
