package salahadin.software.com.kurdish.model.Rahenan;


import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import salahadin.software.com.kurdish.R;

public class RahenanakanLab
{
    private static RahenanakanLab ourInstance;

    private  List<Rahenanakan> rahenans = new ArrayList<>();
    public static RahenanakanLab getInstance(Context context)
    {
        if (ourInstance == null)
        {
            ourInstance = new RahenanakanLab(context);
        }
        return ourInstance;
    }

    private RahenanakanLab(Context context)
    {
        initRahenans(context);
    }

    private  void initRahenans(Context context)
    {
        /////////////////////////////////////////
        List<String> prsyarakan = new ArrayList<>();
        prsyarakan.add("١. ………. نان دەبرژێنێت");
        prsyarakan.add("٢. ……..پەنجەرە دروستدەکات");
        prsyarakan.add("٣……... گۆشت دەفرۆشێت");
        prsyarakan.add("٤. جوتیار…..دەکێڵێت");
        prsyarakan.add("٥…….. کورسی دروست دەکات");
        prsyarakan.add("٦. پزئشک….چارە دەکات");
        prsyarakan.add("٧………. دیوار دروستدەکات");
        prsyarakan.add("٨. مامۆستا خوێندکار…….دەکات");

        List<Rahenan> karkrdn = new ArrayList<>();
        karkrdn.add(new Rahenan(null,
                        prsyarakan,
                        "خویندکاری خۆشەویست، ئەم ڕستانەی خوارەوە تەواو بکە:"
                        ,0
                        ,0,0));
        rahenans.add(new Rahenanakan(karkrdn,16));
        //////////////////////////////////////////

        List<String> prsyarakan2 = new ArrayList<>();
        prsyarakan2.add("١. قوتابی کەی لە خەو هەڵدەستێ؟");
        prsyarakan2.add("٢. دەبێ چۆن نان بخۆین؟");
        prsyarakan2.add("٣. دەبێ لەناو پۆل چی بکەین؟");

        List<String> prsyarakan3 = new ArrayList<>();
        prsyarakan3.add("١. بەیانیان زوو ……..هەڵدەستم");
        prsyarakan3.add("٢. بە…..دەست و دەم و چاوم دەشۆم");
        prsyarakan3.add("٣. گوێ لە…...دەگرم");

        List<Rahenan>rahenansQutabyZhir = new ArrayList<>();
        rahenansQutabyZhir.add((new Rahenan(null
                ,prsyarakan2
                ,"وەڵامی ئەم پرسیارانەی خوارەوە بدەوە:"
                ,0
                ,21,0)));

        rahenansQutabyZhir.add(new Rahenan(null
                ,prsyarakan3
                ,"ئەم بۆشاییانەی خوارەوە پڕ بکەوە:"
                ,1
                ,22
                ,0));
        rahenans.add(new Rahenanakan(rahenansQutabyZhir,21));
        ////////////////////////////////////////////////////////
        List<String>prsyarakanyMosiqa = new ArrayList<>();
        prsyarakanyMosiqa.add("١. دەف و تەپڵ بەچی لێدەدرێن؟");
        prsyarakanyMosiqa.add("٢. شمشاڵ بە چی لێدەدرێت؟");

        List<Rahenan> rahenanMosiqa = new ArrayList<>();
        rahenanMosiqa.add(new Rahenan(
                null,
                prsyarakanyMosiqa,
                "وەڵامی ئەم پرسیارانە بدەوە",
                0,
                24,0));
        rahenans.add(new Rahenanakan(rahenanMosiqa,24));
        ////////////////////////////////////////////////////////
        List<String>prsyarakanyQutabxana = new ArrayList<>();
        prsyarakanyQutabxana.add("…...١. قوتابخانە زۆر");
        prsyarakanyQutabxana.add("……...مەڵبەندی");
        prsyarakanyQutabxana.add("…………..٢. دەیپارێزم ……..دەرگا و شووسو و");
        prsyarakanyQutabxana.add("٣. `وتابخانە گشت کاتی…..دەداتێ");
        List<Rahenan> rahenanyQutabxana = new ArrayList<>();
        rahenanyQutabxana.add(new Rahenan(null,
                prsyarakanyQutabxana,
                "خوێندکاری خۆشەویست، ئەم بۆشاییانەی خوارەوە بە وشەی گونجاو پڕ بکەوە"
                ,0
                ,0
                ,0));
        rahenans.add(new Rahenanakan(rahenanyQutabxana,26));
        ////////////////////////////////////////////////////////
        List<Rahenan> rahenanyYakamBabat = new ArrayList<>();
        List<SpecialQuestions> specialQuestions = new ArrayList<>();
        specialQuestions.add(new SpecialQuestions("...او","ئ",context.getDrawable(R.drawable.hawina_hawar),0));
        specialQuestions.add(new SpecialQuestions("كه‌ڵه‌با...","ب",context.getDrawable(R.drawable.kalasher),0));
        specialQuestions.add(new SpecialQuestions("قا...","پ",context.getDrawable(R.drawable.dawry),0));
        specialQuestions.add(new SpecialQuestions("په‌...","ت",context.getDrawable(R.drawable.sama3ay_dktor),0));
        specialQuestions.add(new SpecialQuestions("سا‌...","ج",context.getDrawable(R.drawable.special_rahenan_photo_agr),0));
        specialQuestions.add(new SpecialQuestions("قا...","چ",context.getDrawable(R.drawable.special_rahenan_photo_qach),0));
        specialQuestions.add(new SpecialQuestions("تیمسا‌...","ح",context.getDrawable(R.drawable.special_rahenan_photo_tmsa7),0));
        specialQuestions.add(new SpecialQuestions("شا‌...","خ",context.getDrawable(R.drawable.special_rahenan_photo_shax),0));
        specialQuestions.add(new SpecialQuestions("‌...ه‌رزی","د",context.getDrawable(R.drawable.special_rahenan_darzi),0));
        specialQuestions.add(new SpecialQuestions("‌ك...","ر",context.getDrawable(R.drawable.special_rahenan_kar),0));
        specialQuestions.add(new SpecialQuestions("‌بازا...","ڕ",context.getDrawable(R.drawable.special_rahenan_bazar),0));
        specialQuestions.add(new SpecialQuestions("‌ب...ن","ز",context.getDrawable(R.drawable.special_rahenan_bzn),0));
        specialQuestions.add(new SpecialQuestions("‌ژ...یشك","ژ",context.getDrawable(R.drawable.special_rahenan_zhuzhk),0));
        specialQuestions.add(new SpecialQuestions("‌پا...س","س",context.getDrawable(R.drawable.special_rahenan_pas),0));specialQuestions.add(new SpecialQuestions("‌...ه‌رزی","د",context.getDrawable(R.drawable.special_rahenan_darzi),0));
        specialQuestions.add(new SpecialQuestions("‌ڕ...ه‌ش","ش",context.getDrawable(R.drawable.special_rahenan_rash),0));
        specialQuestions.add(new SpecialQuestions("‌با...ع","ع",context.getDrawable(R.drawable.special_rahenan_ba3),0));
        specialQuestions.add(new SpecialQuestions("‌ق...","غ",context.getDrawable(R.drawable.special_rahenan_qagh),0));
        specialQuestions.add(new SpecialQuestions("‌كه...","ك",context.getDrawable(R.drawable.special_rahenan_kaf),0));
        specialQuestions.add(new SpecialQuestions("‌دا...","ڤ",context.getDrawable(R.drawable.special_rahenan_dav),0));
        specialQuestions.add(new SpecialQuestions("‌لا...","ق",context.getDrawable(R.drawable.special_rahenan_laq),0));
        specialQuestions.add(new SpecialQuestions("‌مریش...","ك",context.getDrawable(R.drawable.special_rahenan_mryshk),0));
        specialQuestions.add(new SpecialQuestions("‌ڕه‌...","گ",context.getDrawable(R.drawable.special_rahenan_rag),0));
        specialQuestions.add(new SpecialQuestions("‌...مه‌","ل",context.getDrawable(R.drawable.special_rahenan_mal),0));
        specialQuestions.add(new SpecialQuestions("ده‌...","م",context.getDrawable(R.drawable.special_rahenan_dam),0));
        specialQuestions.add(new SpecialQuestions("...ه‌رمێ","ه",context.getDrawable(R.drawable.special_rahenan_harme),0));
        specialQuestions.add(new SpecialQuestions("‌م...ر","ا",context.getDrawable(R.drawable.special_rahenan_mar),0));
        specialQuestions.add(new SpecialQuestions("ب...راز","ه‌",context.getDrawable(R.drawable.special_rahenan_baraz),0));
        specialQuestions.add(new SpecialQuestions("شه‌...","و",context.getDrawable(R.drawable.special_rahenan_shaw),0));
        specialQuestions.add(new SpecialQuestions("گ...زه‌","ۆ",context.getDrawable(R.drawable.special_rahenan_goza),0));
        specialQuestions.add(new SpecialQuestions("ژ...ر","وو",context.getDrawable(R.drawable.special_rahenan_zhur),0));
        specialQuestions.add(new SpecialQuestions("مراو...","ی",context.getDrawable(R.drawable.special_rahenan_mrawy),0));
        specialQuestions.add(new SpecialQuestions("‌د...","ێ",context.getDrawable(R.drawable.special_rahenan_de),0));



        List<SpecialQuestions> specialQuestions1 = new ArrayList<>();
        specialQuestions1.add(new SpecialQuestions("تۆ...","پ",context.getDrawable(R.drawable.special_rahenan_photo_shax),0));



        rahenanyYakamBabat.add(new Rahenan(0,
                "قوتابیانی خۆشەویست، ئەم وشانەی خوارەوە بە پیتێکی گونجاو ته‌واو بكه‌" ,
                0,
                specialQuestions,
                0));

        rahenanyYakamBabat.add(new Rahenan(1,
                "تکایە، سەیری ئەم وێنانەی لای خوارەوە بکەو بە دەنگ ناوەکانیان دەرببڕە، پاشان بە پیتێکی گونجاو وشەکان تەواو بکە",1,specialQuestions1,0));
        rahenans.add(new Rahenanakan(rahenanyYakamBabat,3));
    }

    public Rahenanakan getRahenanakan(int para)
    {
        for (int x = 0;x < rahenans.size(); x++)
        {
            if (rahenans.get(x).getZhmarayLapara() == para)
            {
                return rahenans.get(x);
            }
        }
        return null;
    }
}
