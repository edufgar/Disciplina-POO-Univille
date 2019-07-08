package app.radiorelogio;

import app.radiorelogio.relogio.*;
import app.radiorelogio.radiofm.*;
import app.temperatura.*;
import app.calendario.*;

public class RadioRelogio {
    private Relogio relogio;
    private RadioFM radioFm;
    private Temperatura temperatura;
    private Data datadodia;

    public Relogio getRelogio()
    {
        return this.relogio;
    }

    public void setRelogio(Relogio relogio)
    {
        this.relogio = relogio;
    }

    public RadioFM getRadioFm()
    {
        return this.radioFm;
    }

    public void setRadioFm(RadioFM radio)
    {
        this.radioFm = radio;
    }

    public Temperatura getTemperatura()
    {
        return this.temperatura;
    }

    public void setTemperatura(Temperatura temp)
    {
        this.temperatura = temp;
    }

    public Data getData()
    {
        return this.datadodia;
    }

    public void setData(Data datadia)
    {
        this.datadodia = datadia;
    }



}

