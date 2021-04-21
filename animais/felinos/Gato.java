package animais.felinos;

public class Gato extends Felino {

    public Gato( String nome) {
        super(nome, "gato");
    }

    public String fazerBarulho() {
        return "Miau";
    }

    public String brincar() {
        return "sim";
    }

}
