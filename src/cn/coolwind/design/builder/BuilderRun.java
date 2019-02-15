package cn.coolwind.design.builder;

public class BuilderRun {
    public static void main(String[] args) {
        ModelConstruct mc = new ModelConstruct();
        Model m1 = mc.buildAC(new BuildMethod());
        System.out.println(m1);
        Model m2 = mc.buildABC(new BuildMethod());
        System.out.println(m2);
    }
}
