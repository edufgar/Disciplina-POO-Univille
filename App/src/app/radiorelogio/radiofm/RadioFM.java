package app.radiorelogio.radiofm;

import app.base.*;

public class RadioFM extends BaseDispositivo {

    private String tipoSintonia;

    public RadioFM() {
        this.setValor("87.5 Mhz");
        this.setTipoSintonia("FM");
    }

    public RadioFM(String frequencia, String tipo) {
        this.setValor(frequencia);
        this.setTipoSintonia(tipo);
    }

    public String getTipoSintonia() {
        return this.tipoSintonia;
    }

    public void setTipoSintonia(String tipoSintonia) {
        this.tipoSintonia = tipoSintonia;
    }

    public String display()
    {
        return this.getTipoSintonia() + " " + this.getValor();
    }
}