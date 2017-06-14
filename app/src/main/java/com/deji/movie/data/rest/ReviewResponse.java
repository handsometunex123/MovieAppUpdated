package com.deji.movie.data.rest;

import android.os.Parcel;
import android.os.Parcelable;

import com.deji.movie.data.model.Review;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;


public class ReviewResponse implements Parcelable {

    @SerializedName("results")
    private ArrayList<Review> reviews;

    public ReviewResponse(Parcel parcel) {
        reviews = new ArrayList<>();
        parcel.readTypedList(reviews, Review.CREATOR);
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ReviewResponse> CREATOR = new Creator<ReviewResponse>() {
        @Override
        public ReviewResponse createFromParcel(Parcel parcel) {
            return new ReviewResponse(parcel);
        }

        @Override
        public ReviewResponse[] newArray(int i) {
            return new ReviewResponse[0];
        }
    };

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(reviews);
    }
}
