package cn.coolwind.design.factory;

public class MultiFactory {
    public A bulidA1() {
        return new A1();
    }

    public A bulidA2() {
        return new A2();
    }
}
