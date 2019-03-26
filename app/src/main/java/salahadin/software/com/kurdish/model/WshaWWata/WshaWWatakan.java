package salahadin.software.com.kurdish.model.WshaWWata;

import java.util.List;

public class WshaWWatakan
{
    private List<WshaWWata> wshaWWatas;
    private int mSound;

    public WshaWWatakan(List<WshaWWata> wshaWWatas, int mSound) {
        this.wshaWWatas = wshaWWatas;
        this.mSound = mSound;
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
