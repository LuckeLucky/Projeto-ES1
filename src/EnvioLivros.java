public class EnvioLivros {
    private ValidaçãoOrçamento orçamento;
    private Funcionario funcionario;

    public EnvioLivros(ValidaçãoOrçamento orçamento, Funcionario funcionario) {
        this.orçamento = orçamento;
        this.funcionario = funcionario;
    }

    public ValidaçãoOrçamento getOrçamento() {
        return orçamento;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

}
