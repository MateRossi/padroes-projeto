package iterator;

import java.util.Iterator;

public class Registro {

    public static Integer contarVeiculosEstacionados (Estacionamento estacionamento) {
        int quantidade = 0;
        for (Veiculo veiculo : estacionamento) {
            if (veiculo.isEstacionado()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalVeiculosCadastrados (Estacionamento estacionamento) {
        int quantidade = 0;
        for (Iterator v = estacionamento.iterator(); v.hasNext(); ) {
            quantidade++;
            v.next();
        }
        return quantidade;
    }
}
