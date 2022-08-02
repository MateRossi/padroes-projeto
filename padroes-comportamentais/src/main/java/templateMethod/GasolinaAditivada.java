package templateMethod;

public class GasolinaAditivada extends Combustivel {

    @Override
    public double calculaLitros(double valorDoAbastecimento) {
        return valorDoAbastecimento*this.getValorPorLitro();
    }

    public void setValorPorLitroAditivada(double valorPorLitro) {
        this.setValorPorLitro(valorPorLitro);
    }

    @Override
    public String getTipo(){
        return "Gasolina aditivada";
    }
}
