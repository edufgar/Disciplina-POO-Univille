package app.radiorelogio.relogio;

import java.text.SimpleDateFormat;
import java.util.Date;
import app.base.*;

public class Relogio extends BaseDispositivo {

    public Relogio()
    {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        this.setValor(formatter.format(new Date()));
    }

    public void setValor(Date valor)
    {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        this.setValor(formatter.format(valor));
    }
}