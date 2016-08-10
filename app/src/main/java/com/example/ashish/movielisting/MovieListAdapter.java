package com.example.ashish.movielisting;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.ashish.movielisting.rest.response.Result;

import java.util.ArrayList;

/**
 * Created by ashish on 7/12/2016.
 */
public class MovieListAdapter extends RecyclerView.Adapter<MovieListViewHolder> {
    private ArrayList<Result> listView;
    private Context context;
    public MovieListAdapter(Context context, ArrayList<Result> listView) {
        this.listView = listView;
        this.context = context;
    }

    @Override
    public MovieListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list,parent,false);
        MovieListViewHolder rcv = new MovieListViewHolder(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(MovieListViewHolder holder, int position) {
        holder.tvMovieTitle.setText(listView.get(position).getOriginalTitle());
//        holder.ivMovieImage.setImageResource(listView.get(position).getMoviePosterUrl());
        Glide.with(context)
                .load("http://image.tmdb.org/t/p/w185//"+listView.get(position).getPosterPath())
                .into(holder.ivMovieImage);
        if(listView.get(position).getAdult()==true){

        }
        holder.tvmovieReleaseDate.setText(listView.get(position).getReleaseDate());
       // holder.tvMovieRatings.setRating(listView.get(position).getVoteAverage());
        holder.tvMovieTitle.setTag(listView.get(position));
    }

    @Override
    public int getItemCount()
    {
        return this.listView.size();
    }
}
