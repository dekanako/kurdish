package salahadin.software.com.kurdish.model.WshaWWata;

import java.util.List;

public class WshaWWatakan
{
    private List<WshaWWata> wshaWWatas;
    private int mSound;
    private int mPage;

    public int getmPage() {
        return mPage;
    }

    public void setmPage(int mPage) {
        this.mPage = mPage;
    }

    public WshaWWatakan(List<WshaWWata> wshaWWatas, int mSound, int mPage) {
        this.wshaWWatas = wshaWWatas;
        this.mSound = mSound;
        this.mPage = mPage;
    }

    public List<WshaWWata> getWshaWWatas() {
        return wshaWWatas;
    }

    public void setWshaWWatas(List<WshaWWata> wshaWWatas) {
        this.wshaWWatas = wshaWWatas;
    }

    public int getmSound() {
        return mSound;
    }

    public void setmSound(int mSound) {
        this.mSound = mSound;
    }
}
