package cn.coolwind.design.builder;

public class BuildMethod implements ModelBuilder {
    private Model model;
    public BuildMethod() {
        model = new Model();
    }

    @Override
    public void buildA() {
        model.setA("A");
        System.out.println("buildA");
    }

    @Override
    public void buildB() {
        model.setB("B");
        System.out.println("buildB");
    }

    @Override
    public void buildC() {
        model.setC("C");
        System.out.println("buildC");
    }

    @Override
    public Model buildModel() {
        return model;
    }
}
