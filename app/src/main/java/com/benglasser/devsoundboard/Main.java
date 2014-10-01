package com.benglasser.devsoundboard;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;


public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void hackThePlanet(final View view)
    {
        final MediaPlayer mp1= MediaPlayer.create(getBaseContext(), R.raw.hack_the_planet);
        mp1.start();
    }

    public void oneZero(final View view)
    {
        final MediaPlayer mp1= MediaPlayer.create(getBaseContext(), R.raw.onezero);
        mp1.start();
    }

    public void itsWorking(final View view)
    {
        final MediaPlayer mp1= MediaPlayer.create(getBaseContext(), R.raw.its_working);
        mp1.start();
    }

    public void batman(final View view)
    {
        final MediaPlayer mp1= MediaPlayer.create(getBaseContext(), R.raw.batman);
        mp1.start();
    }

    public void giveup(final View view)
    {
        final MediaPlayer mp1= MediaPlayer.create(getBaseContext(), R.raw.giveup);
        mp1.start();
    }

    public void smart(final View view)
    {
        final MediaPlayer mp1= MediaPlayer.create(getBaseContext(), R.raw.smartman);
        mp1.start();
    }

    public void wah(final View view)
    {
        final MediaPlayer mp1= MediaPlayer.create(getBaseContext(), R.raw.wah);
        mp1.start();
    }

    public void nooo(final View view)
    {
        final MediaPlayer mp1= MediaPlayer.create(getBaseContext(), R.raw.nooo);
        mp1.start();
    }

    public void khaaan(final View view)
    {
        final MediaPlayer mp1= MediaPlayer.create(getBaseContext(), R.raw.khaaan);
        mp1.start();
    }

    public void charlie(final View view)
    {
        final MediaPlayer mp1= MediaPlayer.create(getBaseContext(), R.raw.charlie2);
        mp1.start();
    }

    public void red(final View view)
    {
        final MediaPlayer mp1= MediaPlayer.create(getBaseContext(), R.raw.redboxquarter);
        mp1.start();
    }

    public void blue(final View view)
    {
        final MediaPlayer mp1= MediaPlayer.create(getBaseContext(), R.raw.blue);
        mp1.start();
    }
}
