package cn.coolwind.design.adapter;

public class AdapterRun {
    public static void main(String[] args) {
        //类的适配器模式
        System.out.println("************************类的适配器模式**************************");
        Target target = new ClassAdapater();
        target.method1();
        target.method2();
        //对象的适配器模式
        System.out.println("************************对象的适配器模式**************************");
        Source source = new Source();
        Target target1 = new ObjectAdapter(source);
        target1.method1();
        target.method2();
        //接口的适配器模式
        System.out.println("************************接口的适配器模式**************************");
        Target adapter = new TargetAdapter();
        adapter.method1();
        adapter.method2();
    }
}
