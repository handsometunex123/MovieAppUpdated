package com.deji.movie.data.local;

import android.provider.BaseColumns;


public final class MovieContract {


    private MovieContract() {
    }

    public static abstract class ContactEntry implements BaseColumns {


        public static final String TABLE_NAME = "movie";
        public static final String COLUMN_ID="id";
        public static final String COLUMN_MOVIE_ID="movie_id";
        public static final String COLUMN_TITLE = "title";
        public static final String COLUMN_POSTER_URL = "posterUrl";
        public static final String COLUMN_SYNOPSIS = "synopsis";
        public static final String COLUMN_RATING = "rating";
        public static final String COLUMN_RELEASE_DATE = "releaseDate";

    }
}
