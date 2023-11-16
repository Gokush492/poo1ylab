import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class _p138_ArchivoMaterias {
    public static void leerDatos(ArrayList<String> materias){
        String materia="";
        System.out.println("Introduce una Materia presiona <Enter> campo vacio para terminar<--");
        while(true){
            materia = new Scanner(System.in).nextLine();
            if(!materia.isEmpty()) materias.add(materia);
            else break;
        }
    }

    public static void grabarArchivo(String doc, ArrayList<String> materias) throws IOException{
        BufferedWriter wMaterias=new BufferedWriter(new FileWriter(new File(doc)));
        for(String materia : materias)
            wMaterias.write(materia + "\n");
        wMaterias.close();
    }

    public static ArrayList<String> leerArchivo(String doc) throws IOException{
        ArrayList<String> materias = new ArrayList<>();
        BufferedReader rMaterias = new BufferedReader(new FileReader(new File(doc)));
        String materia;
        while((materia=rMaterias.readLine())!=null)
            materias.add(materia);
        rMaterias.close();
        return materias;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        String doc= "materias.txt";
        ArrayList<String> materias=new ArrayList<>(), lasMaterias=new ArrayList<>();
        leerDatos(materias);
        try{
            grabarArchivo(doc, materias);
            lasMaterias=leerArchivo(doc);
            lasMaterias.forEach(m -> System.out.println(m));
        } catch (Exception e){
            System.out.println("Error al procesar el Archivo: " + e);
        }
    }
}
