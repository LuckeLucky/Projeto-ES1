public class Funcionario {
    private String nome;
    private String funcao;

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public Funcionario(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }
}
