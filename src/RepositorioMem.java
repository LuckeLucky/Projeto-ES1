import java.util.ArrayList;

public class RepositorioMem implements Repositorio {
    private ArrayList<Utilizador> utilizadores = new ArrayList<Utilizador>();
    private ArrayList<TipoUtilizador> tipo_utilizadores = new ArrayList<TipoUtilizador>();
    private ArrayList<Requisicao> requisicoes = new ArrayList<Requisicao>();
    private ArrayList<Copia> copias = new ArrayList<Copia>();
    private ArrayList<Livro> livros = new ArrayList<Livro>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
    private ArrayList<Notificacao> notificacoes = new ArrayList<Notificacao>();
    private ArrayList<Devolucao> devolucoes = new ArrayList<Devolucao>();
    private ArrayList<Coima> coimas = new ArrayList<Coima>();
    private ArrayList<Encomenda> encomendas = new ArrayList<Encomenda>();
    private ArrayList<EntradaNovoLivro> entradanovoslivros = new ArrayList<EntradaNovoLivro>();
    private ArrayList<PropostaAquisicao> propostasaquisicao = new ArrayList<PropostaAquisicao>();
    private ArrayList<RequisicaoCompra> requesicoescompra = new ArrayList<RequisicaoCompra>();
    private ArrayList<RequisicaoCompraLivro> requisicoescompralivro = new ArrayList<RequisicaoCompraLivro>();
    private ArrayList<Report> reportes = new ArrayList<Report>();
    private ArrayList<RequisicaoReparacao> requisicaoReparacaos = new ArrayList<RequisicaoReparacao>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private ArrayList<Orçamento> orçamentos = new ArrayList<Orçamento>();
    private ArrayList<Reparador> reparadores = new ArrayList<Reparador>();
    private ArrayList<ResponsávelReparação> responsavelreparaçao = new ArrayList<ResponsávelReparação>();

    public RepositorioMem() {
    }

    public void adicionaUtilizador(Utilizador utilizador) {
        utilizadores.add(utilizador);
    }

    public void adicionaTipoUtilizador(TipoUtilizador tipo) {
        tipo_utilizadores.add(tipo);
    }

    public void adicionaRequisicao(Requisicao requisicao) {
        requisicoes.add(requisicao);
    }

    public void adicionaCopia(Copia copia) {
        copias.add(copia);
    }

    public void adicionaLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionaEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    public void adicionaNotificacao(Notificacao notificacao) {
        notificacoes.add(notificacao);
    }

    public void adicionaDevolucao(Devolucao devolucao) {
        devolucoes.add(devolucao);
    }

    public void adicionaCoima(Coima coima) {
        coimas.add(coima);
    }

    public void adicionaEncomenda(Encomenda encomenda) {
        encomendas.add(encomenda);
    }

    public void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro) {
        entradanovoslivros.add(entradaNovoLivro);
    }

    public void adicionaPropostaRequisicao(PropostaAquisicao proposta) {
        propostasaquisicao.add(proposta);
    }

    public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra) {
        requesicoescompra.add(requisicaoCompra);
    }

    public void adicionaRequisicaoCompraLivro(RequisicaoCompraLivro requisicaoCompraLivro) {
        requisicoescompralivro.add(requisicaoCompraLivro);
    }

    public void adicionaOrçamentos(Orçamento orçamento) {
        orçamentos.add(orçamento);
    }

    public void adicionaReparadores(Reparador reparador) {
        reparadores.add(reparador);
    }

    public void adicionaResponsavelReparaçao(ResponsávelReparação responsável_Reparação) {
        responsavelreparaçao.add(responsável_Reparação);
    }

    public void adicionaReporte(Report report){
        reportes.add(report);
    }

    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r) {
        for (int i = 0; i < emprestimos.size(); i++) {
            if (r == emprestimos.get(i).getRequisicao())
                return emprestimos.get(i);
        }
        return null;
    }
}
