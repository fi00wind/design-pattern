package cn.coolwind.design.Decorator;

public class DecoratorRun {
    public static void main(String[] args) {
        Target source = new Source();
        Target target = new Decorator(source);
        target.method();
    }
}
