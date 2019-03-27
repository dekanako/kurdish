package salahadin.software.com.kurdish.model.VideoM;

import java.util.ArrayList;
import java.util.List;

import salahadin.software.com.kurdish.R;


public class VedioProvider
{
    private List<VedioModel> mVideoList = new ArrayList<>();
    private static VedioProvider sVedioProvider;

    public static VedioProvider getInstance()
    {
        if (sVedioProvider == null)
        {
            sVedioProvider = new VedioProvider();
        }
        return sVedioProvider;
    }

    public List<VedioModel> getmVideoList() {
        return mVideoList;
    }

    public VedioProvider()
    {
        initVediosList();
    }

    private void initVediosList()
    {
        mVideoList.add(new VedioModel(R.raw.zhmaray_kurdi,"vidio lasar hawreyaty","zhmaray_kurdi"));
        /**mVideoList.add(new VedioModel(R.raw.mine_craft,"vidio lasar mine craft","guitar_man"));
        mVideoList.add(new VedioModel(R.raw.guitar_w_sht,"vidio lasar guitar","guitar_w_sht"));
        mVideoList.add(new VedioModel(R.raw.guitar_man,"vidio lasar guitr man","mine_craft"));**/
    }
    public String getVedioModel(int link)
    {
        for (int x = 0; x< mVideoList.size(); x++)
        {
            if (mVideoList.get(x).getmLink() == link)
            {
                return mVideoList.get(x).getLocatedName();
            }

        }
        return null;
    }


}
