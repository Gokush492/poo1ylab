package _p97_Empleado04;

public class Empleado {
    private String Nombre;
    private int Edad;
    private char Sexo;
    private boolean EstadoCivil;

    public Empleado(){};
    public Empleado(String nombre, int edad, char sexo, boolean estadoCivil){
        this.Nombre=nombre; this.Edad=edad;
        this.Sexo=sexo;     this.EstadoCivil=estadoCivil;
    }

    public String getNombre(){return Nombre;}
    public int getEdad(){return Edad;}
    public char getSexo(){return Sexo;}
    public boolean getEstadoCivil(){return EstadoCivil;}

    public String toString(){
        return String.format("Nombre: %s\t Edad: %d\t Sexo: %s Casado: %s", Nombre,Edad,(Sexo == 'M' ? "Mujer" : "Hombre"),(EstadoCivil ? "Casado" : "Soltero"));
    }
}
