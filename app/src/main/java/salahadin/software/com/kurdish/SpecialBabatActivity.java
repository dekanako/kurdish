package salahadin.software.com.kurdish;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import salahadin.software.com.kurdish.model.Babat;
import salahadin.software.com.kurdish.model.BabatsProvider;
import salahadin.software.com.kurdish.model.Rahenan.Rahenan;
import salahadin.software.com.kurdish.model.Rahenan.RahenanakanLab;

public class SpecialBabatActivity extends AppCompatActivity
{

    private static final String EXTRA_INT = "hello" ;
    private Babat mBabat;
    private int mPage;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_special_babat);

        mPage = getIntent().getIntExtra(Intent.EXTRA_INTENT,0);
        mBabat = BabatsProvider.getBabat(mPage);

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
            case 123:
                return true;
            default:
                Intent intent2 = new Intent(this,RahenanActivity.class);
                intent2.putExtra(EXTRA_INT,mBabat.getLaparayBabat());
                intent2.putExtra(Intent.EXTRA_INTENT,item.getItemId());
                startActivity(intent2);
                return super.onOptionsItemSelected(item);
        }

    }

}
