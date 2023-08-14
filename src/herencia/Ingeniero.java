package herencia;

public class Ingeniero extends Profesion{
    private String nombreObra;

    public Ingeniero(String nombre, int sueldoBase, String nombreObra) {
        super(nombre, sueldoBase);
        this.nombreObra = nombreObra;
    }
}
