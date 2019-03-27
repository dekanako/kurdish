package salahadin.software.com.kurdish.model;

import android.graphics.drawable.Drawable;

import java.util.List;

import salahadin.software.com.kurdish.model.WshaWWata.WshaWWata;

public class Babat
{
    private String nawyBabat;
    private String contentyBabat;
    private Drawable wenayBabat;
    private int laparayBabat;
    private String nawyNusar;
    private List<WshaWWata> wshaWWata;
    private int mSound;
    //private String
    public Babat()
    {

    }

    public Babat(String nawyBabat, String contentyBabat, Drawable wenayBabat, int laparayBabat, String nawyNusar, List<WshaWWata> wshaWWata)
    {
        this.nawyBabat = nawyBabat;
        this.contentyBabat = contentyBabat;
        this.wenayBabat = wenayBabat;
        this.laparayBabat = laparayBabat;
        this.nawyNusar = nawyNusar;
        this.wshaWWata = wshaWWata;
    }

    public Babat(String nawyBabat, String contentyBabat, Drawable wenayBabat, int laparayBabat, String nawyNusar,int mSound)
    {
        this.nawyBabat = nawyBabat;
        this.contentyBabat = contentyBabat;
        this.wenayBabat = wenayBabat;
        this.laparayBabat = laparayBabat;
        this.nawyNusar = nawyNusar;
        this.mSound = mSound;
    }




    public int getmSound() {
        return mSound;
    }

    public void setmSound(int mSound) {
        this.mSound = mSound;
    }




    public List<WshaWWata> getWshaWWata() {
        return wshaWWata;
    }

    public void setWshaWWata(List<WshaWWata> wshaWWata) {
        this.wshaWWata = wshaWWata;
    }

    public String getNawyNusar() {
        return nawyNusar;
    }

    public void setNawyNusar(String nawyNusar) {
        this.nawyNusar = nawyNusar;
    }

    public int getLaparayBabat() {
        return laparayBabat;
    }

    public void setLaparayBabat(int laparayBabat) {
        this.laparayBabat = laparayBabat;
    }

    public String getNawyBabat() {
        return nawyBabat;
    }

    public void setNawyBabat(String nawyBabat) {
        this.nawyBabat = nawyBabat;
    }

    public String getContentyBabat() {
        return contentyBabat;
    }

    public void setContentyBabat(String contentyBabat) {
        this.contentyBabat = contentyBabat;
    }

    public Drawable getWenayBabat() {
        return wenayBabat;
    }

    public void setWenayBabat(Drawable wenayBabat) {
        this.wenayBabat = wenayBabat;
    }

}
