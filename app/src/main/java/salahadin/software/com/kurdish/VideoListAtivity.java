package salahadin.software.com.kurdish;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import salahadin.software.com.kurdish.model.VideoM.VedioModel;
import salahadin.software.com.kurdish.model.VideoM.VedioProvider;


public class VideoListAtivity extends AppCompatActivity
{

    private RecyclerView mVediosRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_list_ativity);

    }

    public void startListOfBabats(View view)
    {
        startVedio(R.raw.zhmaray_kurdi);
    }

    private void startVedio(int soundId)
    {
        Intent i = new Intent(getBaseContext(), VidioPlayingActivity.class);
        i.putExtra(Intent.EXTRA_INTENT,soundId);
        startActivity(i);
    }

    public void startAlphuBeSee(View view)
    {
    }

    public void startAlphuBeYak(View view)
    {
    }

    public void startZhmarakan(View view)
    {
    }

    public class VideoListAdapter extends RecyclerView.Adapter<VideoListAdapter.VideoListViewHolder>
    {
        private List<VedioModel> models;

        public VideoListAdapter(List<VedioModel> models)
        {
            this.models = models;
        }

        @NonNull
        @Override
        public VideoListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rahenan_list_item,parent,false);


            return new VideoListViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull VideoListViewHolder holder, int position)
        {
            holder.bind(models.get(position));
        }

        @Override
        public int getItemCount()
        {
            return models.size();
        }

        private class VideoListViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener
        {
            private VedioModel mVedioModel;
            private TextView mVideoTitleView;
            public VideoListViewHolder(@NonNull View itemView)
            {
                super(itemView);
                itemView.setOnClickListener(this);
                mVideoTitleView = itemView.findViewById(R.id.prsyar_view_id);

            }
            private void bind(VedioModel vedioModel)
            {
                mVedioModel = vedioModel;
                mVideoTitleView.setText(mVedioModel.getTitle());
            }

            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getBaseContext(), VidioPlayingActivity.class);
                i.putExtra(Intent.EXTRA_INTENT,mVedioModel.getmLink());
                startActivity(i);

            }
        }
    }
}
