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

    public static void main(String[] args) {
        EJ1<Integer, String> pareja = new EJ1<>(1, "hola");
        System.out.println(pareja.getPrimerDato());
        System.out.println(pareja.getSegundoDato());
    }
}

