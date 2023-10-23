package _p113_SegundoExamenParcial;
import java.util.ArrayList;

public class Equipo {
    private String Nombre;
    private String Liga;
    private ArrayList<Jugador> Jugadores;

    public Equipo(){
        Jugadores =new ArrayList<>();
    }
    public Equipo(String nombre, String liga){
        this();
        Nombre=nombre;  Liga=liga;
    }

    public ArrayList<Jugador> getJugador(){
        return Jugadores;
    }

    public void agregarJugador(Jugador jugador){
        Jugadores.add(jugador);
    }

    public double getTotalBono(){
        double bono=0;
        for( Jugador jugador : Jugadores){
            bono+= jugador.getBono();
        }
        return bono;
    }

    public double getTotal(){
        double total=0;
        for(Jugador jugador : Jugadores){
            total+= jugador.Total;
        }
        return total;
    }

    public int getTH(){
        int cont=0;
        for(Jugador jugador : Jugadores){
            if(jugador.Sexo == 'H'){
                cont++;
            }
        }
        return cont;
    }
    public int getTM(){
        int cont=0;
        for(Jugador jugador : Jugadores){
            if(jugador.Sexo == 'M'){
                cont++;
            }
        }
        return cont;
    }

    public void reporte(){
        for(Jugador jugador : Jugadores){
            System.out.println("> " + jugador);
        }
    }

    public String toString(){
        return "°°°Equipo [Nombre=" + Nombre + ", Liga=" + Liga + ", Jugadores=" + Jugadores.size() + ", Bono=" + this.getTotalBono() + ", Total=" + this.getTotal() + ", Hombres=" + this.getTH() + ", Mujeres=" + this.getTM() + "]";
    }
}
