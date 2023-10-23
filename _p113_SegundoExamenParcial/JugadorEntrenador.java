package _p113_SegundoExamenParcial;

public class JugadorEntrenador extends Jugador {
    private int Subordinados;
    private int Proyectos;

    public JugadorEntrenador(String nombre, char sexo, String descripcion, double salario, int subordinados, int proyectos){
        super(nombre, sexo, descripcion, salario);
        Subordinados=subordinados;  Proyectos=proyectos;
        Total=Salario+this.getBono();
    }

    public double getBono(){
        return (Salario*0.15) + (Proyectos*100) + (Subordinados*10);
    }

    public String toString(){
        //- JugadorEntrenador [Jugador [Nombre=Francisco Zapeda, Sexo=H, Descripcion=Entrenador Principal, Salario=1000.0],Subordinados=8, Proyectos=1, Bono=330.0, Total=1330.0]
        return "JugadorEntrenador [" + super.toString() + ", Subordinados=" + Subordinados + ", Proyectos=" + Proyectos + ", Bono=" + this.getBono() + ", Total=" + Total + "]";
    }
}
