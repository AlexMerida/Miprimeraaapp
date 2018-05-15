package com.teaching.android.miprimeraapp.Fragments;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.teaching.android.miprimeraapp.GameModel;
import com.teaching.android.miprimeraapp.Interactors.GamesInteractors;
import com.teaching.android.miprimeraapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GameDetailFragment extends Fragment {


    public GameDetailFragment() {
        // Required empty public constructor
    }

    public static GameDetailFragment newInstance(int gameId) {
        GameDetailFragment gameDetailFragment = new GameDetailFragment();
        Bundle myBundle = new Bundle();
        gameDetailFragment.setArguments(myBundle);
        myBundle.putInt("game_id", gameId);

        return gameDetailFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragmentView = inflater.inflate(R.layout.fragment_game_detail, container, false);

        int gameId = getArguments().getInt("game_id", 0);
        final GameModel game = new GamesInteractors().GetWithId(gameId);

        ImageView icono = fragmentView.findViewById(R.id.icono);
        icono.setImageResource(game.getIconDrawable());
        ImageView fondo = fragmentView.findViewById(R.id.fondo);
        fondo.setImageResource(game.getBackgroundDrawable());
        TextView descripcion = fragmentView.findViewById(R.id.texto);
        descripcion.setText(game.getDescription());

        Button boton = fragmentView.findViewById(R.id.websiteButton);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(game.getOfficialWenUsrl()));
                startActivity(webIntent);
            }
        });
        return fragmentView;
    }

}
