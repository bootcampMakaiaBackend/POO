package interfaz;

public class Doberman implements Ladrador{
    private String nombre;

    public Doberman(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String ladrar() {
        return "Estoy ladrando desde un doberman";
    }

    @Override
    public String correr() {
        return "Estoy corriendo desde un doberman";
    }
}
