package adapter;

public class TamanhoEua implements ITamanho {
    private double tamanho;
    @Override
    public double getTamanho() {
        return this.tamanho;
    }
    @Override
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}
