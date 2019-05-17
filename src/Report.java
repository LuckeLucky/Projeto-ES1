import java.time.LocalDate;

public class Report {
    LocalDate data;
    Utilizador utilizador;
    Copia copia;
    Reparador reparador;

    public Report(LocalDate data, Utilizador utilizador, Copia copia, Reparador reparador) {
        this.data = data;
        this.utilizador = utilizador;
        this.copia = copia;
        this.reparador = reparador;
    }

    public LocalDate getData() {
        return data;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public Copia getCopia() {
        return copia;
    }

    public Reparador getReparador() {
        return reparador;
    }
}
