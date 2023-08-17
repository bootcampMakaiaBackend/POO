package abstracto;

public class Cuadrado extends Figura {

    private int lado;

    public Cuadrado(int lado){
        super("cuadrado");
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }
}
