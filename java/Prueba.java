public class Prueba {
    public static void main(String[] args) {
        Persona yo = new Persona("Ricardo", 956956956);
        Persona p = new Persona("María");
        Persona q = new Persona();
        Cliente juan = new Cliente("Juan", 666555444, 105);

        yo.set("Manolo", 111111);
        juan.set(555555);
        juan.set(25L);

        System.out.println(yo.getNombre());
        System.out.println(yo.getTelefono());

        System.out.println(juan.getNombre());
        System.out.println(juan.getTelefono());
    }
}