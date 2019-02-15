package cn.coolwind.design.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void change() {
        System.out.println("subject has been change!");
        notifyObserver();
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    private void notifyObserver() {
        for (Observer o :observers) {
            o.update();
        }
    }
}
