
//静态代理-测试类
public class Test {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.takeGoods();
        subject.pay();
    }
}
