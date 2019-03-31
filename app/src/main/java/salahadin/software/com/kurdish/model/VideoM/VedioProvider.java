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
        mVideoList.add(new VedioModel(R.raw.kurdish_alphabet,"vidio lasar mine craft","kurdish_alphabet"));
        mVideoList.add(new VedioModel(R.raw.plestank_vedio,"vidio lasar guitar","plestank_vedio"));
        mVideoList.add(new VedioModel(R.raw.cholaka_vedio,"vidio lasar guitr man","cholaka_vedio"));
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
