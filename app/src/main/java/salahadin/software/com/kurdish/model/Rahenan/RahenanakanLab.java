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
                        ,0,
                R.raw.am_mrovana_kardakan_rahenan1));
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
                ,21,R.raw.mndalyzhir_rahenan1)));

        rahenansQutabyZhir.add(new Rahenan(null
                ,prsyarakan3
                ,"ئەم بۆشاییانەی خوارەوە پڕ بکەوە:"
                ,1
                ,22
                ,R.raw.mndalyzhir_rahenan2));
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
                24,R.raw.mosiqa_rahenan4942109581945713819));
        rahenans.add(new Rahenanakan(rahenanMosiqa,24));
        ////////////////////////////////////////////////////////
        List<String>prsyarakanyQutabxana = new ArrayList<>();
        prsyarakanyQutabxana.add("١. قوتابخانە زۆر…...");
        prsyarakanyQutabxana.add(".مەڵبەندی……..");
        prsyarakanyQutabxana.add(".٢. دەیپارێزم…………. .دەرگا و شووشه‌ و…….");
        prsyarakanyQutabxana.add("٣. قوتابخانە گشت کاتی…..دەداتێ");
        List<Rahenan> rahenanyQutabxana = new ArrayList<>();
        rahenanyQutabxana.add(new Rahenan(null,
                prsyarakanyQutabxana,
                "خوێندکاری خۆشەویست، ئەم بۆشاییانەی خوارەوە بە وشەی گونجاو پڕ بکەوە"
                ,0
                ,0
                ,R.raw.qutabxana_rahenan));
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
        specialQuestions.add(new SpecialQuestions("‌...یشك","ژ",context.getDrawable(R.drawable.special_rahenan_zhuzhk),0));
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
        specialQuestions1.add(new SpecialQuestions("‌تۆ...","پ",context.getDrawable(R.drawable.special_chalaki_top),0));
        specialQuestions1.add(new SpecialQuestions("كه‌با...","ب",context.getDrawable(R.drawable.special_chalaki_kabab),0));
        specialQuestions1.add(new SpecialQuestions("‌لوو...","ت",context.getDrawable(R.drawable.special_chalaki_lut),0));
        specialQuestions1.add(new SpecialQuestions("...ێ","پ",context.getDrawable(R.drawable.special_chalaki_pe),0));
        specialQuestions1.add(new SpecialQuestions("‌...ه‌رد","ب",context.getDrawable(R.drawable.special_chalaki_bard),0));
        specialQuestions1.add(new SpecialQuestions("..‌.رێ","ت",context.getDrawable(R.drawable.special_chalaki_tre),0));
        specialQuestions1.add(new SpecialQuestions("‌ژ...","ن",context.getDrawable(R.drawable.special_chalaki_zhn),0));
        specialQuestions1.add(new SpecialQuestions("‌دا...","س",context.getDrawable(R.drawable.special_chalaki_das),0));
        specialQuestions1.add(new SpecialQuestions("‌دارتا...","ش",context.getDrawable(R.drawable.special_chalaki_dartash),0));
        specialQuestions1.add(new SpecialQuestions("‌...ۆ","ن",context.getDrawable(R.drawable.special_chalaki_no),0));

        specialQuestions1.add(new SpecialQuestions("ما‌...ی","س",context.getDrawable(R.drawable.special_chalaki_masi),0));
        specialQuestions1.add(new SpecialQuestions("...یر","ش",context.getDrawable(R.drawable.special_chalaki_shyr),0));
        specialQuestions1.add(new SpecialQuestions("مه‌‌...","ل",context.getDrawable(R.drawable.special_chalaki_cholaka),0));
        specialQuestions1.add(new SpecialQuestions("گو‌...","ڵ",context.getDrawable(R.drawable.special_chalaki_gul),0));
        specialQuestions1.add(new SpecialQuestions("‌نؤ...","ك",context.getDrawable(R.drawable.special_chalaki_nok),0));
        specialQuestions1.add(new SpecialQuestions("‌...ێۆ","ل",context.getDrawable(R.drawable.special_chalaki_lew),0));
        specialQuestions1.add(new SpecialQuestions("‌هه‌...ۆ","ڵ",context.getDrawable(R.drawable.special_chalaki_halo),0));
        specialQuestions1.add(new SpecialQuestions("‌...ه‌و","ك",context.getDrawable(R.drawable.special_chalaki_kaw),0));
        specialQuestions1.add(new SpecialQuestions("‌...گ","سه‌",context.getDrawable(R.drawable.special_chalaki_sag),0));
        specialQuestions1.add(new SpecialQuestions("‌...او","ئ",context.getDrawable(R.drawable.special_chalaki_aw),0));

        specialQuestions1.add(new SpecialQuestions("مز‌را...","ح",context.getDrawable(R.drawable.special_chalaki_mzra7),0));
        specialQuestions1.add(new SpecialQuestions("...ه‌ڵا‌","گ",context.getDrawable(R.drawable.special_chalaki_gala),0));
        specialQuestions1.add(new SpecialQuestions("‌...ه‌ستێره‌","ئ",context.getDrawable(R.drawable.special_chalaki_astera),0));
        specialQuestions1.add(new SpecialQuestions("‌...ه‌ڵوا","ح",context.getDrawable(R.drawable.special_chalaki_7alwa),0));
        specialQuestions1.add(new SpecialQuestions("به‌ر‌...","خ",context.getDrawable(R.drawable.special_chalaki_barx),0));
        specialQuestions1.add(new SpecialQuestions("ور‌...","چ",context.getDrawable(R.drawable.special_chalaki_wrch),0));
        specialQuestions1.add(new SpecialQuestions("ته‌نا‌...","ف",context.getDrawable(R.drawable.special_chalaki_tanaf),0));
        specialQuestions1.add(new SpecialQuestions("‌...ورما","خ",context.getDrawable(R.drawable.special_chalaki_xurma),0));
        specialQuestions1.add(new SpecialQuestions("‌...او","چ",context.getDrawable(R.drawable.special_chalaki_chaw),0));


        specialQuestions1.add(new SpecialQuestions("‌...ڕۆكه‌","ف",context.getDrawable(R.drawable.special_chalaki_froka),0));
        specialQuestions1.add(new SpecialQuestions("بؤ‌...","ق",context.getDrawable(R.drawable.special_chalaki_boq),0));
        specialQuestions1.add(new SpecialQuestions("مرۆ‌...","ڤ",context.getDrawable(R.drawable.special_chalaki_mrov),0));
        specialQuestions1.add(new SpecialQuestions("ن‌...ن","ا",context.getDrawable(R.drawable.special_chalaki_nan),0));
        specialQuestions1.add(new SpecialQuestions("‌...از","ق",context.getDrawable(R.drawable.special_chalaki_qaz),0));
        specialQuestions1.add(new SpecialQuestions("ش‌...ان","ڤ",context.getDrawable(R.drawable.special_chalaki_shwan),0));
        specialQuestions1.add(new SpecialQuestions("‌د...ر","ا",context.getDrawable(R.drawable.special_chalaki_dar),0));
        specialQuestions1.add(new SpecialQuestions("ده‌رز‌...","ی",context.getDrawable(R.drawable.special_chalaki_darzi),0));
        specialQuestions1.add(new SpecialQuestions("هه‌رم‌...","ێ",context.getDrawable(R.drawable.special_chalaki_harme),0));

        specialQuestions1.add(new SpecialQuestions("‌...ه‌‌نار","ه",context.getDrawable(R.drawable.special_chalaki_hanar),0));
        specialQuestions1.add(new SpecialQuestions("...اری","ی",context.getDrawable(R.drawable.special_chalaki_mndal),0));
        specialQuestions1.add(new SpecialQuestions("ش...ر","ێ",context.getDrawable(R.drawable.special_chalaki_sher),0));
        specialQuestions1.add(new SpecialQuestions("به‌‌...ار","ھ",context.getDrawable(R.drawable.special_chalaki_bahar),0));
        specialQuestions1.add(new SpecialQuestions("ھ‌...ور","ه‌",context.getDrawable(R.drawable.special_chalaki_hawr),0));
        specialQuestions1.add(new SpecialQuestions("با‌...","ع",context.getDrawable(R.drawable.special_chalaki_ba3),0));
        specialQuestions1.add(new SpecialQuestions("با‌...","غ",context.getDrawable(R.drawable.special_chalaki_bagh),0));
        specialQuestions1.add(new SpecialQuestions("ڕ‌...","م",context.getDrawable(R.drawable.special_chalaki_rm),0));

        specialQuestions1.add(new SpecialQuestions("ز‌...رد","ه",context.getDrawable(R.drawable.special_chalaki_zard),0));
        specialQuestions1.add(new SpecialQuestions("‌...ه‌ره‌ب","ع",context.getDrawable(R.drawable.special_chalaki_arab),0));
        specialQuestions1.add(new SpecialQuestions("‌...اردان","غ",context.getDrawable(R.drawable.special_chalaki_ghardan),0));
        specialQuestions1.add(new SpecialQuestions("‌...ۆم","م",context.getDrawable(R.drawable.special_chalaki_mom),0));




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
