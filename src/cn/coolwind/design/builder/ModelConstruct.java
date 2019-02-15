package cn.coolwind.design.builder;

public class ModelConstruct {
    //只构建AC
    public Model buildAC(ModelBuilder builder) {
        builder.buildA();
        builder.buildC();
        return builder.buildModel();
    }

    //全部构建
    public Model buildABC(ModelBuilder builder) {
        builder.buildA();
        builder.buildB();
        builder.buildC();
        return builder.buildModel();
    }
}
