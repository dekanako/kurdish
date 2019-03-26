package salahadin.software.com.kurdish;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
//
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import salahadin.software.com.kurdish.model.Babat;
import salahadin.software.com.kurdish.model.BabatsProvider;


public class MainActivity extends AppCompatActivity
{
    private RecyclerView mListBabats;
    private BabatakanAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAdapter = new BabatakanAdapter(BabatsProvider.getBabatakan(this));
        mListBabats = (RecyclerView)findViewById(R.id.list);
        mListBabats.setLayoutManager(new LinearLayoutManager(this));
        mListBabats.setAdapter(mAdapter);

    }




    private class BabatakanAdapter extends RecyclerView.Adapter<BabatakanAdapter.BabatViewHolder>
    {

        private List<Babat> babats;

        public BabatakanAdapter(List<Babat> babats)
        {
            this.babats = babats;
        }

        @NonNull
        @Override
        public BabatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
        {
            Context context = parent.getContext();
            LayoutInflater inflater = LayoutInflater.from(context);

            // Inflate the custom layout
            final View contactView = inflater.inflate(R.layout.list_item, parent, false);
            return new BabatViewHolder(contactView);
        }

        @Override
        public void onBindViewHolder(@NonNull BabatViewHolder holder, int position)
        {
            holder.bind(babats.get(position));
        }

        @Override
        public int getItemCount()
        {
            return babats.size();
        }

        private class BabatViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener
        {
            private Babat mBabat;

            private ImageView babatImageView;
            private TextView nawyBabatView;
            private TextView nawyHunarmand;
            public BabatViewHolder(@NonNull View itemView)
            {
                super(itemView);
                itemView.setOnClickListener(this);
                babatImageView = (ImageView) itemView.findViewById(R.id.wenay_babat_id);
                nawyBabatView = (TextView)itemView.findViewById(R.id.nawy_babat_view_id);
                nawyHunarmand = (TextView)itemView.findViewById(R.id.nawy_hunarmand_id);
            }
            void bind(Babat babat)
            {
                mBabat = babat;
                nawyBabatView.setText(mBabat.getNawyBabat());
                babatImageView.setImageDrawable(mBabat.getWenayBabat());
                nawyHunarmand.setText(mBabat.getNawyNusar());

            }
            @Override
            public void onClick(View v)
            {
                if (mBabat.getLaparayBabat() == 16)
                {
                    Intent intent = new Intent(getBaseContext(),SpecialBabatActivity.class);
                    intent.putExtra(Intent.EXTRA_INTENT,mBabat.getLaparayBabat());
                    startActivity(intent);
                }
                else
                {
                    Intent intent = new Intent(getBaseContext(),BabatActivity.class);
                    intent.putExtra(Intent.EXTRA_INTENT,mBabat.getLaparayBabat());
                    startActivity(intent);
                }

            }
        }
    }

}
