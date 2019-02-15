package cn.coolwind.design.factory;

public class FactoryRun {
    public static void main(String[] args) {
        //普通的工厂：
        NormalFactory normalFactory = new NormalFactory();
        A a1 = normalFactory.bulid("A1");
        a1.method();
        A a2 = normalFactory.bulid("A2");
        a2.method();
        A a3 = normalFactory.bulid("A3");
        //多个工厂
        MultiFactory multiFactory = new MultiFactory();
        A m1 = multiFactory.bulidA1();
        m1.method();
        A m2 = multiFactory.bulidA2();
        m2.method();
        //抽象工厂
        Provider provider1 = new A1Factory();
        A p1 = provider1.bulid();
        p1.method();
        Provider provider2 = new A2Factory();
        A p2 = provider2.bulid();
        p2.method();
    }
}
