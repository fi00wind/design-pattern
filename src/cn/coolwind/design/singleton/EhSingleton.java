package cn.coolwind.design.singleton;

/**
 * 单例-饿汉式
 */
public class EhSingleton {
    public static EhSingleton instance = new EhSingleton();

    private EhSingleton() {
    }

    public static EhSingleton getInstance() {
        return instance;
    }
}
