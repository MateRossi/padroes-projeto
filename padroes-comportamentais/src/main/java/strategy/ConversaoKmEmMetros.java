package strategy;

public class ConversaoKmEmMetros implements Conversao {

    @Override
    public float converter(float medida) {
        return medida*1000.0f;
    }
}
