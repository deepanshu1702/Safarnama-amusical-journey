package com.example.safarnamaamusicaljourney;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button startButton;
    ImageView imageView;
    VideoView videoView;
    MediaPlayer mediaPlayer;
    Button pauseButton;
    Button nextButton;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater= getMenuInflater();
        menuInflater.inflate(R.menu.video_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()== R.id.srinagar){




            videoView.setVideoPath( "android.resource://"+getPackageName()+"/"+R.raw.view);

            MediaController mediaController= new MediaController(this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            videoView.start();
            mediaPlayer= MediaPlayer.create(this,R.raw.kaisehua);
            mediaPlayer.start();

    }else if (item.getItemId()== R.id.manali){
            mediaPlayer.stop();
            videoView.setVideoPath( "android.resource://"+getPackageName()+"/"+R.raw.drive);

            MediaController mediaController= new MediaController(this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            videoView.start();
            mediaPlayer= MediaPlayer.create(this,R.raw.yeh);
            mediaPlayer.start();

        }else if (item.getItemId()== R.id.himachal){
            mediaPlayer.stop();
            videoView.setVideoPath( "android.resource://"+getPackageName()+"/"+R.raw.himachal1);

            MediaController mediaController= new MediaController(this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            videoView.start();
            mediaPlayer= MediaPlayer.create(this,R.raw.teremere);
            mediaPlayer.start();

        }else if (item.getItemId()== R.id.shimla){
            mediaPlayer.stop();
            videoView.setVideoPath( "android.resource://"+getPackageName()+"/"+R.raw.bridge);

            MediaController mediaController= new MediaController(this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            videoView.start();
            mediaPlayer= MediaPlayer.create(this,R.raw.humrah);
            mediaPlayer.start();

        }else if (item.getItemId()== R.id.ladakh){
            mediaPlayer.stop();
            videoView.setVideoPath( "android.resource://"+getPackageName()+"/"+R.raw.ladakh1);

            MediaController mediaController= new MediaController(this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            videoView.start();
            mediaPlayer= MediaPlayer.create(this,R.raw.palpal);
            mediaPlayer.start();

        }else if (item.getItemId()== R.id.dharamsala){
            mediaPlayer.stop();
            videoView.setVideoPath( "android.resource://"+getPackageName()+"/"+R.raw.mount);

            MediaController mediaController= new MediaController(this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            videoView.start();
            mediaPlayer= MediaPlayer.create(this,R.raw.pyar);
            mediaPlayer.start();

        }else if (item.getItemId()== R.id.huwaibeach){
            mediaPlayer.stop();
            videoView.setVideoPath( "android.resource://"+getPackageName()+"/"+R.raw.beach);

            MediaController mediaController= new MediaController(this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            videoView.start();
            mediaPlayer= MediaPlayer.create(this,R.raw.tujhekitna);
            mediaPlayer.start();

        }else if (item.getItemId()== R.id.spiti){
            mediaPlayer.stop();
            videoView.setVideoPath( "android.resource://"+getPackageName()+"/"+R.raw.spiti);

            MediaController mediaController= new MediaController(this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            videoView.start();
            mediaPlayer= MediaPlayer.create(this,R.raw.ishq);
            mediaPlayer.start();

        }else if (item.getItemId()== R.id.switzerland){
            mediaPlayer.stop();
            videoView.setVideoPath( "android.resource://"+getPackageName()+"/"+R.raw.switz);

            MediaController mediaController= new MediaController(this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            videoView.start();
            mediaPlayer= MediaPlayer.create(this,R.raw.des);
            mediaPlayer.start();

        }
        return super.onOptionsItemSelected(item);
    }












    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView= findViewById(R.id.textView);
        final Button startButton= findViewById(R.id.startButton);
        imageView=findViewById(R.id.imageView);
        videoView=findViewById(R.id.videoView);


        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
                startButton.setEnabled(false);
                startButton.setVisibility(View.INVISIBLE);
                imageView.animate().alpha(0);
                videoView.setVisibility(View.VISIBLE);









            }
        });
    }
}