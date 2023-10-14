package _p105_PuntoTriangulo;

public class Triangulo {
    private Punto V1, V2, V3;   

    public Triangulo(){};
    public Triangulo(Punto v1, Punto v2, Punto v3){
    V1=v1;  V2=v2;  V3=v3;
    }

    public Punto getV1(){
        return V1;
    }
    public void setV1(Punto v1){
        V1=v1;
    }

    public Punto getV2(){
        return V2;
    }
    public void setV2(Punto v2){
        V2=v2;
    }

    public Punto getV3(){
        return V3;
    }
    public void setV3(Punto v3){
        V3=v3;
    }

    public double getPerimetro(){
        double d1= V1.getDistancia(V2);
        double d2= V2.getDistancia(V3);
        double d3= V3.getDistancia(V1);
        return d1 + d2 + d3;
    }
    public String getTipo(){
        String tipo="Escaleno";
        if(V1.getDistancia(V2)==V2.getDistancia(V3) && V2.getDistancia(V3)==V3.getDistancia(V1))
            tipo= "Equilatero";
        else if (V1.getDistancia(V2)==V2.getDistancia(V3) || V1.getDistancia(V2)==V3.getDistancia(V1) || V3.getDistancia(V1)==V2.getDistancia(V3))
            tipo= "Isoseles";
        return tipo;
    }

    public String toString(){
        return "Triangulo [V1=" + V1 + ", V2=" + V2 + ", V3=" + V3 + "]";
    }
}



