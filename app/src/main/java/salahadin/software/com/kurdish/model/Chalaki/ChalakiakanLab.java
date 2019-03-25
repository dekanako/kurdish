package salahadin.software.com.kurdish.model.Chalaki;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import salahadin.software.com.kurdish.model.Rahenan.Rahenanakan;

public class ChalakiakanLab
{
    private static ChalakiakanLab sChalakiLab;
    private List<Chalakiakan> chalakiakanList = new ArrayList<>();


    public static ChalakiakanLab getInstance(Context context)
    {
        if (sChalakiLab == null)
        {
            sChalakiLab = new ChalakiakanLab(context);
        }
        return sChalakiLab;
    }
    private ChalakiakanLab(Context context)
    {
        initChalakiakan();
    }

    private void initChalakiakan()
    {
        List<String> prsyarakanyChalakiYakamBabat = new ArrayList<>();
        prsyarakanyChalakiYakamBabat.add("وەرە---->وە...رە");
        prsyarakanyChalakiYakamBabat.add("….زۆزان---->زۆ");
        prsyarakanyChalakiYakamBabat.add("...نەوزاد---->نەو");
        prsyarakanyChalakiYakamBabat.add("نانەوا---->….نە");
        prsyarakanyChalakiYakamBabat.add("…….باران---->با");
        prsyarakanyChalakiYakamBabat.add(" …. …..---->مامە");
        prsyarakanyChalakiYakamBabat.add(" گەڵا----> گە");
        prsyarakanyChalakiYakamBabat.add("….باوک---->با");
        prsyarakanyChalakiYakamBabat.add("کەڵەباب---->….باب");

        List<String> prsyarakanyChalakiDwamYakamBabat = new ArrayList<>();
        prsyarakanyChalakiDwamYakamBabat.add("س،ە،ر،د،ا،ر=(   )");
        prsyarakanyChalakiDwamYakamBabat.add("ک،و،ر،د،س،ت،ا،ن=(   )");
        prsyarakanyChalakiDwamYakamBabat.add("ئ،ا،ڵا،ا=(   )");
        prsyarakanyChalakiDwamYakamBabat.add("گ،ۆ،ر،ا،ن،ی=(   )");
        prsyarakanyChalakiDwamYakamBabat.add("س،ر،وو،د=(   )");
        prsyarakanyChalakiDwamYakamBabat.add("ی،ا،ر،ی=(   )");
        prsyarakanyChalakiDwamYakamBabat.add("ه،ە،ڵ،پ،ە،ر،ک،ێ=(   )");
        prsyarakanyChalakiDwamYakamBabat.add("م،ۆ،س،ی،ق،ا=(   )");
        prsyarakanyChalakiDwamYakamBabat.add("ق،و،ت،ا،ب،خ،ا،ن،ە=(   )");
        prsyarakanyChalakiDwamYakamBabat.add("م،ا،م،ۆ،س،ت،ا=(   )");

        List<String> prsyarakaniChalakiSeyamYakamBababt = new ArrayList<>();
        prsyarakaniChalakiSeyamYakamBababt.add("دا ، دە = (دادە)");
        prsyarakaniChalakiSeyamYakamBababt.add("کا ، کە = (    )");
        prsyarakaniChalakiSeyamYakamBababt.add("خا ، ڵە = (    )");
        prsyarakaniChalakiSeyamYakamBababt.add("پو ، رێ = (    )");
        prsyarakaniChalakiSeyamYakamBababt.add("ئا ، رام = (    )");

        List<Chalaki> chalakiakanyYakamBabat = new ArrayList<>();
        chalakiakanyYakamBabat.add(new Chalaki(0
                ,null
                ,prsyarakanyChalakiYakamBabat
                ,"ئەم وشانەی خوارەوە بڕگە بڕگە بکە:"
                ,0
                ,0
                ,null));

        chalakiakanyYakamBabat.add(new Chalaki(1
                , null
                ,prsyarakanyChalakiDwamYakamBabat
                ,"ئەم پیتانەی خوارەوە لێکبدە و ووشەی لێدروست بک :"
                ,1
                ,0
                ,null));

        chalakiakanyYakamBabat.add(new Chalaki(1
                , null
                ,prsyarakaniChalakiSeyamYakamBababt
                ,"ئەم بڕگانەی خوارەوە لێکبدە و وشەی لێدروست بکە:"
                ,2
                ,0
                ,null));

        chalakiakanList.add(new Chalakiakan(chalakiakanyYakamBabat,3));
    }


    public Chalakiakan getChalakiakan(int para)
    {
        for (int x = 0;x < chalakiakanList.size(); x++)
        {
            if (chalakiakanList.get(x).getZhmarayLapara() == para)
            {
                return chalakiakanList.get(x);
            }
        }
        return null;
    }


}
