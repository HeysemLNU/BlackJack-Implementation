package BlackJack.model.rules;

import BlackJack.model.Dealer;
import BlackJack.model.Player;

public interface WinnerInterface {
   boolean DecideWinner(Player a_player,Dealer a_DealerScore);
}
