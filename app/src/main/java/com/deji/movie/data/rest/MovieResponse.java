package com.deji.movie.data.rest;

import android.os.Parcel;
import android.os.Parcelable;

import com.deji.movie.data.model.Movie;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;



public class MovieResponse implements Parcelable {

    @SerializedName("results")
    private ArrayList<Movie> movies;

    public MovieResponse(Parcel parcel) {
        movies=new ArrayList<>();
        parcel.readTypedList(movies, Movie.CREATOR);
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<MovieResponse> CREATOR = new Creator<MovieResponse>() {
        @Override
        public MovieResponse createFromParcel(Parcel parcel) {
            return null;
        }

        @Override
        public MovieResponse[] newArray(int i) {
            return new MovieResponse[0];
        }
    };

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(movies);
    }
}
