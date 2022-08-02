package templateMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasolinaAditivadaTest {

    @Test
    void deveRetornarInformacoesAbastecimento(){
        GasolinaAditivada combustivel = new GasolinaAditivada();
        combustivel.setValorPorLitroAditivada(5.80);
        combustivel.setValorAbastecimento(100);
        assertEquals("Abastecimento com Gasolina aditivada realizado. Total abastecido (litros): 580.0",combustivel.getInfo());
    }

}