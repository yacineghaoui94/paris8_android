package com.example.myapplication;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteOpenHelper;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;


@TargetApi(Build.VERSION_CODES.GINGERBREAD)
public class Feroudja extends Activity {

    SQLiteOpenHelper base;

    CheckBox chxx = null;
    TextView textv = null;
    MediaPlayer mps;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feroudjaa);
        base = new base(this);
        ImageButton fab = findViewById(R.id.glop);
        chxx = findViewById(R.id.Yacine);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mps = new MediaPlayer();
                mps.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mps.setLooping(false);
                if (chxx.isChecked()) {
                    mps.start();
                    Intent secondeActivite = new Intent(Feroudja.this, Yacine.class);
                    startActivity(secondeActivite);
                }
                if (!chxx.isChecked()) {
                    mps.stop();
                    Intent secondeActivite = new Intent(Feroudja.this, Yacine.class);
                    startActivity(secondeActivite);
                }
            }
        });
    }

    protected void onDestroy() {
        SharedPreferences preferences = getSharedPreferences("pref", 0);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(Yacine3.FAV, "00");
        editor.putString(Yacine4.bol4, "00");
        editor.putString(Yacine5.bol5, "00");
        editor.putString(Yacine2.bol2, "00");
        editor.putString(Yacine6.bol6, "00");
        editor.putString(Yacine7.bol7, "00");
        editor.putString(Yacine8.bol8, "00");
        editor.putString(MainActivity.bol1, "00");
        editor.putString(Yacine3.bol3, "00");
        editor.commit();
        super.onDestroy();
    }
}
