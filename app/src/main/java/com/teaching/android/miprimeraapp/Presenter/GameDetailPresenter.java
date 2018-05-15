package com.teaching.android.miprimeraapp.Presenter;

import com.teaching.android.miprimeraapp.GameModel;
import com.teaching.android.miprimeraapp.Interactors.GamesInteractors;
import com.teaching.android.miprimeraapp.View.GamesDataView;

import java.util.ArrayList;

public class GameDetailPresenter {
    private GamesInteractors interactors;
    private GamesDataView view;

    public void startPresenting(GamesDataView view){
        this.view = view;
        interactors = new GamesInteractors();
    }
    public void loadGameWithId(int id){
        GameModel game = interactors.GetWithId(id);
        view.onGameLoaded(game);
    }
    public ArrayList<GameModel> getGames(){
        return interactors.getGames();
    }
}
