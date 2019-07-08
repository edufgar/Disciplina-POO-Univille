package app.calendario;

import java.text.SimpleDateFormat;
import java.util.Date;
import app.base.*;

public class Data extends BaseDispositivo {

    public Data()
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MMM/YYYY");
        this.setValor(formatter.format(new Date()));
    }

    public void setValor(Date valor)
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MMM/YYYY");
        this.setValor(formatter.format(valor));
    }


}
