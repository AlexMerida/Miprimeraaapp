package com.teaching.android.miprimeraapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.teaching.android.miprimeraapp.Fragments.GameDetailFragment;
import com.teaching.android.miprimeraapp.Presenter.GameDetailPresenter;
import com.teaching.android.miprimeraapp.View.GamesDataView;

public class GameDetailActivity extends AppCompatActivity implements GamesDataView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_detail);
        Presenter = new GameDetailPresenter();
        currentPosition = getIntent().getIntExtra("position", 0);

        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

    }

    private GameDetailPresenter Presenter;
    private int currentPosition;

    private myPagerAdapter myPagerAdapter;
    @Override
    protected void onStart() {
        super.onStart();
        Presenter.startPresenting(this);

        final ViewPager myViewPager = findViewById(R.id.view_pager);
        myPagerAdapter = new myPagerAdapter(getSupportFragmentManager());
        myViewPager.setAdapter(myPagerAdapter);
        myViewPager.setCurrentItem(currentPosition);
        getSupportActionBar().setTitle(myPagerAdapter.getPageTitle(currentPosition));
        myViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                getSupportActionBar().setTitle(myPagerAdapter.getPageTitle(position));
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public void onGameLoaded(GameModel game) {
    }

    private class myPagerAdapter extends FragmentStatePagerAdapter {
        public myPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            int gameId = Presenter.getGames().get(position).getId();
            return GameDetailFragment.newInstance(gameId);
        }
        @Override
        public CharSequence getPageTitle(int position){
            return Presenter.getGames().get(position).getName();
        }

        @Override
        public int getCount() {
            return Presenter.getGames().size();
        }
    }
}
