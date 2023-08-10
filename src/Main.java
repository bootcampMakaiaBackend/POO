public class Main {
    public static void main(String[] args) {
        Persona  personaJuan = new Persona("juan", 17, "cc123");
        //objeto mateo
        Persona  personaMateo = new Persona("Mateo", 6, "CC6767");
        //
        Persona luis = new Persona("Luis");
        luis.getNombre();
        luis.imprimirInformacion();

        personaMateo.imprimirInformacion();
        personaMateo.setNombre("MATEO");
        personaMateo.imprimirInformacion();
    }
}