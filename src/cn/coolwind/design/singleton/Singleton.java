package cn.coolwind.design.singleton;

public class Singleton {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(EhSingleton.getInstance());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(LhSingleton.getInstance());
        }
    }
}
