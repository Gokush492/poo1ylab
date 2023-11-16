package _p139_ArchivoEstudiante;
import java.io.Serializable;

public class Estudiante implements Serializable {
    String Nombre;
    int Edad;
    double Promedio;
    char Sexo;

    public Estudiante(String nombre, int edad, double promedio, char sexo){
        Nombre=nombre;      Edad=edad;
        Promedio=promedio;  Sexo=sexo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public double getPromedio() {
        return Promedio;
    }

    public void setPromedio(double promedio) {
        Promedio = promedio;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char sexo) {
        Sexo = sexo;
    }

    public String toString() {
        return "Estudiante [Nombre=" + Nombre + ", Edad=" + Edad + ", Promedio=" + Promedio + ", Sexo=" + Sexo + "]";
    }
}
