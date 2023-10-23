package _p113_SegundoExamenParcial;

public class JugadorActivo extends Jugador {
    private int Partidos;
    private int Goles;

    public JugadorActivo(String nombre, char sexo, String descripcion, double salario, int partidas, int goles){
        super(nombre, sexo, descripcion, salario);
        Partidos=partidas;  Goles=goles;
        Total=Salario+this.getBono();
    }

    public double getBono(){
        return (Salario*0.10) + (Partidos*50) + (Goles*5);
    }

    public String toString(){
        return "JugadorActivo [" + super.toString() + ", Partidos=" + Partidos + ", Goles=" + Goles + ", Bono=" + this.getBono() + ", Total=" + Total + "]";
    }
}
