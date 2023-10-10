package _p98_Circulo;

public class Circulo {
    private double Radio;

    public Circulo(){};
    public Circulo(double radio){
        this.Radio=radio;
    }

    public double getRadio(){
        return Radio;
    }
    public void setRadio(double radio){
        Radio=radio;
    }

    public double getArea(){
        return (Radio*Radio)*Math.PI;
    }
    public double getCircunferencia(){
        return (Radio*2)*Math.PI;
    }

    public String toString(){
        return String.format("Circulo [Radio=%.2f]",Radio);
    }
}
