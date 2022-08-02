package templateMethod;

public class Etanol extends Combustivel {

    @Override
    public double calculaLitros(double valorDoAbastecimento) {
        return valorDoAbastecimento*this.getValorPorLitro();
    }

    public void setValorPorLitroEtanol(double valorPorLitro) {
        this.setValorPorLitro(valorPorLitro);
    }

    @Override
    public String getTipo(){
        return "Etanol";
    }
}
