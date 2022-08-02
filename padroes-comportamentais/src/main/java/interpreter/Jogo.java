package interpreter;

public class Jogo {

    public static String formula = "pontuacaoJogo1 + pontuacaoJogo2 + pontuacaoJogo3 / 3";

    public static double calcularPontuacaoTotal(double pontuacaoJogo1, double pontuacaoJogo2, double pontuacaoJogo3) {
        String expressao;
        expressao = formula.replace("pontuacaoJogo1", Double.toString(pontuacaoJogo1));
        expressao = expressao.replace("pontuacaoJogo2", Double.toString(pontuacaoJogo2));
        expressao = expressao.replace("pontuacaoJogo3", Double.toString(pontuacaoJogo3));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
