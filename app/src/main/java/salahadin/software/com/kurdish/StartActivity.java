package salahadin.software.com.kurdish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;



public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void startListOfBabats(View view)
    {
        startActivity(new Intent(this,MainActivity.class));
    }

    public void startVideosList(View view)
    {
        startActivity(new Intent(this,VideoListAtivity.class));
    }
}
