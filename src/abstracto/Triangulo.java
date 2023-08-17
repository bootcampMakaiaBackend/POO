package abstracto;

public class Triangulo extends Figura {
    public int base;
    public int altura;
    public int lado;

    public Triangulo(int base, int altura, int lado) {
        super("Triangulo");
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return base * altura / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }

    public String obtenerTipoTriguanlo(){
        rotar();
        return getTipo();
    }

}
