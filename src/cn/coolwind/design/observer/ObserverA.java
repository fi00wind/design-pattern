package cn.coolwind.design.observer;

public class ObserverA implements Observer {
    @Override
    public void update() {
        System.out.println("ObserverA notify!");
    }
}
