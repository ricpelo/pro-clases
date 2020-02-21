/**
 * Cliente
 */
public class Cliente extends Persona {
    public long numero;
    
    Cliente() {
        super();
    }

    Cliente(String nom, int telf, long num) {
        super(nom, telf);
        numero = num;
    }

    public void set(long num) {
        numero = num;
    }

}