package salahadin.software.com.kurdish;

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

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import salahadin.software.com.kurdish.model.Rahenan.Rahenan;
import salahadin.software.com.kurdish.model.Rahenan.RahenanakanLab;
import salahadin.software.com.kurdish.model.Rahenan.SpecialQuestions;

public class RahenanActivity extends AppCompatActivity
{
    private Rahenan mRahenan;
    private RecyclerView mRahenanRecyclerView;
    private RahenanAdapter mAdapter;
    private SpecialRahenanAdapter specialRahenanAdapter;
    private TextView mTitleTextView;
    private TextView mRahenanView;
    private int mPageNumber;
    private int mRahenanNumber;
    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rahenan);

        mPageNumber = getIntent().getIntExtra(Intent.EXTRA_INTENT,0);
        mRahenanNumber = getIntent().getIntExtra("hello",0);

        mTitleTextView = (TextView)findViewById(R.id.prsyar_chalaki_title_id);
        mRahenanView = (TextView)findViewById(R.id.chalaki_id_title);

        mRahenan = RahenanakanLab.getInstance(this).getRahenanakan(mRahenanNumber).getRahenans().get(mPageNumber);

        mTitleTextView.setText(mRahenan.getTitleRahenan());
        mRahenanView.append(UtilClass.convertToArabicNumber(mRahenan.getZhmarayRahenan()+1));

        if (mRahenan.getSpecialQuestionsList() == null)
        {
            initRahenan();
        }
        else
        {
            initSpecialRahenan();
        }
    }

    private void initSpecialRahenan()
    {

        mRahenanRecyclerView = (RecyclerView)findViewById(R.id.list_rahenan);
        specialRahenanAdapter = new SpecialRahenanAdapter(mRahenan.getSpecialQuestionsList());
        mRahenanRecyclerView.setAdapter(specialRahenanAdapter);
        mRahenanRecyclerView.setLayoutManager(new GridLayoutManager(this,3));
    }

    private void initRahenan()
    {

        mRahenanRecyclerView = (RecyclerView)findViewById(R.id.list_rahenan);
        mAdapter = new RahenanAdapter(mRahenan.getmPrsyarakan());
        mRahenanRecyclerView.setAdapter(mAdapter);
        mRahenanRecyclerView.setLayoutManager(new LinearLayoutManager(this));
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
        if (mRahenan.getmSound() != 0)
        {
            mMediaPlayer = MediaPlayer.create(this,mRahenan.getmSound());
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


















    public class SpecialRahenanAdapter extends RecyclerView.Adapter<SpecialRahenanAdapter.SpecialRahenanViewHolder>
    {
        private List<SpecialQuestions> mSpecialQuestions;

        public SpecialRahenanAdapter(List<SpecialQuestions> mSpecialQuestions)
        {
            this.mSpecialQuestions = mSpecialQuestions;
        }

        @NonNull
        @Override
        public SpecialRahenanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
        {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.special_rahenan_list_item,parent,false);

            return new SpecialRahenanViewHolder(v);
        }

        @Override
        public void onBindViewHolder(@NonNull SpecialRahenanViewHolder holder, int position)
        {
            holder.mPitView.setText(mSpecialQuestions.get(position).getmPit());
            holder.mWshaView.setText(mSpecialQuestions.get(position).getmWsh());
            holder.mImageView.setImageDrawable(mSpecialQuestions.get(position).getmWena());
        }

        @Override
        public int getItemCount() {
            return mSpecialQuestions.size();
        }

        private class SpecialRahenanViewHolder extends RecyclerView.ViewHolder
        {
            private TextView mWshaView;
            private TextView mPitView;
            private ImageView mImageView;
            public SpecialRahenanViewHolder(@NonNull View itemView)
            {
                super(itemView);
                mWshaView = (TextView)itemView.findViewById(R.id.wsha_rahenan_view_id);
                mPitView = (TextView)itemView.findViewById(R.id.pit_rahenan_view_id);
                mImageView = (ImageView)itemView.findViewById(R.id.wena_rahenan_view_id);
            }
        }
    }
























































    public class RahenanAdapter extends RecyclerView.Adapter<RahenanAdapter.RahenanViewHolder>
    {
        private List<String> prsyarakan;

        public RahenanAdapter(List<String> prsyarakan) {
            this.prsyarakan = prsyarakan;
        }

        @NonNull
        @Override
        public RahenanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
        {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rahenan_list_item,parent,false);
            return new RahenanViewHolder(v);
        }

        @Override
        public void onBindViewHolder(@NonNull RahenanViewHolder holder, int position)
        {
            holder.mPrsyarTextView.setText(prsyarakan.get(position));
        }

        @Override
        public int getItemCount()
        {
            return prsyarakan.size();
        }

        private class RahenanViewHolder extends RecyclerView.ViewHolder
        {
            private TextView mPrsyarTextView;
            public RahenanViewHolder(@NonNull View itemView)
            {
                super(itemView);
                mPrsyarTextView = (TextView)itemView.findViewById(R.id.prsyar_view_id);
            }
        }
    }

}
