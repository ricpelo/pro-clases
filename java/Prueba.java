public class Prueba {
    public static void main(String[] args) {
        Persona yo = new Persona("Ricardo", 956956956);
        String cadena = yo.toString();

        System.out.println(cadena);
    }

    public static void imprimeNombre(Persona p) {
        System.out.println(p.getNombre());
    }

    public static void imprimeNombre(Cliente c) {
        System.out.println(c.getNombre());
        System.out.println(c.getNombre());
    }
}