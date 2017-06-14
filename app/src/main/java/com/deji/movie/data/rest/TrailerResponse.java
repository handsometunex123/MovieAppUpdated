package com.deji.movie.data.rest;

import android.os.Parcel;
import android.os.Parcelable;

import com.deji.movie.data.model.Review;
import com.deji.movie.data.model.Trailer;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;


public class TrailerResponse implements Parcelable {

    @SerializedName("results")
    private ArrayList<Trailer> trailers;

    public TrailerResponse(Parcel parcel) {
        trailers = new ArrayList<>();
        parcel.readTypedList(trailers, Review.CREATOR);
    }

    public ArrayList<Trailer> getTrailers() {
        return trailers;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<TrailerResponse> CREATOR = new Creator<TrailerResponse>() {
        @Override
        public TrailerResponse createFromParcel(Parcel parcel) {
            return new TrailerResponse(parcel);
        }

        @Override
        public TrailerResponse[] newArray(int i) {
            return new TrailerResponse[0];
        }
    };

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(trailers);
    }
}
