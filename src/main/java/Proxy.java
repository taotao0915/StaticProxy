/**
 * 代理类-只可以帮忙拿货，当然真实类也可以去拿货
 */
public class Proxy implements Subject {
    RealSubject realSubject;//代理类可以持有真实类的引用
    @Override
    public void takeGoods() {
        if(realSubject!=null){//真实类不为空（本人有空），可以让真实类（本人）去拿货，不需要代理
            realSubject.takeGoods();
        }
        System.out.println("代理类帮忙拿货");
    }

    @Override
    public void pay() {
        if(realSubject==null){
            realSubject = new RealSubject();
        }
        realSubject.pay();//付款只能由真实类去操作，代理不会帮你付款的，他只负责拿货
    }
}
