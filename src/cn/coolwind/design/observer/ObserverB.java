package cn.coolwind.design.observer;

public class ObserverB implements Observer {
    @Override
    public void update() {
        System.out.println("ObserverB notify!");
    }
}
