package strategy;

public class Conversor {

    public float medida;

    public Conversor(float medida) {
        this.medida = medida;
    }

    public float converter(Conversao conversao) {
        return conversao.converter(medida);
    }
}
