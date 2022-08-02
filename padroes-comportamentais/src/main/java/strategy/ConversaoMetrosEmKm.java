package strategy;

public class ConversaoMetrosEmKm implements Conversao {

    @Override
    public float converter(float medida) {
        return medida/1000.0f;
    }
}
