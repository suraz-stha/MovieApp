package com.example.ashish.movielisting;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;

/**
 * Created by ashish on 7/12/2016.
 */
public class MovieListViewHolder extends RecyclerView.ViewHolder {

    public TextView tvMovieTitle,tvmovieReleaseDate;
    public ImageView ivMovieImage;


   // public RatingBar tvMovieRatings;


    public MovieListViewHolder(View itemView) {
        super(itemView);

        tvMovieTitle = (TextView) itemView.findViewById(R.id.movie_title);
        //tvMovieRatings = (RatingBar) itemView.findViewById(R.id.movie_ratings);
        tvmovieReleaseDate = (TextView) itemView.findViewById(R.id.movie_releasedate);
        ivMovieImage = (ImageView) itemView.findViewById(R.id.movie_image);

    }
}
