package BlackJack.model.rules;

import BlackJack.model.Dealer;
import BlackJack.model.Player;

public class DealerWin implements WinnerInterface {
    private final int maxScore=21;
    public boolean DecideWinner(Player a_player, Dealer a_dealerScore) {

            if (a_player.CalcScore() > maxScore) {return true;}
            else if (a_dealerScore.CalcScore()>maxScore){return false;}
            else if (a_dealerScore.CalcScore()==a_player.CalcScore()){return true;}
             return a_dealerScore.CalcScore() > a_player.CalcScore();       // If it is equal or more

    }
}
