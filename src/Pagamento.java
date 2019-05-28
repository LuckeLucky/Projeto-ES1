public class Pagamento {
    private Factura factura;
    private ResponsávelReparação responsávelreparação;
    private MétodoPagamento metodopagamento;

    public Pagamento(Factura factura, ResponsávelReparação responsávelreparação, MetodoPagamento metodopagamento) {
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

    public MetodoPagamento getMetodopagamento() {
        return metodopagamento;
    }
}
