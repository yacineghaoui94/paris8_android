package com.example.myapplication;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


@TargetApi(Build.VERSION_CODES.GINGERBREAD)
public class Yacine9 extends Activity {
    public final static String FAV = "fav";
    public final static String bol9 = "favcv4587er1";
    public String pop9 = null;
    public final static int CHOOSE_BUTTON_REQUEST = 3;
    public final static String BUTTONS3 = "sdz.chapitreTrois.intent.example.Boutons";
    int not = 15;

    public void ghaoui(TextView x) {
        String te = x.getText().toString();
        if (raz1.getText().toString().equals(te) && raz1.isEnabled() == false) {
            raz1.setEnabled(true);
            raz1.setBackgroundColor(Color.GREEN);
            x.setText("");
        } else {
            if (raz2.getText().toString().equals(te) && raz2.isEnabled() == false) {
                raz2.setEnabled(true);
                raz2.setBackgroundColor(Color.GREEN);
                x.setText("");
            } else {
                if (raz3.getText().toString().equals(te) && raz3.isEnabled() == false) {
                    raz3.setEnabled(true);
                    raz3.setBackgroundColor(Color.GREEN);
                    x.setText("");
                } else {
                    if (raz4.getText().toString().equals(te) && raz4.isEnabled() == false) {
                        raz4.setEnabled(true);
                        raz4.setBackgroundColor(Color.GREEN);
                        x.setText("");
                    } else {
                        if (raz5.getText().toString().equals(te) && raz5.isEnabled() == false) {
                            raz5.setEnabled(true);
                            raz5.setBackgroundColor(Color.GREEN);
                            x.setText("");
                        } else {
                            if (raz6.getText().toString() == te && raz6.isEnabled() == false) {
                                raz6.setEnabled(true);
                                raz6.setBackgroundColor(Color.GREEN);
                                x.setText("");
                            } else {
                                if (raz7.getText().toString() == te && raz7.isEnabled() == false) {
                                    raz7.setEnabled(true);
                                    raz7.setBackgroundColor(Color.GREEN);
                                    x.setText("");
                                } else {
                                    if (raz8.getText().toString() == te && raz8.isEnabled() == false) {
                                        raz8.setEnabled(true);
                                        raz8.setBackgroundColor(Color.GREEN);
                                        x.setText("");
                                    } else {

                                        if (raz9.getText().toString() == te && raz9.isEnabled() == false) {
                                            raz9.setEnabled(true);
                                            raz9.setBackgroundColor(Color.GREEN);
                                            x.setText("");
                                        } else {
                                            if (raz10.getText().toString() == te && raz10.isEnabled() == false) {
                                                raz10.setEnabled(true);
                                                raz10.setBackgroundColor(Color.GREEN);
                                                x.setText("");
                                            } else {
                                                if (raz11.getText().toString() == te && raz11.isEnabled() == false) {
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

    TextView textv2 = null;
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
    ImageButton premier2 = null;
    ImageButton premier3 = null;
    ImageButton premier4 = null;
    Button mButton2 = null;
    Button mButton1 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yacine9);
        textv = findViewById(R.id.textv);
        text1 = findViewById(R.id.ite1);
        text2 = findViewById(R.id.ite2);
        text3 = findViewById(R.id.ite3);
        text4 = findViewById(R.id.ite4);
        text5 = findViewById(R.id.ite5);

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
        text1.setOnClickListener(llll1);
        text2.setOnClickListener(llll1);
        text3.setOnClickListener(llll1);
        text4.setOnClickListener(llll1);
        text5.setOnClickListener(llll1);

        premier2 = findViewById(R.id.img2);
        premier3 = findViewById(R.id.img3);
        premier4 = findViewById(R.id.img4);
        app.setOnClickListener(apple2);
        appler.setOnClickListener(apple);

        premier2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                premier2.setImageResource(R.drawable.clo);
            }
        });
        premier3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                premier3.setImageResource(R.drawable.clooo);
            }
        });

        premier4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                premier4.setImageResource(R.drawable.cloo);
            }
        });

        Intent i = getIntent();
        String jjj = i.getStringExtra(Yacine5.BUTTONS5);
        float jjjj = Float.valueOf(jjj);
        jjjj = jjjj + 10;
        String jjjjj = String.valueOf(jjjj);
        textv.setText(jjjjj);
        if (jjjj == 90) {
            SharedPreferences preferences = getSharedPreferences("pref", 0);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString(Yacine3.FAV, jjjjj);
            editor.commit();
        }

        SharedPreferences preferenc = getSharedPreferences("pref", 0);
        String la = preferenc.getString(Yacine9.bol9, "11");
        if (la.toString().equals("vrai")) {
            String ff = textv.getText().toString();
            float dd = Float.valueOf(ff);
            dd = dd - 10;
            pop9 = String.valueOf(dd);
            app.setEnabled(false);
            appler.setEnabled(false);
        } else {
            pop9 = textv.getText().toString();
        }

        razx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text1.getText().equals("A") && text2.getText().equals("F") && text3.getText().equals("C") && text4.getText().equals("D") && text5.getText().equals("Z")) {
                    String kkkk = textv.getText().toString();
                    SharedPreferences preferences = getSharedPreferences("pref", 0);
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString(Yacine3.FAV, pop9);
                    editor.putString(bol9, "vrai");
                    editor.commit();
                    Intent secondeActivite = new Intent(Yacine9.this, Yacine.class);
                    secondeActivite.putExtra(BUTTONS3, pop9);
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

    private View.OnClickListener apple = new View.OnClickListener() {

        public void onClick(View v) {
            app.setEnabled(false);
            textv.setText("8");
            raz1.setEnabled(false);
            raz1.setBackgroundColor(Color.RED);
            raz3.setEnabled(false);
            raz3.setBackgroundColor(Color.RED);
            appler.setEnabled(false);

        }

    };

    private View.OnClickListener apple2 = new View.OnClickListener() {

        public void onClick(View v) {
            appler.setEnabled(false);
            text2.setText("An");
            text2.setEnabled(false);
            text4.setText("C");
            text4.setEnabled(false);
            app.setEnabled(false);

        }
    };
}
