package abstracto;

public class Main {

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(2,2,1);
        Figura cuadrado = new Cuadrado(2);
        triangulo.calcularArea();
        triangulo.obtenerTipoTriguanlo();
        cuadrado.calcularArea();
    }
}
