package _p118_Calculadora;

public class Calculadora implements Calcular {
    public void sumar(double x, double y) {
        double resultado = x + y;
        mostrarResultado(resultado);
    }

    public void restar(double x, double y) {
        double resultado = x - y;
        mostrarResultado(resultado);
    }

    public void multiplicar(double x, double y) {
        double resultado = x * y;
        mostrarResultado(resultado);
    }

    public void dividir(double x, double y) {
        double resultado = x / y;
        mostrarResultado(resultado);
    }

    public void mostrarResultado(double resultado) {
        System.out.println(String.format("%.2f", resultado));
    }
}
