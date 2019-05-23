public class ValidaçãoOrçamento {
    private MelhorOrçamento melhorOrçamento;
    private ResponsávelReparação responsávelReparação;

    public ValidaçãoOrçamento(MelhorOrçamento melhorOrçamento, ResponsávelReparação responsávelReparação) {
        this.melhorOrçamento = melhorOrçamento;
        this.responsávelReparação = responsávelReparação;
    }

    public MelhorOrçamento getMelhorOrçamento() {
        return melhorOrçamento;
    }

    public ResponsávelReparação getResponsávelReparação() {
        return responsávelReparação;
    }
}
