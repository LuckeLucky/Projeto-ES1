import java.time.LocalDate;

public class DevolucaoLivro {
    private ReparaçãoLivro reparaçãoLivro;
    private LocalDate data;

    public ReparaçãoLivro getReparaçãoLivro() {
        return reparaçãoLivro;
    }

    public void setReparaçãoLivro(ReparaçãoLivro reparaçãoLivro) {
        this.reparaçãoLivro = reparaçãoLivro;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public DevolucaoLivro(ReparaçãoLivro reparaçãoLivro, LocalDate data) {
        this.reparaçãoLivro = reparaçãoLivro;
        this.data = data;
    }
}
