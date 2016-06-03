package com.hourglass.lingaraj.expandablefab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private String TAG = "Fab buttons";

    private ImageButton fab_button;
    private ImageButton share_fab_expanded;
    private ImageButton save_fab_expanded;
    private ImageButton link_fab_expanded;
    private Animation bounce_animate;
    private boolean show_expandable_fab = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpViews();
        hideExpandableFabs();
    }

    private void hideExpandableFabs() {
        Log.d(TAG,"hide Expandable Fabs");
        fab_button.setImageResource(R.drawable.ic_inverted_traingle);
        share_fab_expanded.setVisibility(View.GONE);
        save_fab_expanded.setVisibility(View.GONE);
        link_fab_expanded.setVisibility(View.GONE);
    }



    private void setUpViews() {

        fab_button = (ImageButton) findViewById(R.id.fab_main_button);
        share_fab_expanded = (ImageButton) findViewById(R.id.share_fab_expandable);
        save_fab_expanded = (ImageButton) findViewById(R.id.save_fab_expandable);
        link_fab_expanded = (ImageButton) findViewById(R.id.link_fab_expandable);
         bounce_animate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);


    }


    public void fabButtonClick(View view)
    {
        Log.d(TAG,"fab button clicked");
        if (show_expandable_fab)
        {
            show_expandable_fab = false;
            hideExpandableFabs();

        }
        else
        {
            show_expandable_fab = true;
            showExpandableFabs();
        }
       }

    public void saveExpandableFabClick(View view)
    {
       Log.d(TAG,"Save Fab Clicked");

    }

    public void shareExpandableFabClick(View view)
    {
        Log.d(TAG,"Share Fab Clicked");
    }

    public void linkExpandableFabClick(View view)
    {
        Log.d(TAG,"Link expandable clicked");
    }

    private void showExpandableFabs() {
        Log.d(TAG,"Show Expandable Fab icon and setting animation");
        fab_button.setImageResource(R.drawable.ic_traingle);
        save_fab_expanded.setVisibility(View.VISIBLE);
        link_fab_expanded.setVisibility(View.VISIBLE);
        share_fab_expanded.setVisibility(View.VISIBLE);

    }

    private void checkAndShowRelevantSaveIcon()
    {
        //check database if the current news exist in saved Table set it to love


    }
}
