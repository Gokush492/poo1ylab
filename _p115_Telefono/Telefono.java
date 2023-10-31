package _p115_Telefono;

public class Telefono implements Gps,Radio,Conecta{
    public void obtenerCoordenadas(){
        System.out.println("Obteniendo coordenadas del satelite mas cercano...");
    }

    public void detenerRadio(){
        System.out.println("Deteniendo radio...");
    }

    public void iniciarRadio(){
        System.out.println("Iniciando radio...");
    }

    public void blutut(){
        System.out.println("Conectando Blutut...");
    }

    public void wifi() {
        System.out.println("Conectando Wi-Fi...");
    }
    
}
