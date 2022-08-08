package singleton;

public class Desconto {

    private Desconto instancia1;

    private Desconto() {};

    private static Desconto instancia = new Desconto();

    public static Desconto getInstancia(){
        return instancia;
    }

    private double porcentagem;

    public double getPorcentagem(){
        return this.porcentagem;
    }

    public void setPorcentagem (double porcentagem){
        this.porcentagem = porcentagem;
    }
}
