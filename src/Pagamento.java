public class Pagamento {
    private Factura factura;
    private ResponsávelReparação responsávelreparação;
    private String metodopagamento;

    public Pagamento(Factura factura, ResponsávelReparação responsávelreparação, String metodopagamento) {
        this.factura = factura;
        this.responsávelreparação = responsávelreparação;
        this.metodopagamento = metodopagamento;
    }

    public Factura getFactura() {
        return factura;
    }

    public ResponsávelReparação getResponsávelreparação() {
        return responsávelreparação;
    }

    public String getMetodopagamento() {
        return metodopagamento;
    }
}
