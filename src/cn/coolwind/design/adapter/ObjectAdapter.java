package cn.coolwind.design.adapter;

public class ObjectAdapter implements Target {
    private  Source source;

    public ObjectAdapter(Source source) {
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is method2");
    }
}
