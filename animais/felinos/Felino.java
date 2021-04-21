package animais.felinos;

public abstract class Felino {
    String familia = "felino";
    String especie = "";
    String nome = "";
    String dono = "";
    Boolean temDono = false;
    
    public Felino( String nome, String especie) {
        if (nome == null || nome == "") {
            throw new IllegalArgumentException("nome");
        } else {
            this.nome = nome;
        }
        this.especie = especie;
    }

    public abstract String fazerBarulho();

    public String getEspecie() {
        return this.especie;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDono() {
        return !this.temDono ? "sem dono" : this.dono;
        // return this.dono;
    }

    public void setDono(String dono) {
        if (dono == null || dono == "") {
            throw new IllegalArgumentException("dono");
        } else {
            this.dono = dono;
            this.temDono = true;
        }
    }

    public void removerDono() {
        this.dono = "";
        this.temDono = false;
    }

    @Override
    public String toString() {
        return String.format("O %s %s do(a) %s faz %s e é da familia %s \n %s", this.getEspecie(), this.getNome(), this.getDono(), this.fazerBarulho(), this.familia, super.toString());
    }
}
