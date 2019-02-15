package cn.coolwind.design.adapter;

/**
 * 类的适配器模式
 */
public class ClassAdapater extends Source implements Target{


    @Override
    public void method2() {
        System.out.println("this is method2");
    }
}
