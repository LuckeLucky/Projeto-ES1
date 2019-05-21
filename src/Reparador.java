public class Reparador {
    private String nome;
    private String morada;

    public Reparador(String nome, String morada) {
        this.nome = nome;
        this.morada = morada;
    }

    public String getNome() {
        return nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }
}
