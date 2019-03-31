package salahadin.software.com.kurdish.model.WshaWWata;

import java.util.ArrayList;
import java.util.List;

import salahadin.software.com.kurdish.R;

public class WshaWWataProvider
{

    private List<WshaWWatakan> mWshaWWatakanList = new ArrayList<>();
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
        List<WshaWWata> wshaWWatas1 = new ArrayList<>();

        wshaWWatas1.add(new WshaWWata("وشه‌","په‌یڤ"));
        wshaWWatas1.add(new WshaWWata("وریا","هۆشیار, هشیار"));
        wshaWWatas1.add(new WshaWWata("گوێ ڕایەڵ","گوهدار"));
        wshaWWatas1.add(new WshaWWata("دەسرەوێ","دەحەوێتەوە"));
        wshaWWatas1.add(new WshaWWata("نایانژاکێنم","نایان هەچڵێنم\n، تێکیان نادەم"));
        mWshaWWatakanList.add(new WshaWWatakan(wshaWWatas1,R.raw.wshawatta_salynwe_pirozbe,3));
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        List<WshaWWata> wshaWWatas2 = new ArrayList<>();
        wshaWWatas2.add(new WshaWWata("فێردەکات","فێری دەکا"));
        wshaWWatas2.add(new WshaWWata("پزیشک"," نۆژدار، پزیشک"));
        wshaWWatas2.add(new WshaWWata("نەخۆش","نەساغ"));
        wshaWWatas2.add(new WshaWWata("نژیار"," وەستای دروستکردنی \nخانوو"));
        wshaWWatas2.add(new WshaWWata("زەڤی","زەوی، ئەرد"));
        wshaWWatas2.add(new WshaWWata("نانەوا","نانپێژ"));
        wshaWWatas2.add(new WshaWWata("دەبرژێنێ(نان دەکا)","دەپێژێت"));
        mWshaWWatakanList.add(new WshaWWatakan(wshaWWatas2,R.raw.am_mrovana_kardakan_wshawata,16));

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        List<WshaWWata> wshaWWatas3 = new ArrayList<>();

        wshaWWatas3.add(new WshaWWata("منداڵ","زارۆک"));
        wshaWWatas3.add(new WshaWWata("ژیر","زیرەک"));
        wshaWWatas3.add(new WshaWWata("پاک","پاکژ، خاوێن"));
        wshaWWatas3.add(new WshaWWata("بەیانی","سپێدە"));
        wshaWWatas3.add(new WshaWWata("هەڵدەستم","ڕادەبم"));
        wshaWWatas3.add(new WshaWWata("قوتابی","خوێندکار"));
        wshaWWatas3.add(new WshaWWata("هێمنی","لەسەرخۆ"));
        wshaWWatas3.add(new WshaWWata("گوێ","گوه"));
        //TODO mndalu zhir doesnt have audir
        mWshaWWatakanList.add(new WshaWWatakan(wshaWWatas3,R.raw.mndalyzhir_wshawatakay73864921122469874138,21));

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        List<WshaWWata> wshaWWatas4 = new ArrayList<>();

        wshaWWatas4.add(new WshaWWata("گۆرانی","ستران"));
        wshaWWatas4.add(new WshaWWata("هەڵپەڕکێ","گۆڤاند"));
        wshaWWatas4.add(new WshaWWata("کات","دەم، گاڤ"));
        wshaWWatas4.add(new WshaWWata("زەماوەند","شاهی"));
        wshaWWatas4.add(new WshaWWata("بە تەنیا","بتنێ"));

        mWshaWWatakanList.add(new WshaWWatakan(wshaWWatas4,R.raw.mosiqa_wshawata,24));
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        List<WshaWWata> wshaWWatas5 = new ArrayList<>();

        wshaWWatas5.add(new WshaWWata("مەڵبەند","بنکە"));
        wshaWWatas5.add(new WshaWWata("گشت","هەموو"));
        wshaWWatas5.add(new WshaWWata("سات","کات"));
        wshaWWatas5.add(new WshaWWata("وریا","هۆشیار"));
        wshaWWatas5.add(new WshaWWata("تەنگانە","تەنگاڤی"));
        wshaWWatas5.add(new WshaWWata("قوتابخانە","خوێندنگە"));

        mWshaWWatakanList.add(new WshaWWatakan(wshaWWatas5,R.raw.qutabxana_wshawata,26));
    }
    public WshaWWatakan getWshawWatakan(int para)
    {
        for (int x = 0;x < mWshaWWatakanList.size(); x++)
        {
            if (mWshaWWatakanList.get(x).getmPage() == para)
            {
                return mWshaWWatakanList.get(x);
            }
        }
        return null;
    }
}
