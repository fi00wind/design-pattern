package cn.coolwind.design.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    //依赖的观察者
    private List<Observer> observers = new ArrayList<>();

    public void change() {
        System.out.println("subject has been change!");
        //通知给观察者
        notifyObserver();
    }


    public void addObserver(Observer observer){
        //添加观察者
        observers.add(observer);
    }

    private void notifyObserver() {
        for (Observer o :observers) {
            //观察者执行相应的方法
            o.update();
        }
    }
}
