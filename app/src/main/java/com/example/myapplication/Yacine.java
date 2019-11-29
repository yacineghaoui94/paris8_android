package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteOpenHelper;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by user on 20/05/2016.
 */
public class Yacine extends Activity {
    SQLiteOpenHelper base;

    ImageButton rout = null;
    Button demarer = null;

    // TextView textv = null;
    TextView scor = null;
    RadioGroup rada = null;
    RadioButton rada2 = null;
    RadioButton rada3 = null;
    RadioButton rada6 = null;
    RadioButton rada4 = null;
    RadioButton rada5 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yacine);
        rada2 = (RadioButton) findViewById(R.id.rad2);
        rada3 = (RadioButton) findViewById(R.id.rad3);
        rada4 = (RadioButton) findViewById(R.id.rad4);
        rada5 = (RadioButton) findViewById(R.id.rad5);
        rada6 = (RadioButton) findViewById(R.id.rad6);

        rada2.setEnabled(false);
        rada3.setEnabled(false);
        rada4.setEnabled(false);
        rada5.setEnabled(false);
        rada6.setEnabled(false);

        rada = (RadioGroup) findViewById(R.id.rad);
        //textv = (TextView) findViewById(R.id.textv);
        scor = (TextView) findViewById(R.id.textnom);
        demarer = (Button) findViewById(R.id.bo1);
        rout = (ImageButton) findViewById(R.id.fab1);
        rout.setOnClickListener(rout1);

        demarer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rada.getCheckedRadioButtonId() == R.id.rad1) {
                    Intent secondeActivite = new Intent(Yacine.this, MainActivity.class);
                    startActivity(secondeActivite);
                } else {
                    if (rada.getCheckedRadioButtonId() == R.id.rad2) {
                        Intent secondeActivite = new Intent(Yacine.this, Yacine4.class);
                        startActivity(secondeActivite);
                    } else {
                        if (rada.getCheckedRadioButtonId() == R.id.rad3) {

                            Intent secondeActivite = new Intent(Yacine.this, Yacine7.class);
                            startActivity(secondeActivite);
                        } else {
                            if (rada.getCheckedRadioButtonId() == R.id.rad4) {
                                Intent secondeActivite = new Intent(Yacine.this, Yacine10.class);
                                startActivity(secondeActivite);
                            } else {
                                // Snackbar.make(textv, "ikdhir yiwan ah", Snackbar.LENGTH_LONG)
                                //.setAction("Action", null).show();
                            }
                        }
                    }

                }
            }
        });

        SharedPreferences preferences = getSharedPreferences("pref", 0);
        String laa = preferences.getString(Yacine3.FAV, "00");

        float jjjkj = Float.valueOf(laa);
        jjjkj = jjjkj + 10;
        String jjjjj = String.valueOf(jjjkj);
        scor.setText(jjjjj);
        if (jjjkj >= 30 && jjjkj < 60) {
            rada2.setEnabled(true);
        } else {
            if (jjjkj >= 50 && jjjkj < 80) {
                rada2.setEnabled(true);

                rada3.setEnabled(true);
            } else {
                if (jjjkj >= 80 && jjjkj < 110) {
                    rada2.setEnabled(true);

                    rada3.setEnabled(true);
                    rada4.setEnabled(true);
                } else {
                    if (jjjkj >= 110) {
                        rada2.setEnabled(true);
                        rada3.setEnabled(true);
                        rada4.setEnabled(true);
                        rada5.setEnabled(true);
                    }

                }
            }
        }
    }

    private View.OnClickListener rout1 = new View.OnClickListener() {
        public void onClick(View v) {
            Intent secondeActivite = new Intent(Yacine.this, Feroudja.class);
            startActivity(secondeActivite);
            MediaPlayer mps = new MediaPlayer();
            mps.stop();
        }

    };

}
