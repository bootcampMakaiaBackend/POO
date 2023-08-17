package abstracto;

public abstract class  Figura {

    private String tipo;

    public Figura(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public String rotar(){
        return "todos rotan igual";
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}
