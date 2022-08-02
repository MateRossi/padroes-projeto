package interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    void deveCalcularPontuacaoComFormula() {
        Jogador jogador = new Jogador();
        jogador.setPontuacaoJogo1(10);
        jogador.setPontuacaoJogo2(10);
        jogador.setPontuacaoJogo3(10);

        assertEquals(10, jogador.calculaPontuacaoTotal());
    }
}