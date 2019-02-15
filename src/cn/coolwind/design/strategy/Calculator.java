package cn.coolwind.design.strategy;

public class Calculator {
    public int doCalc(int x, int y, Strategy strategy) {
        return strategy.cal(x, y);
    }
}
