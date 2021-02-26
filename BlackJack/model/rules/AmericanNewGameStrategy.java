package BlackJack.model.rules;

import BlackJack.model.Deck;
import BlackJack.model.Dealer;
import BlackJack.model.Player;
import BlackJack.model.Card;  

class AmericanNewGameStrategy implements INewGameStrategy {

  public boolean NewGame(Dealer a_dealer, Player a_player) {
    a_dealer.refactorDealCard(a_player);

    a_dealer.refactorDealCard(a_dealer);

    a_dealer.refactorDealCard(a_player);

    a_dealer.refactorHideDealCard(a_dealer);

    return true;
  }
}