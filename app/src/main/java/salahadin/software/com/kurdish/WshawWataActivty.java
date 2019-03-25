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
import salahadin.software.com.kurdish.model.BabatsProvider;
import salahadin.software.com.kurdish.model.WshaWWata;

public class WshawWataActivty extends AppCompatActivity
{
    private RecyclerView mRecyclerView;
    private WshaWwataAdapter mAdapter;
    private int mPage;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wshaw_wata_activty);
        mPage = getIntent().getIntExtra(Intent.EXTRA_INTENT,0);

        mRecyclerView = (RecyclerView)findViewById(R.id.list_wsha_wata);
        mAdapter = new WshaWwataAdapter(BabatsProvider.getBabat(mPage).getWshaWWata());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(mAdapter);

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
