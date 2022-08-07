package adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcadoTest {

    //7, 7.5, 8.5, 9

    @Test
    void deveRetornarTamanhoEua(){
        Calcado calcado = new Calcado();
        calcado.setTamanho(7);

        assertEquals(7, calcado.getTamanho());
    }

    @Test
    void deveRetornarTamanhoBr() {
        Calcado calcado = new Calcado();
        calcado.setTamanho(7);

        assertEquals(36, calcado.getTamanhoBr());
    }
}