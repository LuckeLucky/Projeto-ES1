public class MelhorOrçamento {
    private Orçamento orçamento;
    private Funcionario funcionario;

    public MelhorOrçamento(Orçamento orçamento, Funcionario funcionario) {
        this.orçamento = orçamento;
        this.funcionario = funcionario;
    }

    public Orçamento getOrçamento() {
        return orçamento;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }
}
