package designpattern;


import java.util.ArrayList;
import java.util.List;

interface  Observer{
    public void update();
}
class ConcreteObserver implements  Observer{
    @Override
    public void update() {
        System.out.println("ConcreteObserver Called");
    }
}
class Subject{

    List<Observer> observers=new ArrayList<>();

    public void attached(Observer observer){
        observers.add(observer);
    }
    public  void removed(Observer observer){
        observers.remove(observer);
    }

    public void notifyObserver(){
        for (Observer obs:observers)
             {
                 System.out.println("Updated :"+obs.toString());
        }
    }

    @Override
    public String toString() {
        return "Subject{" +
                "observers=" + observers +
                '}';
    }
}

public class ObserverPatternExample {

    public static void main(String[] args) {
        Subject subject=new Subject();
        Observer ob=new ConcreteObserver();
        Observer ob2=new ConcreteObserver();
        subject.attached(ob);
        subject.attached(ob2);
        subject.notifyObserver();
    }
}
