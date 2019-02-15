package cn.coolwind.design.proxy;

public class ProxyBook implements Book {
    private RealBook realBook;
    @Override
    public void read() {
        if (realBook == null) {
            realBook = new RealBook();
        }
        realBook.read();
    }

    @Override
    public void write() {
        if (realBook == null) {
            realBook = new RealBook();
        }
        realBook.write();
    }
}
