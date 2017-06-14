package com.deji.movie.data.rest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface MovieService {

    //@GET("movie/popular?api_key=[API_KEY]")z
    @GET("movie/popular?api_key=38e06849d35ff27fe7753e095c77361b")
    Call<MovieResponse> getPopularMovies();

    @GET("movie/top_rated?api_key=38e06849d35ff27fe7753e095c77361b")
    Call<MovieResponse> getTopRatedMovies();

    @GET("movie/{id}/videos?api_key=38e06849d35ff27fe7753e095c77361b")
    Call<TrailerResponse> getMovieTrailers(@Path("id") String id);

    @GET("movie/{id}/reviews?api_key=38e06849d35ff27fe7753e095c77361b")
    Call<ReviewResponse> getMovieReviews(@Path("id") String id);

}
