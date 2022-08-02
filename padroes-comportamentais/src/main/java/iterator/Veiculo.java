package iterator;

public class Veiculo {

    private String modelo;
    private boolean isEstacionado;

    public Veiculo(String modelo, boolean isEstacionado) {
        this.modelo = modelo;
        this.isEstacionado = isEstacionado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isEstacionado() {
        return isEstacionado;
    }

    public void setEstacionado(boolean estacionado) {
        isEstacionado = estacionado;
    }
}
