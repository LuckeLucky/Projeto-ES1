public class Utilizador {
    private String nome;
    private String estado;
    private TipoUtilizador tipoutilizador;

    public Utilizador(String nome, String estado) {
        this.nome = nome;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    public TipoUtilizador getTipoutilizador() {
        return tipoutilizador;
    }
}
