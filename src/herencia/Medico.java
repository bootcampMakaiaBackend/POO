package herencia;

public class Medico extends Profesion {

    private String nombreHospital;
    private String tarjetaProfesional;

    public Medico(String nombre, int sueldoBase,
                  String nombreHospital,
                  String  tarjetaProfesional){
        super(nombre, sueldoBase);
        this.nombreHospital = nombreHospital;
        this.tarjetaProfesional = tarjetaProfesional;
    }

    @Override
    public int calcularSueldo(){
       return getSueldoBase() * 10;
    }

}
