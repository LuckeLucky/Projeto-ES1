public class Orçamento {
    private Reparador reparador;
    private int valor;
    private Copia copia;

    public Orçamento(Reparador reparador, int valor, Copia copia) {
        this.reparador = reparador;
        this.valor = valor;
        this.copia = copia;
    }

    public Reparador getReparador() {
        return reparador;
    }

    public int getValor() {
        return valor;
    }

    public Copia getCopia() {
        return copia;
    }

    public void setReparador(Reparador reparador) {
        this.reparador = reparador;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setCopia(Copia copia) {
        this.copia = copia;
    }
}
