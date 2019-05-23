import java.util.ArrayList;

public class ReparaçãoLivro {
    private Reparador reparador;//envio livros???
    private Copia copia;

    public ReparaçãoLivro(Reparador reparador, Copia copia) {
        this.reparador = reparador;
        this.copia = copia;
    }

    public Reparador getReparador() {
        return reparador;
    }

    public Copia getCopia() {
        return copia;
    }
}
