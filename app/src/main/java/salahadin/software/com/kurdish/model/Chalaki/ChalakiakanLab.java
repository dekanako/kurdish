package salahadin.software.com.kurdish.model.Chalaki;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import salahadin.software.com.kurdish.R;


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
        initChalakiakan(context);
    }

    private void initChalakiakan(Context context)
    {
        List<String> prsyarakanyChalakiYakamBabat = new ArrayList<>();
        prsyarakanyChalakiYakamBabat.add("وەرە---->وە...رە");
        prsyarakanyChalakiYakamBabat.add("زۆزان---->زۆ...");
        prsyarakanyChalakiYakamBabat.add("نازه‌---->نا...");
        prsyarakanyChalakiYakamBabat.add("نەوزاد---->نەو...");
        prsyarakanyChalakiYakamBabat.add("نانەوا---->...نە");
        prsyarakanyChalakiYakamBabat.add("باران---->با...");
        prsyarakanyChalakiYakamBabat.add("مامە---->... ");
        prsyarakanyChalakiYakamBabat.add(" گەڵا----> گە...");
        prsyarakanyChalakiYakamBabat.add(" گەرما----> گە...");
        prsyarakanyChalakiYakamBabat.add("باوک---->با...");
        prsyarakanyChalakiYakamBabat.add("کەڵەباب---->...باب");

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
                ,R.raw.chalaky1_salynwe
                ,null));

        chalakiakanyYakamBabat.add(new Chalaki(1
                , null
                ,prsyarakanyChalakiDwamYakamBabat
                ,"ئەم پیتانەی خوارەوە لێکبدە و ووشەی لێدروست بک :"
                ,1
                ,R.raw.chalaky2_salynwe
                ,null));

        chalakiakanyYakamBabat.add(new Chalaki(1
                , null
                ,prsyarakaniChalakiSeyamYakamBababt
                ,"ئەم بڕگانەی خوارەوە لێکبدە و وشەی لێدروست بکە:"
                ,2
                ,R.raw.chalaky3_salynwe
                ,null));

        chalakiakanList.add(new Chalakiakan(chalakiakanyYakamBabat,3));
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        List<String>prsyarakaniChalaki1Babaty2 = new ArrayList<>();
        prsyarakaniChalaki1Babaty2.add("١. ئازاد دیوار رەنگ دەکات\n" +
                "ئازاد……...یە\n");
        prsyarakaniChalaki1Babaty2.add("٢. کاوە ئوتومبێل لێدەخوڕێ\n" +
                "کاوە……...ە\n");
        prsyarakaniChalaki1Babaty2.add("٣. نەوزاد لە دوکان شت دەفرۆشێ" +
                "نەوزاد…………..ە\n");
        prsyarakaniChalaki1Babaty2.add("٤. کارزان مقاست و شانە بەکاردێنێ" +
                "کارزان……….ە\n");

        List<Chalaki> chalaki1Babat2 = new ArrayList<>();
        chalaki1Babat2.add(new Chalaki(0,
                null,
                prsyarakaniChalaki1Babaty2,
                ".خوێندکاری خۆشەویست بڕوانە ئەم وێنانە، لە پاشدا ناوەکانیان لە بۆشاییەکان دابنێ",
                0,
                R.raw.am_mrovana_kardakan_chalaky1,
                "(شوفێر،سەرتاش،بۆیاغچی، دوکاندار)"));

        List<String>prsyarakaniChalaki2babaty2 = new ArrayList<>();
        prsyarakaniChalaki2babaty2.add("................1");
        prsyarakaniChalaki2babaty2.add("................2");
        prsyarakaniChalaki2babaty2.add("................3");
        prsyarakaniChalaki2babaty2.add("................4");
        chalaki1Babat2.add(new Chalaki(1,
                context.getDrawable(R.drawable.special_chalaki_photo_animals),
                prsyarakaniChalaki2babaty2,
                "خوێندکاری خۆشەویست بڕوانە ئەم وێنانە، لە پاشدا ناوەکانیان لە بۆشاییەکان دابنێ",
                1,
                R.raw.am_mrovana_kardakan_chalaky2,
                null));

        chalakiakanList.add(new Chalakiakan(chalaki1Babat2,16));
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        List<String>prsyarakaniChalaki1Babaty3 = new ArrayList<>();
        prsyarakaniChalaki1Babaty3.add("تۆ لە خوێندنگە چۆن ڕۆژباش لە مامۆستا و هاوڕێکانت دەکەیت؟");
        prsyarakaniChalaki1Babaty3.add(" قوتابی خۆشەویست ،باسی ئەوەمان بۆ بکە، کە تۆ لەنێوان پشوی وانەکانتدا چی دەکەیت؟");


        List<Chalaki>chalakiBabaty3 = new ArrayList<>();
        chalakiBabaty3.add(new Chalaki(0
                ,null,prsyarakaniChalaki1Babaty3
        ,"مامۆستا دەپرسێت:"
                ,0
                ,R.raw.mndalyzhir_chalaky1
                ,null));

        chalakiBabaty3.add(new Chalaki(1,
                context.getDrawable(R.drawable.special_chalaki_photo_clock),
                null,
                "هەوڵبدە کاتەکانی ئەم کاتژمێرانەی خوارەوە بخوێنیتەوە:",
                1,
                R.raw.mndalyzhir_chalaky2,null));

        chalakiakanList.add(new Chalakiakan(chalakiBabaty3,21));
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        List<String>prsyarakaniChalaki1babaty4 = new ArrayList<>();
        prsyarakaniChalaki1babaty4.add("١. …..لەگەڵ گۆرانی لێدەدرێت");
        prsyarakaniChalaki1babaty4.add("٢. …...ئامێرێکی ژێدارە");
        prsyarakaniChalaki1babaty4.add("٣. مۆسیقا…..دەخاتە دڵی مرۆڤەوە");
        prsyarakaniChalaki1babaty4.add("٤. …...ئامێرێکی فوودارە");

        List<Chalaki>chalakiBabaty4 = new ArrayList<>();
        chalakiBabaty4.add(new Chalaki(24,
                null,
                prsyarakaniChalaki1babaty4,
                "قوتابی ژیر، بە یەکێک لە وشەکانی ناو لاکێشەکەی لای خوارەوە"+
                        "\n ئەم بۆشاییانە پڕ بکەوە:",
                0,
                //TODO : split mosiqa_wshawata_rahenan_chalaky
                R.raw.mosiqa_chalaky1,
                "(گیتاڕ، شمشاڵ، مۆسیقا، خۆشی)"));
        chalakiakanList.add(new Chalakiakan(chalakiBabaty4,24));

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        List<String>prsyarakaniChalaki1babaty5 = new ArrayList<>();
        prsyarakaniChalaki1babaty5.add("(قوتابخانە وەکو ماڵ وایە، دەبێ پارێزگاری بکەین و مامۆستاکانمان خۆش بوێ)");

        List<Chalaki> chalakiakanyBabaty5 = new ArrayList<>();
        chalakiakanyBabaty5.add(new Chalaki(0,
                null,
                prsyarakaniChalaki1babaty5,
                ":خوێندکاری خۆشەویست، سێجار ئەم ڕستانەی لای خوارەوە لە تێنووسەکەت بنووسەوە",
                0,
                R.raw.qutabxana_chalaky1,
                null
                ));
        List<String>prsyarakaniChalaki2Babaty5 = new ArrayList<>();
        prsyarakaniChalaki2Babaty5.add("(قوتابخانە ڕووناکیە، زانست چرایە، مامۆستا هاوڕێیە)");
        chalakiakanyBabaty5.add(new Chalaki(26,
                null,
                prsyarakaniChalaki2Babaty5,
                "ئەم ڕستانەی خواره‌وه‌ چوارجار لە تێنووسەکەت بنووسەوە، پاشان لەگەڵ مامۆستاکەتدا گفتووگۆیان لەسەر بکە",
                1,
                R.raw.qutabxana_chalaky2,
                null));
        chalakiakanList.add(new Chalakiakan(chalakiakanyBabaty5,26));


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
