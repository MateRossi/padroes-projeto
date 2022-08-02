package strategy;

public class Medida {

    private float medida;

    public float getMedida(){
        return this.medida;
    }

    public void metrosToKm(float medida){
        Conversor conversor = new Conversor(medida);
        this.medida = conversor.converter(new ConversaoMetrosEmKm());
    }

    public void kmtoMetros(float medida){
        Conversor conversor = new Conversor(medida);
        this.medida = conversor.converter(new ConversaoKmEmMetros());
    }

    public void kelvinToCelcius(float medida){
        Conversor conversor = new Conversor(medida);
        this.medida = conversor.converter(new ConversaoKelvinEmCelcius());
    }
}
