package BlackJack.model.rules;

public class RulesFactory {

  public IHitStrategy GetHitRule() {
    int Strategy=3;
    if (Strategy==3){
    return new BasicHitStrategy();}
    else return new Soft17();
  }

  public INewGameStrategy GetNewGameRule() {
    int gameStyle=3;
    if (gameStyle==3){
    return new AmericanNewGameStrategy();}
    else return new InternationalNewGameStrategy();
  }

  public WinnerInterface GetWinner(){
    int winerRule=4;
    if (winerRule==1){return new DealerWin();}
    else return new PlayerWin();
  }

}