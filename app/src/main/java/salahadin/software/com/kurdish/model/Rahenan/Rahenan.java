package salahadin.software.com.kurdish.model.Rahenan;

import android.graphics.drawable.Drawable;

import java.util.List;

public class Rahenan
{
    private int laparayRahenan;
    private Drawable mDrawable;
    private List<String> mPrsyarakan;
    private String titleRahenan;
    private int zhmarayRahenan;
    private int mSound;

    private List<SpecialQuestions> specialQuestionsList;



    public Rahenan(Drawable mDrawable, List<String> mPrsyarakan, String titleRahenan, int zhmarayRahenan, int laparayRahenan)
    {
        this.mDrawable = mDrawable;
        this.mPrsyarakan = mPrsyarakan;
        this.titleRahenan = titleRahenan;
        this.zhmarayRahenan = zhmarayRahenan;
        this.laparayRahenan = laparayRahenan;
    }

    public Rahenan(int laparayRahenan, String titleRahenan, int zhmarayRahenan, List<SpecialQuestions> specialQuestionsList)
    {
        this.laparayRahenan = laparayRahenan;
        this.titleRahenan = titleRahenan;
        this.zhmarayRahenan = zhmarayRahenan;
        this.specialQuestionsList = specialQuestionsList;
    }

    public List<SpecialQuestions> getSpecialQuestionsList()
    {
        return specialQuestionsList;
    }

    public void setSpecialQuestionsList(List<SpecialQuestions> specialQuestionsList)
    {
        this.specialQuestionsList = specialQuestionsList;
    }

    public int getLaparayRahenan()
    {
        return laparayRahenan;
    }

    public void setLaparayRahenan(int laparayRahenan) {
        this.laparayRahenan = laparayRahenan;
    }

    public List<String> getmPrsyarakan() {
        return mPrsyarakan;
    }

    public void setmPrsyarakan(List<String> mPrsyarakan) {
        this.mPrsyarakan = mPrsyarakan;
    }

    public String getTitleRahenan() {
        return titleRahenan;
    }

    public void setTitleRahenan(String titleRahenan) {
        this.titleRahenan = titleRahenan;
    }

    public int getZhmarayRahenan() {
        return zhmarayRahenan;
    }

    public void setZhmarayRahenan(int zhmarayRahenan) {
        this.zhmarayRahenan = zhmarayRahenan;
    }

    public int getmSound() {
        return mSound;
    }

    public void setmSound(int mSound) {
        this.mSound = mSound;
    }

    public Drawable getmDrawable()
    {
        return mDrawable;
    }

    public void setmDrawable(Drawable mDrawable)
    {
        this.mDrawable = mDrawable;
    }

}
