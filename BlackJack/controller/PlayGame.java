package BlackJack.controller;


import BlackJack.model.observer.Observer;
import BlackJack.view.IView;
import BlackJack.model.Game;
import BlackJack.view.Options;

import java.io.IOException;


public class PlayGame implements Observer {
  private IView a_view;
  private Game a_game;
  public PlayGame(Game  new_Game, IView  new_View ){
    a_view=new_View;
    a_game=new_Game;

    a_game.connectObserver(this);
  }




  public boolean Play() throws IOException {


    a_view.DisplayWelcomeMessage();
    a_view.DisplayDealerHand(a_game.GetDealerHand(), a_game.GetDealerScore());
    a_view.DisplayPlayerHand(a_game.GetPlayerHand(), a_game.GetPlayerScore());



    if (a_game.IsGameOver())
    {
        a_view.DisplayGameOver(a_game.IsDealerWinner());
    }

    Options opt=a_view.ChooseOptions();
    
    if (opt==Options.PLAY)
    {
        a_game.NewGame();
    }
    else if (opt==Options.HIT)
    {
        a_game.Hit();
    }
    else if (opt==Options.STAND)
    {
        a_game.Stand();
    }

    return opt!=Options.QUIT;

  }


  @Override
  public void Update() {

    a_view.DisplayWelcomeMessage();
    a_view.DisplayDealerHand(a_game.GetDealerHand(), a_game.GetDealerScore());
    a_view.DisplayPlayerHand(a_game.GetPlayerHand(), a_game.GetPlayerScore());
    a_view.pause();


  }
}