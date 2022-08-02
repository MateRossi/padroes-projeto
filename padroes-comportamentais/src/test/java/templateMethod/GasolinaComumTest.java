package templateMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasolinaComumTest {

    @Test
    void deveRetornarInformacoesAbastecimento(){
        GasolinaComum combustivel = new GasolinaComum();
        combustivel.setValorPorLitroComum(5.65);
        combustivel.setValorAbastecimento(100);
        assertEquals("Abastecimento com Gasolina comum realizado. Total abastecido (litros): 565.0",combustivel.getInfo());
    }

}