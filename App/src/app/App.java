package app;

import java.text.SimpleDateFormat;
import app.calendario.Data;
import app.radiorelogio.RadioRelogio;
import app.radiorelogio.radiofm.RadioFM;
import app.radiorelogio.relogio.Relogio;
import app.temperatura.Temperatura;

public class App {
    public static void main(String[] args) throws Exception {
        RadioRelogio radioRelogio = new RadioRelogio();
        Relogio relogio = new Relogio();
        radioRelogio.setRelogio(relogio);
        System.out.println(radioRelogio.getRelogio().getValor());
        SimpleDateFormat frm = new SimpleDateFormat("HH:mm:ss");
        relogio.setValor(frm.parse("22:00:00"));
        System.out.println(radioRelogio.getRelogio().getValor());

        RadioFM radio = new RadioFM();
        radioRelogio.setRadioFm(radio);
        System.out.println(radioRelogio.getRadioFm().display());
        radio.setValor("100.5 Mhz");
        System.out.println(radioRelogio.getRadioFm().display());

        Temperatura temp = new Temperatura();
        radioRelogio.setTemperatura(temp);
        System.out.println(radioRelogio.getTemperatura().display());
        temp.setValor("30,5");
        System.out.println(radioRelogio.getTemperatura().display());

        Data datadia = new Data();
        radioRelogio.setData(datadia);
        System.out.println(radioRelogio.getData().getValor());
        SimpleDateFormat frm1 = new SimpleDateFormat("dd/MMM/yyyy");
        datadia.setValor(frm1.parse("08/jul/2019"));
        System.out.println(radioRelogio.getData().getValor());


    }
}