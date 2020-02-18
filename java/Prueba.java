public class Prueba {
    public static void main(String[] args) {
        Persona yo = new Persona("Ricardo", 956956956);
        Cliente juan = new Cliente("Juan", 666555444, 105);

        System.out.println(yo.nombre);
        System.out.println(yo.telefono);

        System.out.println(juan.nombre);
        System.out.println(juan.numero);

        // Contador c = new Contador(5);

        // System.out.println(c.getValor());
        // c.siguiente();
        // System.out.println(c.getValor());
        // System.out.println(c.siguiente());

        // Contador z = new Contador();

        // System.out.println(c.equals(z));
        // System.out.println(c == z);
        // // c.setValor(4);
        // // z.setValor(4);
        // System.out.println(c.getValor());
        // System.out.println(z.getValor());
        // System.out.println(c == z);
    }
}