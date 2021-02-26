package BlackJack;

import BlackJack.model.Game;
import BlackJack.view.*;
import BlackJack.controller.*;

import java.io.IOException;

public class Program
{

  public static void main(String[] a_args) throws IOException {
  
    Game g = new Game();
    IView v = new SimpleView(); //new SwedishView();
    PlayGame ctrl = new PlayGame(g,v);
    
    while (ctrl.Play());
  }
}