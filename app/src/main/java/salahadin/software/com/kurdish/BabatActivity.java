package salahadin.software.com.kurdish;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import salahadin.software.com.kurdish.model.Babat;
import salahadin.software.com.kurdish.model.BabatsProvider;
import salahadin.software.com.kurdish.model.Chalaki.Chalaki;
import salahadin.software.com.kurdish.model.Chalaki.ChalakiakanLab;
import salahadin.software.com.kurdish.model.Rahenan.Rahenan;
import salahadin.software.com.kurdish.model.Rahenan.RahenanakanLab;

public class BabatActivity extends AppCompatActivity
{

    private static final String EXTRA_INT = "hello" ;
    private Babat mBabat;
    private int mPage;
    private TextView mNawyBabat;
    private TextView mContentyBabat;
    private ImageView mWenayBabat;
    private MediaPlayer mMediaPlayer;
    private boolean isRahenanPressed;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babat);

        mPage = getIntent().getIntExtra(Intent.EXTRA_INTENT,0);
        mBabat = BabatsProvider.getBabat(mPage);
        System.out.println("TESTTT " + mPage);

        mNawyBabat = (TextView) findViewById(R.id.nawy_babat_view);
        mContentyBabat = (TextView)findViewById(R.id.content_view);
        mWenayBabat = (ImageView)findViewById(R.id.wenay_babat);

        mNawyBabat.setText(mBabat.getNawyBabat());
        mWenayBabat.setImageDrawable(mBabat.getWenayBabat());
        mContentyBabat.setText(mBabat.getContentyBabat());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.babat_menu,menu);
        int size = RahenanakanLab.getInstance(this).getRahenanakan(mPage).getRahenans().size();
        if (size > 0)
        {
            List<Rahenan> rahenans = RahenanakanLab.getInstance(this).getRahenanakan(mPage).getRahenans();
            SubMenu subMenu = menu.addSubMenu(Menu.NONE,123,Menu.NONE,"ڕاهێنانه‌كان");
            for (int z = 0;z<size;z++)
            {
                int num = rahenans.get(z).getZhmarayRahenan() + 1;
                subMenu.add(Menu.NONE,z,Menu.NONE,"ڕاهێنانی " + num );
            }
        }
        int sizeChalaki = ChalakiakanLab.getInstance(this).getChalakiakan(mPage).getmChalakiakan().size();
        if (sizeChalaki > 0)
        {
            List<Chalaki> chalakis = ChalakiakanLab.getInstance(this).getChalakiakan(mPage).getmChalakiakan();
            SubMenu subMenu = menu.addSubMenu(Menu.NONE,321,Menu.NONE,"چالاكیه‌كان");
            for (int z = 0;z<sizeChalaki;z++)
            {
                int num = chalakis.get(z).getLaparayChalaki() + 1;
                subMenu.add(Menu.NONE,z,Menu.NONE," چالاكی " + num);
            }
        }
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.wsha_wata_menu_id:
                Intent intent = new Intent(this,WshawWataActivty.class);
                intent.putExtra(Intent.EXTRA_INTENT,mPage);
                startActivity(intent);
                return true;
            case R.id.sound_id:
                return true;
            case 123:
                isRahenanPressed = true;
                return true;
            case 321:
                isRahenanPressed = false;
                return true;
            default:
                if (isRahenanPressed)
                {
                    Intent intent2 = new Intent(this,RahenanActivity.class);
                    intent2.putExtra(EXTRA_INT,mBabat.getLaparayBabat());
                    intent2.putExtra(Intent.EXTRA_INTENT,item.getItemId());
                    startActivity(intent2);
                }
                else
                {
                    Intent intent2 = new Intent(this,ChalakiActivity.class);
                    intent2.putExtra(EXTRA_INT,mBabat.getLaparayBabat());
                    intent2.putExtra(Intent.EXTRA_INTENT,item.getItemId());
                    startActivity(intent2);
                }

                return true;
        }

    }

    @Override
    protected void onStop()
    {
        if (mMediaPlayer != null )
        {
            if (mMediaPlayer.isPlaying())
            {
                mMediaPlayer.stop();
            }
        }
        super.onStop();
    }
}
