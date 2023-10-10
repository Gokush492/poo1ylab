package _p99_Rectangulo;

public class Rectangulo {
    private float Largo;
    private float Ancho;

    public Rectangulo(){};
    public Rectangulo(float largo, float ancho){
        this.Largo=largo;
        this.Ancho=ancho;
    }

    public float getLargo(){
        return Largo;
    }
    public void setLargo(float largo){
        Largo=largo;
    }

    public float getAncho(){
        return Ancho;
    }
    public void setAncho(float ancho){
        Ancho=ancho;
    }

    public float getArea(){
        return Largo*Ancho;
    }
    public float getPerimetro(){
        return (Largo+Ancho)*2;
    }

    public String toString(){
        return String.format("Rectangulo [Largo=%.1f, Ancho=%.1f]",Largo,Ancho);
    }
}
