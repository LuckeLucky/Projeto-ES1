public class Factura {
    private ReparaçãoLivro Reparação;
    private ValidaçãoOrçamento valOrçamento;

    public Factura(ReparaçãoLivro reparação, ValidaçãoOrçamento valOrçamento) {
        Reparação = reparação;
        this.valOrçamento = valOrçamento;
    }

    public ReparaçãoLivro getReparação() {
        return Reparação;
    }

    public ValidaçãoOrçamento getValOrçamento() {
        return valOrçamento;
    }
}
