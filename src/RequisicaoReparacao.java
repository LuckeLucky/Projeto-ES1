import java.time.LocalDate;

public class RequisicaoReparacao {
    private Funcionario funcionario;
    private LocalDate data;
    private Copia copia;

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public LocalDate getData() {
        return data;
    }

    public Copia getCopia() {
        return copia;
    }

    public RequisicaoReparacao(Funcionario funcionario, LocalDate data, Copia copia) {
        this.funcionario = funcionario;
        this.data = data;
        this.copia = copia;
    }
}
