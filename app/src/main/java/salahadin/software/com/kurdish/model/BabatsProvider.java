package salahadin.software.com.kurdish.model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import salahadin.software.com.kurdish.R;
import salahadin.software.com.kurdish.model.WshaWWata.WshaWWata;


public class BabatsProvider
{
    private static List<Babat> babats = new ArrayList<>();

    private static BabatsProvider sBabatProvider;



    public static Babat getBabat(int lapara)
    {
        for (int x = 0;x<babats.size();x++)
        {
            if (babats.get(x).getLaparayBabat() == lapara)
            {
                return babats.get(x);
            }

        }
        return null;
    }
    public static List<WshaWWata> getWshaWwatas1()
    {
        List<WshaWWata> wshaWWatas1 = new ArrayList<>();

        wshaWWatas1.add(new WshaWWata("وشه‌","په‌یڤ"));
        wshaWWatas1.add(new WshaWWata("وریا","هۆشیار هشیار"));
        wshaWWatas1.add(new WshaWWata("گوێ ڕایەڵ","گوهدار"));
        wshaWWatas1.add(new WshaWWata("دەسرەوێ","دەحەوێتەوە"));
        wshaWWatas1.add(new WshaWWata("نایانژاکێنم","نایان هەچڵێنم، تێکیان نادەم"));
        return wshaWWatas1;
    }

    public static List<WshaWWata> getWshaWwatas2()
    {
        List<WshaWWata> wshaWWatas1 = new ArrayList<>();

        wshaWWatas1.add(new WshaWWata("فێردەکات","فێری دەکا"));
        wshaWWatas1.add(new WshaWWata("پزئشک"," نۆژدار، پزیشک"));
        wshaWWatas1.add(new WshaWWata("نەخۆش","نەساغ"));
        wshaWWatas1.add(new WshaWWata("نژیار"," وەستای دروستکردنی خانوو"));
        wshaWWatas1.add(new WshaWWata("زەڤی","زەوی، ئەرد"));
        wshaWWatas1.add(new WshaWWata("نانەوا","نانپێژ"));
        wshaWWatas1.add(new WshaWWata("دەبرژێنێ(نان دەکا)","دەپێژێت"));
        return wshaWWatas1;
    }

    public static List<WshaWWata> getWshaWwatas3()
    {
        List<WshaWWata> wshaWWatas1 = new ArrayList<>();

        wshaWWatas1.add(new WshaWWata("منداڵ","زارۆک"));
        wshaWWatas1.add(new WshaWWata("ژیر","زیرەک"));
        wshaWWatas1.add(new WshaWWata("پاک","پاکژ، خاوێن"));
        wshaWWatas1.add(new WshaWWata("بەیانی","سپێدە"));
        wshaWWatas1.add(new WshaWWata("هەڵدەستم","ڕادەبم"));
        wshaWWatas1.add(new WshaWWata("قوتابی","خوێندکار"));
        wshaWWatas1.add(new WshaWWata("هێمنی","لەسەرخۆ"));
        wshaWWatas1.add(new WshaWWata("گوێ","گوه"));
        return wshaWWatas1;
    }


    public static List<WshaWWata> getWshaWwatas4()
    {
        List<WshaWWata> wshaWWatas1 = new ArrayList<>();

        wshaWWatas1.add(new WshaWWata("گۆرانی","ستران"));
        wshaWWatas1.add(new WshaWWata("هەڵپەڕکێ","گۆڤاند"));
        wshaWWatas1.add(new WshaWWata("کات","دەم، گاڤ"));
        wshaWWatas1.add(new WshaWWata("زەماوەند","شاهی"));
        wshaWWatas1.add(new WshaWWata("بە تەنیا","بتنێ"));
        return wshaWWatas1;
    }

    public static List<WshaWWata> getWshaWwatas5()
    {
        List<WshaWWata> wshaWWatas1 = new ArrayList<>();

        wshaWWatas1.add(new WshaWWata("مەڵبەند","بنکە"));
        wshaWWatas1.add(new WshaWWata("گشت","هەموو"));
        wshaWWatas1.add(new WshaWWata("سات","کات"));
        wshaWWatas1.add(new WshaWWata("وریا","هۆشیار"));
        wshaWWatas1.add(new WshaWWata("تەنگانە","تەنگاڤی"));
        wshaWWatas1.add(new WshaWWata("قوتابخانە","خوێندنگە"));
        return wshaWWatas1;
    }



    public static List<Babat> getBabatakan(Context context)
    {

        babats.add(new Babat("ساڵی نوێمان پیرۆز بێ","دەرچووی پۆلی یەکەمم" +
                "وا لە پۆلی دووەمم\n" +
                "       یاخوا پیرۆز بێ لێمان\n" +
                "خوێندنی ساڵی نوێمان\n" +
                "من قوتابییەکی وریام\n" +
                "گوێ ڕایەڵی مامۆستام\n" +
                "قوتابخانەم خۆشدەوێ\n" +
                "چونکە دڵ تیا دەسرەوێ\n" +
                "کەلوپەلی خاوێنم\n" +
                "هیچ کات نایانژاکێنم\n" +
                "هەر بژی قوتابخانە\n" +
                "کە مەڵبەندی ژیانە\n" +
                "بژی مامۆستاکانم\n" +
                "هاوڕێ زیرەکەکانم\n",
                context.getDrawable(R.drawable.my_image)
                ,3
                ,"له‌یلا مسته‌فا"
                ,getWshaWwatas1()
                ,0));

        babats.add(new Babat(context.getString(R.string.title_babat)
                ,null,
                context.getDrawable(R.drawable.asngar),
                16,
                null,
                getWshaWwatas2()
                ,0));


        babats.add(new Babat("منداڵی ژیر",
                "من منداڵێکی ژیرم،قوتابییەکی پاک و زیرەکم. بایانیان زوو لە خەو هەڵدەستم. ڕۆژباش لە ئەندامی خێزانەکەم دەکەم. بە ئاو و سابون دەست و دەم و چاوم دەشۆم. بە هێمنی نانی بەیانی دەخۆم، ئەوجا جلەکانم دەگۆڕم و جانتاکەم لە شان دەکەم و بەرەو قوتابخانە دەڕۆم. بە بێدەنگی لە پۆل دادەنیشم و گوێ لە مامۆستاکانم دەگرم"
                ,context.getDrawable(R.drawable.mndaly_zhir)
                ,21
                ,null
                ,getWshaWwatas3()
                , 0));



        babats.add(new Babat(
                "مۆسیقا",
                "مۆسیقا ئەو دەنگ و ئاوازە خۆشانەیە، کە لەگەڵ گۆرانی و شایی و هەڵپەڕکێ و بۆناکان لێ دەدرێت، لە ئامێرەکەنی مۆسیقاوە دەردەچێت و هەستی مرۆڤ دەجووڵێنێ، خۆشی و شادی دەخاتە دلی مرۆڤەوە و بەختیار و دڵخۆشی دەکات"
                , context.getDrawable(R.drawable.music)
                ,24
                ,null
                ,getWshaWwatas4()
                ,R.raw.mosiqa));

        babats.add(new Babat(
                "قوتابخانە",
                "قوتابخانە زۆر خۆشە\n" +
                        "مەڵبەندی بیرو هۆشە\n" +
                        "دەیپارێزم باخچەکەی\n" +
                        "دەرگا و شووشو و پانجەرەی\n" +
                        "قوتابخانە گشت کاتێ\n" +
                        "ڕووناکیمان دەداتێ\n" +
                        "فێرمان دەکا وریا بین\n" +
                        "بۆ تەنگانە ئازابین\n" +
                        "قوتابخانە زۆر خۆشە\n" +
                        "مەڵبەندی بیر و هۆشە\n",
                context.getDrawable(R.drawable.qutabxana),
                26,
                "لەتیف هەڵمەت",
                getWshaWwatas5(),
                0));


        return babats;
    }


}
