package salahadin.software.com.kurdish;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import salahadin.software.com.kurdish.model.WshaWWata.WshaWWata;
import salahadin.software.com.kurdish.model.WshaWWata.WshaWWataProvider;
import salahadin.software.com.kurdish.model.WshaWWata.WshaWWatakan;

public class WshawWataActivty extends AppCompatActivity
{
    private RecyclerView mRecyclerView;
    private WshaWwataAdapter mAdapter;
    private int mPage;
    private WshaWWatakan mWshaWWatakan;
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wshaw_wata_activty);
        mPage = getIntent().getIntExtra(Intent.EXTRA_INTENT,0);
        mWshaWWatakan = WshaWWataProvider.getInstance().getWshawWatakan(mPage);
        mRecyclerView = (RecyclerView)findViewById(R.id.list_wsha_wata);
        mAdapter = new WshaWwataAdapter(WshaWWataProvider.getInstance().getWshawWatakan(mPage).getWshaWWatas());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(mAdapter);

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
        if (mWshaWWatakan.getmSound() != 0)
        {
            mMediaPlayer = MediaPlayer.create(this,mWshaWWatakan.getmSound());
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
    private class WshaWwataAdapter extends RecyclerView.Adapter<WshaWwataAdapter.WshaWwataViewHolder>
    {
        private List<WshaWWata> wshaWWatas;

        public WshaWwataAdapter(List<WshaWWata> wshaWWatas)
        {
            this.wshaWWatas = wshaWWatas;
        }

        @NonNull
        @Override
        public WshaWwataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
        {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            View v = inflater.inflate(R.layout.wsha_list_item,parent,false);

            return new WshaWwataViewHolder(v);
        }

        @Override
        public void onBindViewHolder(@NonNull WshaWwataViewHolder holder, int position)
        {
            WshaWWata wshaWWata = wshaWWatas.get(position);
            holder.mWshaTextView.setText(wshaWWata.getWsh());
            holder.mWataTextView.setText(wshaWWata.getWata());
        }

        @Override
        public int getItemCount()
        {
            return wshaWWatas.size();
        }

        private class WshaWwataViewHolder extends RecyclerView.ViewHolder
        {
            private TextView mWshaTextView;
            private TextView mWataTextView;
            public WshaWwataViewHolder(@NonNull View itemView)
            {
                super(itemView);
                mWataTextView = (TextView)itemView.findViewById(R.id.wata_view_id);
                mWshaTextView = (TextView)itemView.findViewById(R.id.wsha_view_id);
            }
        }

    }
}
