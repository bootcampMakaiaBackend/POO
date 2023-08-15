package interfaz;

public class Main {

    public static void main(String[] args) {
        Ladrador lobo =  new Lobo("Lobo");
        Ladrador doberman = new Doberman("Doberman");
        System.out.println(lobo.correr());
        System.out.println(doberman.correr());

    }
}
