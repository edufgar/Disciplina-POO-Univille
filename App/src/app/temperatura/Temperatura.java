package app.temperatura;

import app.base.*;

public class Temperatura extends BaseDispositivo {

    private String unidadeTemperatura;

    public Temperatura() {
        this.setValor("27,5");
        this.setUnidadeTemperatura("ºC");
    }

    public Temperatura(String unidade, String tipo) {
        this.setValor(unidade);
        this.setUnidadeTemperatura(tipo);
    }

    public String getUnidadeTemperatura() {
        return this.unidadeTemperatura;
    }

    public void setUnidadeTemperatura(String unidadeTemperatura) {
        this.unidadeTemperatura = unidadeTemperatura;
    }

    public String display()
    {
        return this.getUnidadeTemperatura() + " " + this.getValor();
    }

}
