package com.example.gemplexdemonik.model;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.gemplexdemonik.R;

public class MovieDetails extends AppCompatActivity {

    ImageView movieImage;
    TextView movieName;
    Button playButton;

    String mName,mImage,mId,mFileUrl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        movieImage=findViewById(R.id.movie_image);
        movieName=findViewById(R.id.movie_name);
        playButton=findViewById(R.id.play_button);

        mId=getIntent().getStringExtra("movieId");
        mName=getIntent().getStringExtra("movieName");
        mImage=getIntent().getStringExtra("movieImageUrl");
        mFileUrl=getIntent().getStringExtra("movieFile");

        Glide.with(this).load(mImage).into(movieImage);
        movieName.setText(mName);


    }

}