package cn.coolwind.design.factory;

public class NormalFactory {
    public A bulid(String type) {
        if ("A1".equals(type)) {
            return new A1();
        } else if ("A2".equals(type)) {
            return new A2();
        }else {
            System.out.println("没有对应的实现");
            return null;
        }
    }
}
