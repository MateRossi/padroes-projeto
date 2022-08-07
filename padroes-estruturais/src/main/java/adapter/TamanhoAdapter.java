package adapter;

public class TamanhoAdapter extends TamanhoBr {

    private ITamanho tamanhoEua;

    public TamanhoAdapter (ITamanho tamanhoEua) {
        this.tamanhoEua = tamanhoEua;
    }

    public double recuperarTamanho() {
        if (this.getTamanhoBr() == 36) {
            tamanhoEua.setTamanho(7);
        }else if (this.getTamanhoBr() == 37){
            tamanhoEua.setTamanho(7.5);
        }else if (this.getTamanhoBr() == 38){
            tamanhoEua.setTamanho(8.5);
        }else if (this.getTamanhoBr() == 39){
            tamanhoEua.setTamanho(9);
        }
        return tamanhoEua.getTamanho();
    }
    public void salvarTamanho() {
        if (tamanhoEua.getTamanho() == 7){
            this.setTamanhoBr(36);
        }else if (tamanhoEua.getTamanho() == 7.5){
            this.setTamanhoBr(37);
        }else if (tamanhoEua.getTamanho() == 8.5){
            this.setTamanhoBr(38);
        }else if (tamanhoEua.getTamanho() == 9){
            this.setTamanhoBr(39);
        }
    }
}
