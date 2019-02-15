package cn.coolwind.design.observer;

public class ObserverRun {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observerA = new ObserverA();
        Observer observerB = new ObserverB();
        subject.addObserver(observerA);
        subject.addObserver(observerB);
        subject.change();
    }
}
