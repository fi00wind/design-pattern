package cn.coolwind.design.singleton;

/**
 * 单例-懒汉式
 */
public class LhSingleton {
    public static volatile LhSingleton instance;

    private LhSingleton() {
    }

    public static LhSingleton getInstance() {
        if (instance == null) {
            synchronized (LhSingleton.class) {
                if (instance == null) {
                    instance = new LhSingleton();
                }
            }
        }
        return instance;
    }
}
