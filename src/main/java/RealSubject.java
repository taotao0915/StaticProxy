/**
 * 真实类
 */
public class RealSubject implements Subject{
    @Override
    public void takeGoods() {//可由代理去操作
        System.out.println("本人有空去拿货");
    }

    @Override
    public void pay() {//付款只能由真实类操作
        System.out.println("本人付款");
    }
}
