package cn.coolwind.design.proxy;

public class RealBook implements Book{

    @Override
    public void read() {
        System.out.println("read book!");
    }

    @Override
    public void write() {
        System.out.println("write book!");
    }
}
