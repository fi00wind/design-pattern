package cn.coolwind.design.factory;

public class A2Factory implements Provider {
    @Override
    public A bulid() {
        return new A2();
    }
}
