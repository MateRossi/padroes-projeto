package strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedidaTest {

    @Test
    void deveRetornarKmAPartirDeMetros(){
        Medida medida = new Medida();
        medida.metrosToKm(1000);
        assertEquals(1.0f, medida.getMedida());
    }

    @Test
    void deveRetornarMetrosAPartirDeKm(){
        Medida medida = new Medida();
        medida.kmtoMetros(1);
        assertEquals(1000.0f, medida.getMedida());
    }

    @Test
    void deveRetornarCelciusAPartirDeKelvin(){
        Medida medida = new Medida();
        medida.kelvinToCelcius(250);
        assertEquals(-23.0f, medida.getMedida());
    }

}