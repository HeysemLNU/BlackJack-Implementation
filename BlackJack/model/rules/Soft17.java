package BlackJack.model.rules;

import BlackJack.model.Card;
import BlackJack.model.Player;

public class Soft17 implements IHitStrategy {
    private final int g_Soft17hitLimit = 17;

    public boolean DoHit(Player a_dealer) {

        if (a_dealer.CalcScore()==g_Soft17hitLimit){

            for (Card c:a_dealer.GetHand()){
                if (c.GetValue()==Card.Value.Ace){
                    return true;
                }
                else return false;
            }
        }
        return a_dealer.CalcScore()<g_Soft17hitLimit;
    }
}
