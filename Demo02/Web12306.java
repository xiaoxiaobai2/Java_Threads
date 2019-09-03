package Demo02;

public class Web12306 implements Runnable{
    private int num=100;//拥有的票数

    @Override
    public void run() {
        while (true){
            if (num<=0){
                break;//跳出线程
            }
            System.out.println(Thread.currentThread().getName() + "抢到了第" +num-- +"张票");
        }
    }
}
