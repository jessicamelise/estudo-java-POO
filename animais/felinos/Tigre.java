package animais.felinos;

public class Tigre extends Felino{
    public Tigre( String nome) {
        super(nome, "tigre");
    }

    public String fazerBarulho() {
        return "Roar";
    }
}
