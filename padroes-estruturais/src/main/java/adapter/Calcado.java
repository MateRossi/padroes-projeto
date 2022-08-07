package adapter;

public class Calcado {
    private ITamanho tamanho;
    private TamanhoAdapter adapter;
    public Calcado() {
        tamanho = new TamanhoEua();
        adapter = new TamanhoAdapter(tamanho);
    }

    public void setTamanho(double tamanho){
        this.tamanho.setTamanho(tamanho);
        adapter.salvarTamanho();
    }

    public double getTamanho(){
        return adapter.recuperarTamanho();
    }

    public double getTamanhoBr() {
        return adapter.getTamanhoBr();
    }

}
