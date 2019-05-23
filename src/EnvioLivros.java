public class EnvioLivros {
    private Orçamento orçamento;
    private Funcionario funcionario;
    private Copia copia;

    public EnvioLivros(Orçamento orçamento, Funcionario funcionario, Copia copia) {
        this.orçamento = orçamento;
        this.funcionario = funcionario;
        this.copia = copia;
    }

    public Orçamento getOrçamento() {
        return orçamento;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public Copia getCopia() {
        return copia;
    }
}
