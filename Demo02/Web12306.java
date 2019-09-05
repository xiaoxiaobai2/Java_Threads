package Demo02;

public class Web12306 implements Runnable{
    private int num=30;//拥有的票数

    @Override
    public void run() {
        test03();
    }
    //加入 synchronized（同步） 当一个进程访问时，就上锁
    private synchronized void test01(){
        while (true){
            if (num<=0){
                return;//跳出线程
            }
            try {
                //模拟抢票延时，可能会出现BUG，后面解决
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "抢到了第" +num-- +"张票");
        }
    }
    //线程不安全
    private void test02(){
        while (true){
            if (num<=0){
                return;//跳出线程
            }
            try {
                //模拟抢票延时，可能会出现BUG，后面解决
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "抢到了第" +num-- +"张票");
        }
    }
    //线程安全的 锁定代码块  注意锁定一定要正确
    private void test03(){
        //this代表这份资源  就是当前的类
        synchronized (this){
            while (true){
                if (num<=0){
                    return;//跳出线程
                }
                try {
                    //模拟抢票延时，可能会出现BUG，后面解决
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "抢到了第" +num-- +"张票");
            }

        }
    }
}
