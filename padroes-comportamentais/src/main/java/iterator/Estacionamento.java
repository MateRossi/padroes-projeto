package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Estacionamento implements Iterable<Veiculo> {

    private List<Veiculo> veiculos = new ArrayList<Veiculo>();

    public Estacionamento(Veiculo... veiculos) {
        this.veiculos = Arrays.asList(veiculos);
    }

    @Override
    public Iterator<Veiculo> iterator() {
        return veiculos.iterator();
    }
}
