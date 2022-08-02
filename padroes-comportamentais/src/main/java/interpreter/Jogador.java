package interpreter;

public class Jogador {

    private double pontuacaoJogo1;
    private double pontuacaoJogo2;
    private double pontuacaoJogo3;

    public double getPontuacaoJogo1() {
        return pontuacaoJogo1;
    }

    public void setPontuacaoJogo1(double pontuacaoJogo1) {
        this.pontuacaoJogo1 = pontuacaoJogo1;
    }

    public double getPontuacaoJogo2() {
        return pontuacaoJogo2;
    }

    public void setPontuacaoJogo2(double pontuacaoJogo2) {
        this.pontuacaoJogo2 = pontuacaoJogo2;
    }

    public double getPontuacaoJogo3() {
        return pontuacaoJogo3;
    }

    public void setPontuacaoJogo3(double pontuacaoJogo3) {
        this.pontuacaoJogo3 = pontuacaoJogo3;
    }

    public double calculaPontuacaoTotal() {
        return Jogo.calcularPontuacaoTotal(this.pontuacaoJogo1, this.pontuacaoJogo2, this.pontuacaoJogo3);
    }
}
