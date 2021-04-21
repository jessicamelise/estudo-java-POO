import animais.felinos.*;

public class Iniciar {
    public static void main(String[] args) {
        try {
            Felino gato = new Gato("Lino");
            // Tigre tigre = new Tigre("Tigrinho");
            // // System.out.println(gato.toString());
            // System.out.println(gato);
            // System.out.println(tigre);
            gato.setDono("Jess");
            System.out.println(gato); 
            Gato brincar = (Gato)gato;
            brincar.brincar();
            // gato.removerDono();
            // System.out.println(gato);
        } catch (IllegalArgumentException e) {
            String mensagemErro = String.format("ocorreu um erro, parametro ilegal: %s", e.getMessage());
            System.out.println(mensagemErro);
        } catch (Exception e) {
            String mensagemErro = String.format("ocorreu um erro: %s", e.getMessage());
            System.out.println(mensagemErro);
        }

        try {
            
        } catch (IllegalArgumentException e) {
            String mensagemErro = String.format("ocorreu um erro, parametro ilegal: %s", e.getMessage());
            System.out.println(mensagemErro);
        } catch (Exception e) {
            String mensagemErro = String.format("ocorreu um erro: %s", e.getMessage());
            System.out.println(mensagemErro);
        }
    }
}