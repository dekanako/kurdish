package salahadin.software.com.kurdish.model.Rahenan;


import android.graphics.drawable.Drawable;

public class SpecialQuestions
{
    private String mWsh;
    private String mPit;
    private Drawable mWena;
    private int mSound;

    public SpecialQuestions(String mWsh, String mPit, Drawable mWena, int mSound)
    {
        this.mWsh = mWsh;
        this.mPit = mPit;
        this.mWena = mWena;
        this.mSound = mSound;
    }

    public String getmWsh() {
        return mWsh;
    }

    public void setmWsh(String mWsh) {
        this.mWsh = mWsh;
    }

    public String getmPit() {
        return mPit;
    }

    public void setmPit(String mPit) {
        this.mPit = mPit;
    }

    public Drawable getmWena() {
        return mWena;
    }

    public void setmWena(Drawable mWena) {
        this.mWena = mWena;
    }

    public int getmSound() {
        return mSound;
    }

    public void setmSound(int mSound) {
        this.mSound = mSound;
    }
}