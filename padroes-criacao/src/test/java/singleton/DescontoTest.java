package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DescontoTest {

    @Test
    public void deveRetornarPorcentagem() {
        Desconto.getInstancia().setPorcentagem(10);
        assertEquals(10, Desconto.getInstancia().getPorcentagem());
    }
}