package com.teaching.android.miprimeraapp.Interactors;

import com.teaching.android.miprimeraapp.GameModel;
import com.teaching.android.miprimeraapp.R;

import java.util.ArrayList;

public class GamesInteractors {

    private ArrayList<GameModel> games;

    public GamesInteractors (){
        if (games == null){
            GameModel symphoniaModel = new GameModel(0,"Tales of Symphonia","Descripcion Symphonia","https://es.wikipedia.org/wiki/Tales_of_Symphonia", R.drawable.tales_of_symphonia, R.drawable.tales_of_symphonia_by_tifa_bells);
            GameModel vesperiaModel = new GameModel(1,"Tales of Vesperia","Descripcion Vesperia","https://es.wikipedia.org/wiki/Tales_of_Vesperia",R.drawable.tales_of_vesperia, R.drawable.vesperia);
            games = new ArrayList<>();
            games.add(symphoniaModel);
            games.add(vesperiaModel);
        }
    }

    public ArrayList<GameModel> getGames() {
        return games;
    }
    public GameModel GetWithId(int id){
        for (GameModel game: games){
            if(game.getId() == id){
                return game;
            }
        }
        return null;
    }
}
