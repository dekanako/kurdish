package salahadin.software.com.kurdish.model.Chalaki;

import android.graphics.drawable.Drawable;

import java.util.List;

public class Chalaki
{
    private int laparayChalaki;
    private Drawable mDrawable;
    private List<String> mPrsyarakan;
    private String titleChalaki;
    private int zhmarayChalaki;
    private int mSound;
    private String hintyChalaki;

    public Chalaki(int laparayChalaki, Drawable mDrawable, List<String> mPrsyarakan, String titleChalaki, int zhmarayChalaki, int mSound, String hintyChalaki) {
        this.laparayChalaki = laparayChalaki;
        this.mDrawable = mDrawable;
        this.mPrsyarakan = mPrsyarakan;
        this.titleChalaki = titleChalaki;
        this.zhmarayChalaki = zhmarayChalaki;
        this.mSound = mSound;
        this.hintyChalaki = hintyChalaki;
    }

    public String getHintyChalaki() {
        return hintyChalaki;
    }

    public void setHintyChalaki(String hintyChalaki) {
        this.hintyChalaki = hintyChalaki;
    }

    public int getLaparayChalaki()
    {
        return laparayChalaki;
    }

    public void setLaparayChalaki(int laparayChalaki)
    {
        this.laparayChalaki = laparayChalaki;
    }

    public Drawable getmDrawable()
    {
        return mDrawable;
    }

    public void setmDrawable(Drawable mDrawable) {
        this.mDrawable = mDrawable;
    }

    public List<String> getmPrsyarakan() {
        return mPrsyarakan;
    }

    public void setmPrsyarakan(List<String> mPrsyarakan) {
        this.mPrsyarakan = mPrsyarakan;
    }

    public String getTitleChalaki() {
        return titleChalaki;
    }

    public void setTitleChalaki(String titleChalaki) {
        this.titleChalaki = titleChalaki;
    }

    public int getZhmarayChalaki() {
        return zhmarayChalaki;
    }

    public void setZhmarayChalaki(int zhmarayChalaki) {
        this.zhmarayChalaki = zhmarayChalaki;
    }

    public int getmSound() {
        return mSound;
    }

    public void setmSound(int mSound) {
        this.mSound = mSound;
    }
}
