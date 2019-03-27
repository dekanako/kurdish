package salahadin.software.com.kurdish;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import salahadin.software.com.kurdish.model.Chalaki.Chalaki;
import salahadin.software.com.kurdish.model.Chalaki.ChalakiakanLab;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ChalakiActivity extends AppCompatActivity
{
    private Chalaki mChalaki;
    private int mPage;
    private int mChalakiNumber;
    private TextView mChalakiTextView;
    private TextView mPrsyarTextView;
    private TextView mHintTextView;
    private RecyclerView mRahenanRecyclerView;
    private ChalakiAdapter mAdapter;
    private ImageView imageView;
    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        mPage = getIntent().getIntExtra(Intent.EXTRA_INTENT,0);
        mChalakiNumber = getIntent().getIntExtra("hello",0);
        mChalaki = ChalakiakanLab.getInstance(this).getChalakiakan(mChalakiNumber).getmChalakiakan().get(mPage);

        super.onCreate(savedInstanceState);

        if (mChalaki.getmDrawable() == null)
        {
            setContentView(R.layout.activity_chalaki);
        }
        else
        {
            setContentView(R.layout.activity_special_chalaki);
            imageView = findViewById(R.id.chalaki_wena);
            imageView.setImageDrawable(mChalaki.getmDrawable());

        }



        mChalakiTextView = findViewById(R.id.chalaki_id_title);
        mPrsyarTextView = findViewById(R.id.prsyar_chalaki_title_id);
        mHintTextView = findViewById(R.id.hint_chalaki_id);

        mChalakiTextView.append(UtilClass.convertToArabicNumber(mChalaki.getZhmarayChalaki()+ 1));
        mHintTextView.setText(mChalaki.getHintyChalaki());
        mPrsyarTextView.setText(mChalaki.getTitleChalaki());
        initChalakiList();
    }

    private void initChalakiList()
    {
        if (mChalaki.getmPrsyarakan() != null)
        {

            mRahenanRecyclerView = findViewById(R.id.list_chalaki);
            mAdapter = new ChalakiAdapter(mChalaki.getmPrsyarakan());
            mRahenanRecyclerView.setAdapter(mAdapter);
            mRahenanRecyclerView.setLayoutManager(new LinearLayoutManager(this));
            mRahenanRecyclerView.setHasFixedSize(true);
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_play_sound,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.play_sound_menu_item:
                playAudioOrShowToast();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }

    private void playAudioOrShowToast()
    {
        if (mMediaPlayer == null)
        {
            initMediaPlayer();
        }
        if (mMediaPlayer != null)
        {
            if (!mMediaPlayer.isPlaying())
            {
                mMediaPlayer.start();
            }
        }
        else
        {
            Toast.makeText(this,"ئه‌م بابه‌ته‌ ده‌نگی نیه‌",Toast.LENGTH_SHORT).show();
        }
    }

    private void initMediaPlayer()
    {
        if (mChalaki.getmSound() != 0)
        {
            mMediaPlayer = MediaPlayer.create(this,mChalaki.getmSound());
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
    public class ChalakiAdapter extends RecyclerView.Adapter<ChalakiAdapter.ChalakiViewHolder>
    {

        private List<String>mQuestions;

        public ChalakiAdapter(List<String> mQuestions)
        {
            this.mQuestions = mQuestions;
        }

        @NonNull
        @Override
        public ChalakiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rahenan_list_item,parent,false);

            return new ChalakiViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ChalakiViewHolder holder, int position)
        {
            holder.mPrsyarTextView.setText(mQuestions.get(position));
        }

        @Override
        public int getItemCount()
        {
            return mQuestions.size();
        }

        private class ChalakiViewHolder extends RecyclerView.ViewHolder
        {
            private TextView mPrsyarTextView;
            public ChalakiViewHolder(@NonNull View itemView)
            {
                super(itemView);
                mPrsyarTextView = itemView.findViewById(R.id.prsyar_view_id);
            }
        }
    }
}
