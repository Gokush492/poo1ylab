import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;


public class _p137_ArchivoMunicipios {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        String[] deportes ={"Fútbol", "Béisbol", "Ciclismo", "Atletismo", "Natación", "Motociclismo"};
        File doc=new File("deportes.txt");
        if (doc.exists()){
            System.out.println("El archivo ya existe<--");
        } else{
            try {
                BufferedWriter wDeportes=new BufferedWriter(new FileWriter(doc));
                for (String deporte : deportes)
                    wDeportes.write(deporte+"\n");
                wDeportes.close();
                System.out.println("Los datos se han escrito<--");
                BufferedReader rDeportes=new BufferedReader(new FileReader(doc));
                String linea;
                while ((linea=rDeportes.readLine())!=null)
                    System.out.println(linea);
                rDeportes.close();
            } catch (Exception e) {
                System.out.println("Problemas al procesar el Archivo...");
                System.out.println(e);
            }
        }
    }
}
