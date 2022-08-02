package templateMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EtanolTest {

    @Test
    void deveRetornarInformacoesAbastecimento(){
        Etanol combustivel = new Etanol();
        combustivel.setValorPorLitroEtanol(4.30);
        combustivel.setValorAbastecimento(100);
        assertEquals("Abastecimento com Etanol realizado. Total abastecido (litros): 430.0",combustivel.getInfo());
    }
}