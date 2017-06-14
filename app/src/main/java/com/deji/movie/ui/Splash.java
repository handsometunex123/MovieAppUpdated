package com.deji.movie.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.deji.movie.R;

import org.json.JSONObject;

public class Splash extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread tr = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3000);



                        startActivity(new Intent(Splash.this,MovieActivity.class));





                } catch (Exception e) {
                    e.printStackTrace();
                }
                finally {
                    Splash.this.finish();
                }
            }

        };
        tr.start();



    }



}
