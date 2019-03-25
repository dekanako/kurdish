package salahadin.software.com.kurdish;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import salahadin.software.com.kurdish.model.Chalaki.Chalaki;
import salahadin.software.com.kurdish.model.Chalaki.ChalakiakanLab;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chalaki);

        mPage = getIntent().getIntExtra(Intent.EXTRA_INTENT,0);
        mChalakiNumber = getIntent().getIntExtra("hello",0);

        mChalaki = ChalakiakanLab.getInstance(this).getChalakiakan(mChalakiNumber).getmChalakiakan().get(mPage);

        mChalakiTextView = findViewById(R.id.chalaki_id_title);
        mPrsyarTextView = findViewById(R.id.prsyar_chalaki_title_id);
        mHintTextView = findViewById(R.id.hint_chalaki_id);

        mChalakiTextView.append(mChalaki.getZhmarayChalaki()+"");
        mHintTextView.setText(mChalaki.getHintyChalaki());
        mPrsyarTextView.setText(mChalaki.getTitleChalaki());
        initChalakiList();
    }

    private void initChalakiList()
    {
        mRahenanRecyclerView = findViewById(R.id.list_chalaki);
        mAdapter = new ChalakiAdapter(mChalaki.getmPrsyarakan());
        mRahenanRecyclerView.setAdapter(mAdapter);
        mRahenanRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRahenanRecyclerView.setHasFixedSize(true);

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
