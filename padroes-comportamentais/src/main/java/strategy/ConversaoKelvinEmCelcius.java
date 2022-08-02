package strategy;

public class ConversaoKelvinEmCelcius implements Conversao {

    @Override
    public float converter(float medida) {
        return medida-273;
    }
}
