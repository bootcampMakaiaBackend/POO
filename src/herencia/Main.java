package herencia;

public class Main {

    public static void main(String[] args) {
        //DE DONDE ESTOY HEREDANDO - NOMBRE VARIABLE  = NEW HIJO()
        Profesion medico = new Medico("medico",
                20000,
                "Santa margarita",
                "1231");
        int sueldo = medico.calcularSueldo();
        int pension = medico.calcularPensionMensual();

        Profesion ingeniero = new Ingeniero("Ingeniero", 1000, "guacimalitio");
        int sueldoIngeniero = ingeniero.calcularSueldo();
        int pensionIngeniero = ingeniero.calcularPensionMensual();

    }
}
