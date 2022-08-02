package templateMethod;

public class GasolinaComum extends Combustivel{

    @Override
    public double calculaLitros(double valorDoAbastecimento) {
        return valorDoAbastecimento*this.getValorPorLitro();
    }

    public void setValorPorLitroComum(double valorPorLitro) {
        this.setValorPorLitro(valorPorLitro);
    }
}
