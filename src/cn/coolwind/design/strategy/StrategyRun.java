package cn.coolwind.design.strategy;

public class StrategyRun {
    public static void main(String[] args) {
        Strategy add = new Add();
        Strategy sub = new Sub();
        int x = 9;
        int y = 3;
        Calculator calc = new Calculator();
        int addRes = calc.doCalc(x,y,add);
        System.out.println(x + "+" + y + "=" + addRes);
        int subRes = calc.doCalc(x,y,sub);
        System.out.println(x + "-" + y + "=" + subRes);
    }
}
