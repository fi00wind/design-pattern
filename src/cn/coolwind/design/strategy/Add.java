package cn.coolwind.design.strategy;

public class Add implements Strategy {
    @Override
    public int cal(int x, int y) {
        return x + y;
    }
}
