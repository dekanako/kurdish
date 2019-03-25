package salahadin.software.com.kurdish.model.Rahenan;

import java.util.List;

import salahadin.software.com.kurdish.model.Rahenan.Rahenan;

public class Rahenanakan
{
    private List<Rahenan> rahenans;
    private int zhmarayLapara;

    public Rahenanakan(List<Rahenan> rahenans, int zhmarayLapara)
    {
        this.rahenans = rahenans;
        this.zhmarayLapara = zhmarayLapara;
    }

    public List<Rahenan> getRahenans()
    {
        return rahenans;
    }

    public void setRahenans(List<Rahenan> rahenans)
    {
        this.rahenans = rahenans;
    }

    public int getZhmarayLapara()
    {
        return zhmarayLapara;
    }

    public void setZhmarayLapara(int zhmarayLapara)
    {
        this.zhmarayLapara = zhmarayLapara;
    }
}
