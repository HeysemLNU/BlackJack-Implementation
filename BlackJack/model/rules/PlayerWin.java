package BlackJack.model.rules;

import BlackJack.model.Dealer;
import BlackJack.model.Player;

public class PlayerWin implements WinnerInterface {
   private final int maxScore=21;
    public boolean DecideWinner(Player a_player, Dealer a_dealerScore) {
        if (a_player.CalcScore() > maxScore) {return true;}
        else if (a_dealerScore.CalcScore()>maxScore){return false;}
        else if (a_dealerScore.CalcScore()==a_player.CalcScore()){return false;}
         return a_dealerScore.CalcScore() > a_player.CalcScore();
    }
}
