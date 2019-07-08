package app.base;

public abstract  class BaseDispositivo implements IBaseDispositivo {
    private String valor;

    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}