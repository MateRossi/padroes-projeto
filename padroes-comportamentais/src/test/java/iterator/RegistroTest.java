package iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistroTest {

    @Test
    void deveContarVeiculosEstacionados() {
        Estacionamento estacionamento = new Estacionamento(
                new Veiculo("911 Turbo", true),
                new Veiculo("Carrera GT", true),
                new Veiculo("Fusca", false),
                new Veiculo("Corvette Z06", true)
        );
        assertEquals(3, Registro.contarVeiculosEstacionados(estacionamento));
    }

    @Test
    void deveContarTotalVeiculosCadastrados() {
        Estacionamento estacionamento = new Estacionamento(
                new Veiculo("911 Turbo", true),
                new Veiculo("Carrera GT", true),
                new Veiculo("Fusca", false),
                new Veiculo("Corvette Z06", true)
        );
        assertEquals(4, Registro.contarTotalVeiculosCadastrados(estacionamento));
    }


}