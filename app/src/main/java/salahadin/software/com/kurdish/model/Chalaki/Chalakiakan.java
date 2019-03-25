package salahadin.software.com.kurdish.model.Chalaki;

import java.util.List;

public class Chalakiakan
{
    private List<Chalaki> mChalakiakan;
    private int zhmarayLapara;

    public Chalakiakan(List<Chalaki> mChalakiakan, int zhmarayLapara)
    {
        this.mChalakiakan = mChalakiakan;
        this.zhmarayLapara = zhmarayLapara;
    }

    public List<Chalaki> getmChalakiakan() {
        return mChalakiakan;
    }

    public void setmChalakiakan(List<Chalaki> mChalakiakan) {
        this.mChalakiakan = mChalakiakan;
    }

    public int getZhmarayLapara() {
        return zhmarayLapara;
    }

    public void setZhmarayLapara(int zhmarayLapara) {
        this.zhmarayLapara = zhmarayLapara;
    }
}
