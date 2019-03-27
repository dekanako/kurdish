package salahadin.software.com.kurdish.model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import salahadin.software.com.kurdish.R;



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
                ,0));

        babats.add(new Babat(context.getString(R.string.title_babat)
                ,null,
                context.getDrawable(R.drawable.asngar),
                16,
                null
                ,0));


        babats.add(new Babat("منداڵی ژیر",
                "من منداڵێکی ژیرم،قوتابییەکی پاک و زیرەکم. بایانیان زوو لە خەو هەڵدەستم. ڕۆژباش لە ئەندامی خێزانەکەم دەکەم. بە ئاو و سابون دەست و دەم و چاوم دەشۆم. بە هێمنی نانی بەیانی دەخۆم، ئەوجا جلەکانم دەگۆڕم و جانتاکەم لە شان دەکەم و بەرەو قوتابخانە دەڕۆم. بە بێدەنگی لە پۆل دادەنیشم و گوێ لە مامۆستاکانم دەگرم"
                ,context.getDrawable(R.drawable.mndaly_zhir)
                ,21
                ,null
                , 0));



        babats.add(new Babat(
                "مۆسیقا",
                "مۆسیقا ئەو دەنگ و ئاوازە خۆشانەیە، کە لەگەڵ گۆرانی و شایی و هەڵپەڕکێ و بۆناکان لێ دەدرێت، لە ئامێرەکەنی مۆسیقاوە دەردەچێت و هەستی مرۆڤ دەجووڵێنێ، خۆشی و شادی دەخاتە دلی مرۆڤەوە و بەختیار و دڵخۆشی دەکات"
                , context.getDrawable(R.drawable.music)
                ,24
                ,null
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
                0));


        return babats;
    }


}
