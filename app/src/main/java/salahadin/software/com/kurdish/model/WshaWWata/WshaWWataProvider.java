package salahadin.software.com.kurdish.model.WshaWWata;

import java.util.ArrayList;
import java.util.List;

import salahadin.software.com.kurdish.model.Babat;
import salahadin.software.com.kurdish.model.BabatsProvider;

public class WshaWWataProvider
{

    private List<WshaWWatakan> wshaWWatakanList = new ArrayList<>();
    private static WshaWWataProvider wshaWWataProvider;

    public static WshaWWataProvider getInstance()
    {
        if (wshaWWataProvider == null)
        {
            wshaWWataProvider = new WshaWWataProvider();
        }
        return wshaWWataProvider;
    }

    public WshaWWataProvider()
    {
         initWshaWWatakan();
    }

    private void initWshaWWatakan()
    {

    }
}
