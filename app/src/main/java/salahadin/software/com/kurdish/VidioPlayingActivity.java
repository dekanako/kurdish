package salahadin.software.com.kurdish;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import salahadin.software.com.kurdish.model.VideoM.VedioProvider;

public class VidioPlayingActivity extends AppCompatActivity
{
    private int mCurrentPosition = 0;
    private static final String PLAY_BACK_TIME = "PLAY_TIME";
    private String mVedioTitle;
    private VideoView mVideoView;
    private int mVedio;
    @Override
    protected void onStart()
    {
        super.onStart();
        mVedio = getIntent().getIntExtra(Intent.EXTRA_INTENT,0);
        mVedioTitle = VedioProvider.getInstance().getVedioModel(mVedio);
        initializePlayer();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_vedio);
        if (savedInstanceState != null)
        {
            mCurrentPosition = savedInstanceState.getInt(PLAY_BACK_TIME);
        }
        mVideoView = findViewById(R.id.videoview);
        MediaController controller = new MediaController(this);
        controller.setMediaPlayer(mVideoView);
        mVideoView.setMediaController(controller);
    }

    private void initializePlayer()
    {
        System.out.println("TESTTTT"+mVedioTitle);
        Uri videoUri = getMedia(mVedioTitle);
        mVideoView.setVideoURI(videoUri);
        if (mCurrentPosition > 0)
        {
            mVideoView.seekTo(mCurrentPosition);
        }
        else
        {
            // Skipping to 1 shows the first frame of the video.
            mVideoView.seekTo(1);
        }
        mVideoView.start();

    }
    private Uri getMedia(String mediaName)
    {

        return Uri.parse("android.resource://" + getPackageName() + "/raw/" + mediaName);
    }
    private void releasePlayer()
    {
        mVideoView.stopPlayback();
    }

    @Override
    public void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        outState.putInt(PLAY_BACK_TIME,mVideoView.getCurrentPosition());
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N)
        {

        }
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        releasePlayer();
    }


}
