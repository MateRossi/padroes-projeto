package templateMethod;

public abstract class Combustivel {

    private double valorPorLitro;
    private double valorPago;

    public String getTipo() {
        return "Gasolina comum";
    }

    public abstract double calculaLitros(double valorDoAbastecimento);

    public void setValorAbastecimento (double valorPago){
        this.valorPago=valorPago;
    }

    public String getInfo() {
        return "Abastecimento com "+getTipo()+" realizado. Total abastecido (litros): "+ this.calculaLitros(this.valorPago);
    }

    public double getValorPorLitro() {
        return valorPorLitro;
    }

    public void setValorPorLitro(double valorPorLitro) {
        this.valorPorLitro=valorPorLitro;
    }
}
