package com.example.myapplication;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


@TargetApi(Build.VERSION_CODES.GINGERBREAD)
public class MainActivity extends Activity {
    SQLiteOpenHelper basee;
    public String pop1 = null;
    public final static String bol1 = "kabyl";
    public final static String BUTTONS1 = "sdz.chapitreTrois.intent.example.Boutons";
    public boolean petit = false;

    public void ghaoui(TextView x) {
        String te = x.getText().toString();
        if (raz1.getText().toString().equals(te) && !raz1.isEnabled()) {
            raz1.setEnabled(true);
            raz1.setBackgroundColor(Color.GREEN);
            x.setText("");

        } else {
            if (raz2.getText().toString().equals(te) && !raz2.isEnabled()) {
                raz2.setEnabled(true);
                raz2.setBackgroundColor(Color.GREEN);
                x.setText("");

            } else {
                if (raz3.getText().toString().equals(te) && !raz3.isEnabled()) {
                    raz3.setEnabled(true);
                    raz3.setBackgroundColor(Color.GREEN);
                    x.setText("");
                } else {
                    if (raz4.getText().toString().equals(te) && !raz4.isEnabled()) {
                        raz4.setEnabled(true);
                        raz4.setBackgroundColor(Color.GREEN);
                        x.setText("");
                    } else {
                        if (raz5.getText().toString().equals(te) && !raz5.isEnabled()) {
                            raz5.setEnabled(true);
                            raz5.setBackgroundColor(Color.GREEN);
                            x.setText("");
                        } else {
                            if (raz6.getText().toString() == te && !raz6.isEnabled()) {
                                raz6.setEnabled(true);
                                raz6.setBackgroundColor(Color.GREEN);
                                x.setText("");
                            } else {
                                if (raz7.getText().toString() == te && !raz7.isEnabled()) {
                                    raz7.setEnabled(true);
                                    raz7.setBackgroundColor(Color.GREEN);
                                    x.setText("");
                                } else {
                                    if (raz8.getText().toString() == te && !raz8.isEnabled()) {
                                        raz8.setEnabled(true);
                                        raz8.setBackgroundColor(Color.GREEN);
                                        x.setText("");
                                    } else {

                                        if (raz9.getText().toString() == te && !raz9.isEnabled()) {
                                            raz9.setEnabled(true);
                                            raz9.setBackgroundColor(Color.GREEN);
                                            x.setText("");
                                        } else {
                                            if (raz10.getText().toString() == te && !raz10.isEnabled()) {
                                                raz10.setEnabled(true);
                                                raz10.setBackgroundColor(Color.GREEN);
                                                x.setText("");
                                            } else {
                                                if (raz11.getText().toString() == te && !raz11.isEnabled()) {
                                                    raz11.setEnabled(true);
                                                    raz11.setBackgroundColor(Color.GREEN);
                                                    x.setText("");
                                                } else {
                                                    raz12.setEnabled(true);
                                                    raz12.setBackgroundColor(Color.GREEN);
                                                    x.setText("");

                                                }
                                            }
                                        }
                                    }
                                }
                            }

                        }
                    }
                }

            }
        }

    }


    public void toggle(TextView x) {
        String te = x.getText().toString();
        if (text1.getText().toString().isEmpty()) {
            text1.setText(te);
            x.setEnabled(false);
            x.setBackgroundColor(Color.TRANSPARENT);
        } else {
            if (text2.getText().toString().isEmpty()) {
                text2.setText(te);
                x.setEnabled(false);
                x.setBackgroundColor(Color.TRANSPARENT);
            } else {
                if (text3.getText().toString().isEmpty()) {
                    text3.setText(te);
                    x.setEnabled(false);
                    x.setBackgroundColor(Color.TRANSPARENT);
                } else {
                    if (text4.getText().toString().isEmpty()) {
                        text4.setText(te);
                        x.setEnabled(false);
                        x.setBackgroundColor(Color.TRANSPARENT);
                    } else if (text5.getText().toString().isEmpty()) {
                        text5.setText(te);
                        x.setEnabled(false);
                        x.setBackgroundColor(Color.TRANSPARENT);
                    }
                }
            }
        }
    }

    LinearLayout Yacine = null;
    TextView textv = null;
    TextView text = null;
    TextView text1 = null;
    TextView text2 = null;
    TextView text3 = null;
    TextView text4 = null;
    TextView text5 = null;
    ImageButton appler = null;
    ImageButton app = null;
    ImageButton razx = null;
    TextView raz1 = null;
    TextView raz2 = null;
    TextView raz3 = null;
    TextView raz4 = null;
    TextView raz5 = null;
    TextView raz6 = null;
    TextView raz7 = null;
    TextView raz8 = null;
    TextView raz9 = null;
    TextView raz10 = null;
    TextView raz11 = null;
    TextView raz12 = null;

    Button mButton2 = null;
    Button mButton1 = null;
    ImageButton premier2 = null;
    ImageButton premier3 = null;
    ImageButton premier4 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textv = findViewById(R.id.textv);
        text1 = findViewById(R.id.ite1);
        text2 = findViewById(R.id.ite2);
        text3 = findViewById(R.id.ite3);
        text4 = findViewById(R.id.ite4);
        text5 = findViewById(R.id.ite5);

        premier2 = findViewById(R.id.img2);
        premier3 = findViewById(R.id.img3);
        premier4 = findViewById(R.id.img4);

        raz1 = findViewById(R.id.bot1);
        raz2 = findViewById(R.id.bot2);
        raz3 = findViewById(R.id.bot3);
        raz4 = findViewById(R.id.bot4);
        raz5 = findViewById(R.id.bot5);
        raz6 = findViewById(R.id.bot6);
        raz7 = findViewById(R.id.bot7);
        raz8 = findViewById(R.id.bot8);
        raz9 = findViewById(R.id.bot9);
        raz10 = findViewById(R.id.bot10);
        raz11 = findViewById(R.id.bot11);
        raz12 = findViewById(R.id.bot12);


        appler = findViewById(R.id.appler);
        app = findViewById(R.id.app);
        razx = findViewById(R.id.bot);
        Yacine = findViewById(R.id.lay1);

        raz1.setOnClickListener(enrgis7);
        raz2.setOnClickListener(enrgis7);
        raz3.setOnClickListener(enrgis7);
        raz4.setOnClickListener(enrgis7);
        raz5.setOnClickListener(enrgis7);
        raz6.setOnClickListener(enrgis7);
        raz7.setOnClickListener(enrgis7);
        raz8.setOnClickListener(enrgis7);
        raz9.setOnClickListener(enrgis7);
        raz10.setOnClickListener(enrgis7);
        raz11.setOnClickListener(enrgis7);
        raz12.setOnClickListener(enrgis7);

        basee = new base(this);
        text1.setOnClickListener(llll1);
        text2.setOnClickListener(llll1);
        text3.setOnClickListener(llll1);
        text4.setOnClickListener(llll1);
        text5.setOnClickListener(llll1);

        appler.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                app.setEnabled(false);
                String fff = textv.getText().toString();
                float ddd = Float.valueOf(fff);
                ddd = ddd - 2;
                String aid = String.valueOf(ddd);
                textv.setText(aid);
                raz1.setEnabled(false);
                raz1.setBackgroundColor(Color.RED);
                raz7.setEnabled(false);
                raz7.setBackgroundColor(Color.RED);
                appler.setEnabled(false);
            }
        });

        appler.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                appler.setEnabled(false);
                String fff = textv.getText().toString();
                float ddd = Float.valueOf(fff);
                ddd = ddd - 2;
                String aid = String.valueOf(ddd);
                textv.setText(aid);
                text2.setText("O");
                text2.setEnabled(false);
                text4.setText("E");
                text4.setEnabled(false);
                app.setEnabled(false);
            }

        });

        premier2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                premier2.setImageResource(R.drawable.voo);
                petit = true;
            }
        });
        premier3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                premier3.setImageResource(R.drawable.vole);
                petit = true;
            }
        });
        premier4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                premier4.setImageResource(R.drawable.vol);
                petit = true;
            }
        });

        SharedPreferences preferences = getSharedPreferences("pref", 0);
        String laaa = preferences.getString(Yacine3.FAV, "00");

        float kab = Float.valueOf(laaa);
        kab = kab + 10;
        String banal = String.valueOf(kab);
        textv.setText(banal);


        SharedPreferences preferenc = getSharedPreferences("pref", 0);
        String la = preferenc.getString(MainActivity.bol1, "11");
        if (la.toString().equals("vrai")) {
            String ff = textv.getText().toString();
            float dd = Float.valueOf(ff);
            dd = dd - 10;
            pop1 = String.valueOf(dd);
            app.setEnabled(false);
            appler.setEnabled(false);

        } else {
            pop1 = textv.getText().toString();
        }
        razx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int vvv = R.string.vv;
                String vv = String.valueOf(vvv);
                int ooo = R.string.oo;
                String oo = String.valueOf(ooo);
                int lll = R.string.ll;
                String ll = String.valueOf(lll);
                int eee = R.string.ee;
                String ee = String.valueOf(eee);
                int rrr = R.string.rr;
                String rr = String.valueOf(rrr);
                if (text1.getText().equals("V") && text2.getText().equals("O") && text3.getText().equals("L") && text4.getText().equals("E") && text5.getText().equals("R")) {


                    SharedPreferences preferenc = getSharedPreferences("pref", 0);
                    SharedPreferences.Editor editor = preferenc.edit();
                    editor.putString(bol1, "vrai");
                    editor.commit();

                    Toast.makeText(MainActivity.this, "sahit aya bandi !", Toast.LENGTH_LONG).show();
                    //***String kkk = textv.getText().toString();
                    Intent secondeActivite = new Intent(MainActivity.this, Yacine2.class);
                    secondeActivite.putExtra(BUTTONS1, pop1);
                    startActivity(secondeActivite);

                }
            }
        });
    }


    private View.OnClickListener llll1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.ite1:
                    ghaoui(text1);
                    break;
                case R.id.ite2:
                    ghaoui(text2);
                    break;
                case R.id.ite3:
                    ghaoui(text3);
                    break;
                case R.id.ite4:
                    ghaoui(text4);
                    break;
                case R.id.ite5:
                    ghaoui(text5);
                    break;
            }
        }
    };

    private View.OnClickListener enrgis7 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.bot1:
                    toggle(raz1);
                    break;
                case R.id.bot2:
                    toggle(raz2);
                    break;
                case R.id.bot3:
                    toggle(raz3);
                    break;
                case R.id.bot4:
                    toggle(raz4);
                    break;
                case R.id.bot5:
                    toggle(raz5);
                    break;
                case R.id.bot6:
                    toggle(raz6);
                    break;
                case R.id.bot7:
                    toggle(raz7);
                    break;
                case R.id.bot8:
                    toggle(raz8);
                    break;
                case R.id.bot9:
                    toggle(raz9);
                    break;
                case R.id.bot10:
                    toggle(raz10);
                    break;
                case R.id.bot11:
                    toggle(raz11);
                    break;
                case R.id.bot12:
                    toggle(raz12);
                    break;
            }
        }
    };
}
