package cn.coolwind.design.Decorator;

public class Decorator implements Target {
    private Target source;

    public Decorator(Target source) {
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("hello world!!!!");
        source.method();
    }
}
