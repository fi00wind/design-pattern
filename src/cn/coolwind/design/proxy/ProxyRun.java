package cn.coolwind.design.proxy;

import java.lang.reflect.Proxy;

public class ProxyRun {

    public static void main(String[] args) {
        //静态代理
//        Book book = new ProxyBook();
//        book.read();
//        book.write();
        //动态代理
        Book realBook = new RealBook();
        DynamicProxy proxy = new DynamicProxy(realBook);
        ClassLoader classLoader = realBook.getClass().getClassLoader();
        Book proxyBook = (Book) Proxy.newProxyInstance(classLoader, new Class[]{Book.class}, proxy);
        proxyBook.write();
        proxyBook.read();
    }
}
