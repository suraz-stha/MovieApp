package com.example.ashish.movielisting.rest;

import com.example.ashish.movielisting.rest.response.MovieListing;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ashish on 7/28/2016.
 */
public interface MovieListingService {

    @GET("upcoming")
    Call<MovieListing> getUpcomingMovies(@Query("api_key") String apiKey);


}
