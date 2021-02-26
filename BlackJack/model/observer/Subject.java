package BlackJack.model.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers=new ArrayList<>();
    public void atach(Observer o){observers.add(o);}
    public void detach(Observer o){observers.remove(o);}
    public void Notify(){
        for (int i=0;i<observers.size();i++){
            observers.get(i).Update();
        }
    }
}
