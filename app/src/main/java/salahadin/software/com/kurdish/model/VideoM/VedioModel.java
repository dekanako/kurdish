package salahadin.software.com.kurdish.model.VideoM;

public class VedioModel
{
    private int mLink;
    private String title;
    private String locatedName;

    public VedioModel(int mLink, String title, String locatedName) {
        this.mLink = mLink;
        this.title = title;
        this.locatedName = locatedName;
    }

    public String getLocatedName() {
        return locatedName;
    }

    public void setLocatedName(String locatedName) {
        this.locatedName = locatedName;
    }

    public int getmLink() {
        return mLink;
    }

    public void setmLink(int mLink) {
        this.mLink = mLink;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
