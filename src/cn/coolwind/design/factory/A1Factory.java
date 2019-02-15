package cn.coolwind.design.factory;

public class A1Factory implements Provider {
    @Override
    public A bulid() {
        return new A1();
    }
}
