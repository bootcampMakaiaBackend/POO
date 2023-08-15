package interfaz;

public class Lobo implements Ladrador {

    private String nombre;

    public Lobo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String ladrar() {
        return "estoy ladrando desde el lobo";
    }

    @Override
    public String correr() {
        return "estoy corriendo desde el lobo";
    }

    public String comer(){
        return "comiendo";
    }
}
