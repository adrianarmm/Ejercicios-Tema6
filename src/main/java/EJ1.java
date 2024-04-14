public class EJ1 <T, U> {

    private T primerDato;
    private U segundoDato;

    public EJ1(T primerDato, U segundoDato) {
        this.primerDato = primerDato;
        this.segundoDato = segundoDato;
    }

    public T getPrimerDato() {
        return primerDato;
    }

    public U getSegundoDato() {
        return segundoDato;
    }
}
